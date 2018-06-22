package com.chinacaring.peixian.patient.client.orders;

import com.chinacaring.common.exception.CommonException;
import com.chinacaring.common.vo.ResultStatusCode;
import com.chinacaring.peixian.patient.client.config.Constant;
import com.chinacaring.peixian.patient.client.dao.entity.Orders;
import com.chinacaring.peixian.patient.client.dao.repository.OrdersRepository;
import com.chinacaring.peixian.patient.client.dto.pingpp.ChargeResponse;
import com.chinacaring.peixian.patient.client.dto.pingpp.PingxxRefundRequest;
import com.chinacaring.peixian.patient.client.dto.pingpp.Refund;
import com.chinacaring.peixian.patient.client.exception.SoapException;
import com.chinacaring.peixian.patient.client.wsdl.orders.request.QuyiServiceNo;
import com.chinacaring.peixian.patient.client.wsdl.orders.response.get_order_infoby_opercode.GetOrderInfoByOperCode;
import com.chinacaring.util.JaxbXmlUtil;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.apache.poi.hssf.usermodel.HSSFDataFormat;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.InputStreamResource;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.persistence.criteria.*;
import javax.servlet.http.HttpServletResponse;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @author xjh1994
 * @date 2017/12/5
 * @intro
 */
@Service
public class OrdersServiceImpl implements OrdersService {

    private Logger logger = LoggerFactory.getLogger(OrdersServiceImpl.class);

    @Autowired
    private ChargeFeignService chargeFeignService;

    @Autowired
    private OrdersRepository ordersRepository;

    @Autowired
    private QuyiServiceNo service;

    /**
     * 根据开始时间结束时间获取这个时间段内his的订单数据
     * @param startDate
     * @param endDate
     * @return
     * @throws CommonException
     */
    public List<GetOrderInfoByOperCode> getHisOrders(Date startDate, Date endDate) throws CommonException, SoapException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String res = null;
        try {
            res = service.getQuyiServiceNoSoap().getOrderInfoByOperCode("099020", sdf.format(startDate), sdf.format(endDate));
        } catch(Exception e) {
            e.printStackTrace();
        }

        GetOrderInfoByOperCode soap;
        try {
            soap = JaxbXmlUtil.convertToJavaBean(res, GetOrderInfoByOperCode.class);
        } catch (Exception e) {
            throw new SoapException("暂无订单记录!!", res, "099020" + sdf.format(startDate) + sdf.format(endDate));
        }
        if (!Objects.equals(Constant.RETURN_CODE_SUCCESS, soap.getResult().getReturnCode())) {
            throw new SoapException("暂无订单记录!", soap.getResult().getReturnDesc(), "099020" + sdf.format(startDate) + sdf.format(endDate));
        }
        if (Objects.isNull(soap.getData().getGetOrderInfoByOperCode()) || soap.getData().getGetOrderInfoByOperCode().isEmpty()) {
            throw new CommonException("暂无订单记录");
        }
        return soap.getData().getGetOrderInfoByOperCode();
    }


    @Override
    public List<Orders> getOrders(Pageable pageable, Date startDate, Date endDate, String channel, String type,
                                  Boolean paid, Boolean refunded, Integer offline_refund_status, HttpServletResponse
                                          response) throws CommonException, ParseException, SoapException {
        Page<Orders> ordersPage = ordersRepository.findAll(where(startDate, endDate, channel, type, paid, refunded,
                offline_refund_status), pageable);

        long totalElements = ordersPage.getTotalElements();
        response.addHeader("X-Total-Count", String.valueOf(totalElements));

        List<Orders> ordersList = ordersPage.getContent();

        List<GetOrderInfoByOperCode> hisOrders = getHisOrders(startDate, endDate);

        String myInvoiceNo,
                hisInvoiceNo,
                refundStatus;
        GetOrderInfoByOperCode hisOrder;

        for (Orders orders: ordersList) {

            myInvoiceNo = orders.getInvoiceNo();
            if (null == myInvoiceNo) {
                continue;
            }
            for (int i = 0; i < hisOrders.size(); i++) {

                hisOrder = hisOrders.get(i);
                hisInvoiceNo = hisOrder.getRECEIPTNUM();
                // 如果订单号互相匹配， 就把his的退款状态设置在我们这里，并把这条his的记录的数组中删除
                if (myInvoiceNo.equals(hisInvoiceNo)) {

                    refundStatus = hisOrder.getREFUNDSTATUS();
                    if (null != hisOrder.getREFUNDFEE()) {
                        orders.setOfflineRefundAmount(Double.valueOf(hisOrder.getREFUNDFEE()));
                    }

                    if (null == refundStatus) {
                        orders.setOfflineRefundStatus(-1);
                    } else if ("2".equals(refundStatus)) {
                        orders.setOfflineRefundStatus(1);
                    } else {
                        orders.setOfflineRefundStatus(0);
                    }

                    hisOrders.remove(i);
                    break;
                }
            }
        }

        return ordersList;
    }

    @Override
    public Refund refund(RefundRequest request) throws CommonException {
        Orders orders = ordersRepository.findByOrderNo(request.getOrder_no());
        if (null == orders || StringUtils.isEmpty(orders.getChargeId())) {
            throw new CommonException("该订单没有charge_id", ResultStatusCode.WEBSERVICE_WRONG_RESPONSE);
        }

        PingxxRefundRequest pingxxRequest = new PingxxRefundRequest();
        pingxxRequest.setAmount(request.getAmount());
        pingxxRequest.setCharge_id(orders.getChargeId());
        pingxxRequest.setDescription(request.getDescription());
        pingxxRequest.setFunding_source(request.getFunding_source());
        String res =  chargeFeignService.refund1(ChargeFeignService.AUTHORIZATION, pingxxRequest);
        Gson gson = new Gson();
        Refund refund = gson.fromJson(res, Refund.class);
        return refund;
    }

    @Override
    public Orders getOrderByOrderNo(String order_no) throws CommonException {
        Orders orders = ordersRepository.findByOrderNo(order_no);
        return orders;
    }

    @Override
    public List<Refund> getRefundByChargeId(String charge_id) {
        String res = chargeFeignService.getRefund(ChargeFeignService.AUTHORIZATION, charge_id);
        Gson gson = new Gson();
        List<Refund> refund = gson.fromJson(res, new TypeToken<List<Refund>>(){}.getType());
        return refund;
    }

    @Override
    public OrderTotalResponse getOrdersTotal(Date startDate, Date endDate, String channel, String type, Boolean paid,
                                             Boolean refunded, Integer offline_refund_status, HttpServletResponse
                                                     response) throws CommonException, ParseException, SoapException {
        List<Orders> orders = getOrders(null, startDate, endDate, channel, type, paid, refunded,
                offline_refund_status, response);
        BigDecimal totalMon = new BigDecimal(0);
        BigDecimal paidMon = new BigDecimal(0);
        BigDecimal refundedMon = new BigDecimal(0);
        Integer totalQuantity = 0;
        Integer paidQuantity = 0;
        Integer refundedQuantity = 0;
        for (Orders order : orders) {

            Integer amount = order.getAmount();
            if (Objects.isNull(amount)) {
                amount = 0;
            }
            BigDecimal amountDecimal = new BigDecimal(amount);

            totalMon = totalMon.add(amountDecimal);
            totalQuantity++;
            if (Objects.equals(order.getIsPaid(), 1)) {
                //如果一笔订单 已支付并且已退款 则 真实状态 为 已退款
                if (Objects.equals(order.getIsRefund(), 1)) {
                    refundedMon = refundedMon.add(amountDecimal);
                    refundedQuantity++;
                } else {
                    paidMon = paidMon.add(amountDecimal);
                    paidQuantity++;
                }
            }
        }

        TotalResponse total = new TotalResponse();
        TotalResponse payTotal = new TotalResponse();
        TotalResponse refundTotal = new TotalResponse();
        DecimalFormat df = new DecimalFormat(",##0.00");
        total.setQuantity(totalQuantity);
        total.setTotal(df.format(totalMon.divide(new BigDecimal(100))));
        payTotal.setQuantity(paidQuantity);
        payTotal.setTotal(df.format(paidMon.divide(new BigDecimal(100))));
        refundTotal.setQuantity(refundedQuantity);
        refundTotal.setTotal(df.format(refundedMon.divide(new BigDecimal(100))));
        return new OrderTotalResponse(total, payTotal, refundTotal);
    }

    @Override
    public ExcelNameResponse generateTheExcel(Date startDate, Date endDate, String channel, String type, Boolean
            paid, Boolean refunded, Integer offline_refund_status, HttpServletResponse response) throws
            NoSuchFieldException, IllegalAccessException, IOException, CommonException, ParseException, SoapException {
        List<Orders> orders = getOrders(null, startDate, endDate, channel, type, paid, refunded,
                offline_refund_status, response);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Workbook workbook = new HSSFWorkbook();
        String startDateString = sdf.format(startDate);
        String endDateString = sdf.format(endDate);

        Sheet sheet = workbook.createSheet("支付订单-" + startDateString + "~" + endDateString);
        Row row0 = sheet.createRow(0);
        Cell cell00 = row0.createCell(0);
        cell00.setCellValue("交易明细导出");
        Row row1 = sheet.createRow(1);
        Cell cell10 = row1.createCell(0);
        cell10.setCellValue("导出时间：" + sdf1.format(new Date()));
        Row row2 = sheet.createRow(2);
        Cell cell20 = row2.createCell(0);
        cell20.setCellValue("起始日期:[" + startDateString + "]  终止日期:[" + endDateString + "]");

        //创建展示所需的标题和对应 域的名称
        Map<String, String> map = new LinkedHashMap<>();
        map.put("createTime", "创建时间");
        map.put("orderNo", "订单号");
        map.put("isPaid", "支付状态");
        map.put("payChannel", "支付渠道");
        map.put("isRefund", "线上退款情况");
        map.put("amountRefunded", "线上退款金额（元）");
        map.put("offlineRefundStatus", "线下退款情况");
        map.put("offlineRefundAmount", "线下退款金额（元）");
        map.put("amount", "支付金额（元）");
        map.put("type", "订单类型");

        //写入标题
        Row row3 = sheet.createRow(3);
        Integer row3i = 0;
        for (String s : map.values()) {
            Cell cell3i = row3.createCell(row3i);
            cell3i.setCellValue(s);
            row3i++;
        }
        //从第四行开始写入数据
        Integer rowi = 4;
        CellStyle cellStyle = workbook.createCellStyle();
        cellStyle.setDataFormat(HSSFDataFormat.getBuiltinFormat("#,##0.00"));
        for (Orders order : orders) {
            Row row = sheet.createRow(rowi);
            int celli = 0;
            for (String key : map.keySet()) {
                Cell cell = row.createCell(celli);
                Field field = order.getClass().getDeclaredField(key);
                field.setAccessible(true);
                Object o = field.get(order);
                switch (key) {
                    case "createTime":
                        cell.setCellValue(sdf1.format((Timestamp) o));
                        break;
                    case "isPaid":
                        Integer isPaid = (Integer) o;
                        if (Objects.equals(isPaid, 1)) {
                            cell.setCellValue("已支付");
                        } else if (Objects.equals(isPaid, 0)) {
                            cell.setCellValue("未支付");
                        } else {
                            cell.setCellValue("状态未知");
                        }
                        break;
                    case "isRefund":
                        Integer isRefund = (Integer) o;
                        if (Objects.equals(isRefund, 1)) {
                            cell.setCellValue("有退款");
                        } else if (Objects.equals(isRefund, 0)) {
                            cell.setCellValue("无退款");
                        } else {
                            cell.setCellValue("状态未知");
                        }
                        break;
                    case "offlineRefundAmount":

                        Double offlineRefundAmount = 0.00;
                        if (Objects.nonNull(o)) {
                            offlineRefundAmount = (Double) o;
                        }
                        cell.setCellValue(offlineRefundAmount / 100.0);
                        cell.setCellStyle(cellStyle);
                        break;
                    case "amountRefunded":
                        Integer amountRefunded = 0;
                        if (Objects.nonNull(o)) {
                            amountRefunded = (Integer) o;
                        }
                        cell.setCellValue(amountRefunded / 100.0);
                        cell.setCellStyle(cellStyle);
                        break;
                    case "offlineRefundStatus":
                        Integer offlineRefundStatus = 0;
                        if (Objects.nonNull(o)) {
                            offlineRefundStatus = (Integer) o;
                        }
                        if (Objects.equals(offlineRefundStatus, 1)) {
                            cell.setCellValue("有退款");
                        } else if (Objects.equals(offlineRefundStatus, 0)) {
                            cell.setCellValue("无退款");
                        } else {
                            cell.setCellValue("状态未知");
                        }
                        break;
                    case "amount":
                        Integer amount = (Integer) o;
                        cell.setCellValue(amount / 100.0);
                        cell.setCellStyle(cellStyle);
                        break;
                    case "type":
                        String typeString = (String) o;
                        if (Objects.equals(typeString, "appointment")) {
                            cell.setCellValue("预约挂号");
                        } else if (Objects.equals(typeString, "clinic")) {
                            cell.setCellValue("门诊支付");
                        } else if (Objects.equals(typeString, "inhos_pre_charge")) {
                            cell.setCellValue("住院预交金充值");
                        } else {
                            cell.setCellValue("状态未知");
                        }
                        break;
                    case "payChannel":
                        String patChannel = (String) o;
                        if (Objects.equals(patChannel, "alipay")) {
                            cell.setCellValue("支付宝APP支付");
                        } else if (Objects.equals(patChannel, "alipay_wap")) {
                            cell.setCellValue("支付宝网页支付");
                        } else if (Objects.equals(patChannel, "wx")) {
                            cell.setCellValue("微信APP支付");
                        } else if (Objects.equals(patChannel, "wx_pub")) {
                            cell.setCellValue("微信公众号支付");
                        } else if (Objects.equals(patChannel, "wx_wap")) {
                            cell.setCellValue("微信H5支付");
                        } else if (Objects.equals(patChannel, "offline")) {
                            cell.setCellValue("线下支付");
                        }
                        break;
                    default:
                        cell.setCellValue((String) o);
                        break;
                }

                celli++;
            }
            rowi++;
        }

        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyyMMddHHmmss");
        String fileName = sdf2.format(new Date()) + "-orders.xls";
        //写入文件
        FileOutputStream outputStream = new FileOutputStream(fileName);
        workbook.write(outputStream);
        outputStream.flush();
        outputStream.close();
        return new ExcelNameResponse(fileName);
    }

    @Override
    public ResponseEntity<InputStreamResource> downloadTheExcel(String fileName) throws CommonException {
        System.out.println(fileName);
        try {
            FileSystemResource file = new FileSystemResource(fileName);
            HttpHeaders headers = new HttpHeaders();
            headers.add("Cache-Control", "no-cache, no-store, must-revalidate");
            headers.add("Content-Disposition", String.format("attachment; filename=\"%s\"", file.getFilename()));
            headers.add("Pragma", "no-cache");
            headers.add("Expires", "0");

            return ResponseEntity
                    .ok()
                    .headers(headers)
                    .contentLength(file.contentLength())
                    .contentType(MediaType.parseMediaType("application/octet-stream"))
                    .body(new InputStreamResource(file.getInputStream()));
        } catch (Exception e) {
            e.printStackTrace();
            throw new CommonException("暂无相关文件！", ResultStatusCode.WEBSERVICE_WRONG_RESPONSE);
        }
    }

    @Override
    public void sync() throws CommonException {
        List<Orders> list = ordersRepository.findAll();

        Iterator<Orders> iterator = list.iterator();
        while (iterator.hasNext()) {
            Orders orders = iterator.next();
            //同步ping++支付/退款状态
            if (!StringUtils.isEmpty(orders.getChargeId())) {
                ChargeResponse charge = chargeFeignService.getCharge(ChargeFeignService.AUTHORIZATION, orders.getChargeId());
                if (charge != null) {
                    orders.setIsPaid(charge.isPaid() ? 1 : 0);
                    orders.setAmountRefunded(charge.getAmount_refunded());
                    orders.setIsRefund(charge.isRefunded() ? 1 : 0);
                    if (charge.getTime_paid() != null) {
                        orders.setPayTime(new Timestamp(charge.getTime_paid() * 1000));
                    }
                }
            }
        }

        ordersRepository.save(list);
    }

    private Specification<Orders> where(Date startDate, Date endDate, String channel, String type, Boolean paid,
                                        Boolean refunded, Integer offline_refund_status) {
        return new Specification<Orders>() {
            @Override
            public Predicate toPredicate(Root<Orders> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder
                    criteriaBuilder) {
                Predicate predicate = criteriaBuilder.conjunction();
                List<Expression<Boolean>> expressions = predicate.getExpressions();

                if (startDate != null && endDate != null) {
                    expressions.add(criteriaBuilder.between(root.get("createTime"), startDate, endDate));
                }

                if (!StringUtils.isEmpty(channel)) {
                    expressions.add(criteriaBuilder.equal(root.<String>get("payChannel"), channel));
                }

                if (!StringUtils.isEmpty(type)) {
                    expressions.add(criteriaBuilder.equal(root.<String>get("type"), type));
                }

                if (paid != null) {
                    expressions.add(criteriaBuilder.equal(root.<Integer>get("isPaid"), paid ? 1 : 0));
                }

                if (refunded != null) {
                    expressions.add(criteriaBuilder.equal(root.<Integer>get("isRefund"), refunded ? 1 : 0));
                }

                if (offline_refund_status != null) {
                    expressions.add(criteriaBuilder.equal(root.<Integer>get("offlineRefundStatus"),
                            offline_refund_status));
                }

                return predicate;
            }
        };
    }
}
