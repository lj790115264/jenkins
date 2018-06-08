package com.chinacaring.peixian.patient.client.orders;

import com.chinacaring.common.exception.CommonException;
import com.chinacaring.common.vo.Result;
import com.chinacaring.common.vo.ResultStatusCode;
import com.chinacaring.peixian.patient.client.dao.entity.Orders;
import com.chinacaring.peixian.patient.client.dto.front.response.CheckOrderResponse;
import com.chinacaring.peixian.patient.client.dto.front.response.CheckResponse;
import com.chinacaring.peixian.patient.client.dto.pingpp.Refund;
import com.chinacaring.peixian.patient.client.dto.wechatpush.WechatPushResponse;
import com.chinacaring.peixian.patient.client.exception.SoapException;
import com.chinacaring.peixian.patient.client.service.WechatPushService;
import com.chinacaring.util.TimeUtil;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.logging.Logger;

/**
 * @author xjh1994
 * @date 2017/12/5
 * @intro 订单（后台管理系统）
 */
@RestController
@RequestMapping("order")
public class OrderController {

    @Autowired
    private OrdersService ordersService;

    @Autowired
    private WechatPushService wechatPushService;

    @Autowired
    private CheckOrdersService checkOrdersService;


    private Logger logger = Logger.getLogger(this.getClass().getName());

    /**
     * @param pageable
     * @param channel
     * @param is_paid
     * @param is_refund
     * @return
     */
    @GetMapping("")
    @ApiOperation("查看订单列表")
    public Object getOrders(@ApiIgnore @PageableDefault(value = 20, sort = {"createTime", "updateTime"}) Pageable pageable,
                            @RequestParam(required = false) String start_time,
                            @RequestParam(required = false) String end_time,
                            @RequestParam(required = false) String channel,
                            @RequestParam(required = false) String type,
                            @RequestParam(required = false) Boolean is_paid,
                            @RequestParam(required = false) Boolean is_refund,
                            @RequestParam(required = false) Integer offline_refund_status,
                            HttpServletResponse response) throws ParseException, CommonException {

        Date startDate = null;
        Date endDate = null;
        if (!StringUtils.isEmpty(start_time)) {
            if (StringUtils.isEmpty(end_time)) {
                end_time = TimeUtil.getCurrentTime();
            }

            startDate = TimeUtil.parseDate(start_time, TimeUtil.FORMAT_LONG);
            endDate = TimeUtil.parseDate(end_time, TimeUtil.FORMAT_LONG);
        }

        List<Orders> responses = ordersService.getOrders(pageable, startDate, endDate, channel, type, is_paid, is_refund, offline_refund_status, response);

        return new Result<>(responses);
    }


    @PostMapping("refund")
    @ApiOperation("发起退款")
    public Object refund(@Valid @RequestBody RefundRequest request) throws CommonException {
        Refund refund = ordersService.refund(request);
        String alipayUrl;
        String title;
        alipayUrl = refund.getFailureMsg();
        if (alipayUrl == null) {
            alipayUrl = "";
        }
        String newAlipayUrl = alipayUrl.replace("需要打开地址进行下一步退款操作: ", "");
        if (Objects.equals(alipayUrl, newAlipayUrl)){
            title = "微信退款通知";
        }else {
            title = "支付宝退款通知";
        }

        WechatPushResponse wechatPushResponse = wechatPushService.sendNews(newAlipayUrl, title, "财务后台主动退款");
        logger.info("\n后台主动退款\n");
        logger.info(wechatPushResponse.toString());

        if (refund != null) {
            return new Result<>(refund);
        } else {
            return new Result<>(ResultStatusCode.SYSTEM_ERR, "退款失败", null);
        }
    }

    @GetMapping("refund")
    @ApiOperation("退款列表")
    public Object getRefund(@RequestParam String charge_id) {
        List<Refund> refunds = ordersService.getRefundByChargeId(charge_id);
        return new Result<>(refunds);
    }

    @GetMapping("search")
    @ApiOperation("根据订单号搜索")
    public Object search(@RequestParam String order_no) throws CommonException {
        Orders order = ordersService.getOrderByOrderNo(order_no);

        return new Result<>(order);
    }

    /**
     * @param channel
     * @param is_paid
     * @param is_refund
     * @return
     */
    @GetMapping("total")
    @ApiOperation("查看订单列表")
    public Object getOrdersTotals(@RequestParam(required = false) String start_time,
                                  @RequestParam(required = false) String end_time,
                                  @RequestParam(required = false) String channel,
                                  @RequestParam(required = false) String type,
                                  @RequestParam(required = false) Boolean is_paid,
                                  @RequestParam(required = false) Integer offline_refund_status,
                                  @RequestParam(required = false) Boolean is_refund, HttpServletResponse response) throws ParseException, CommonException {

        Date startDate = null;
        Date endDate = null;
        if (!StringUtils.isEmpty(start_time)) {
            if (StringUtils.isEmpty(end_time)) {
                end_time = TimeUtil.getCurrentTime();
            }

            startDate = TimeUtil.parseDate(start_time, TimeUtil.FORMAT_LONG);
            endDate = TimeUtil.parseDate(end_time, TimeUtil.FORMAT_LONG);
        }

        OrderTotalResponse ordersTotal = ordersService.getOrdersTotal(startDate, endDate, channel, type, is_paid, is_refund, offline_refund_status, response);

        return new Result<>(ordersTotal);
    }

    /**
     * @param channel
     * @param is_paid
     * @param is_refund
     * @return
     */
    @GetMapping("excelname")
    @ApiOperation("查看订单列表")
    public Object getTheExcel(@RequestParam() String start_time,
                              @RequestParam(required = false) String end_time,
                              @RequestParam(required = false) String channel,
                              @RequestParam(required = false) String type,
                              @RequestParam(required = false) Boolean is_paid,
                              @RequestParam(required = false) Integer offline_refund_status,
                              @RequestParam(required = false) Boolean is_refund, HttpServletResponse response) throws ParseException, IllegalAccessException, NoSuchFieldException, IOException, CommonException {

        Date startDate = null;
        Date endDate = null;
        if (!StringUtils.isEmpty(start_time)) {
            if (StringUtils.isEmpty(end_time)) {
                end_time = TimeUtil.getCurrentTime();
            }

            startDate = TimeUtil.parseDate(start_time, TimeUtil.FORMAT_LONG);
            endDate = TimeUtil.parseDate(end_time, TimeUtil.FORMAT_LONG);
        }

        return new Result<>(ordersService.generateTheExcel(startDate, endDate, channel, type, is_paid, is_refund, offline_refund_status, response));

    }

    @GetMapping("excel/{excel_name}/a")
    public Object downloadTheExcel(@PathVariable("excel_name") String excelName) throws CommonException {
        return ordersService.downloadTheExcel(excelName);
    }

    @PostMapping("sync")
    public Object sync() throws CommonException {


        ordersService.sync();
        return new Result<>();
    }

    /**
     * 统计+长款+短款
     * @param start_time
     * @param end_time
     * @return
     * @throws ParseException
     * @throws CommonException
     */
    @GetMapping("check/order")
    public Object checkOrder(@RequestParam() String start_time,
                             @RequestParam(required = false) String end_time) throws ParseException, CommonException {

        Date startDate,
                endDate;
        startDate = TimeUtil.parseDate(start_time, TimeUtil.YYYY_MM_DD);
        if (null != end_time) {
            endDate = TimeUtil.parseDate(end_time, TimeUtil.YYYY_MM_DD);
        } else {
            endDate = new Date();
        }
        Result result = new Result();
        CheckOrderResponse checkOrderResponse = new CheckOrderResponse();
        checkOrderResponse.setCount(checkOrdersService.checkCount(startDate, endDate));
        checkOrderResponse.setCheckLong(checkOrdersService.longMoney(startDate, endDate));
        checkOrderResponse.setCheckShort(checkOrdersService.shortMoney(startDate, endDate));

        result.setData(checkOrderResponse);
        return result;
    }

    /**
     * 统计
     * @param start_time
     * @param end_time
     * @return
     * @throws ParseException
     * @throws CommonException
     */
    @GetMapping("check/count")
    public Object checkCount(@RequestParam() String start_time,
                             @RequestParam(required = false) String end_time) throws ParseException, CommonException {

        Date startDate,
                endDate;
        startDate = TimeUtil.parseDate(start_time, TimeUtil.FORMAT_LONG);
        if (null != end_time) {
            endDate = TimeUtil.parseDate(end_time, TimeUtil.FORMAT_LONG);
        } else {
            endDate = new Date();
        }

        return new Result(checkOrdersService.checkCount(startDate, endDate));
    }

    /**
     * 长款
     * @param start_time
     * @param end_time
     * @return
     * @throws ParseException
     * @throws CommonException
     */
    @GetMapping("check/long")
    public Object checkLong(@RequestParam() String start_time,
                             @RequestParam(required = false) String end_time) throws ParseException, CommonException {

        Date startDate,
                endDate;
        startDate = TimeUtil.parseDate(start_time, TimeUtil.FORMAT_LONG);
        if (null != end_time) {
            endDate = TimeUtil.parseDate(end_time, TimeUtil.FORMAT_LONG);
        } else {
            endDate = new Date();
        }

        return new Result(checkOrdersService.longMoney(startDate, endDate));
    }

    /**
     * 短款
     * @param start_time
     * @param end_time
     * @return
     * @throws ParseException
     * @throws CommonException
     */
    @GetMapping("check/short")
    public Object checkShort(@RequestParam() String start_time,
                             @RequestParam(required = false) String end_time) throws ParseException, CommonException {

        Date startDate,
                endDate;
        startDate = TimeUtil.parseDate(start_time, TimeUtil.FORMAT_LONG);
        if (null != end_time) {
            endDate = TimeUtil.parseDate(end_time, TimeUtil.FORMAT_LONG);
        } else {
            endDate = new Date();
        }

        return new Result(checkOrdersService.shortMoney(startDate, endDate));
    }
}
