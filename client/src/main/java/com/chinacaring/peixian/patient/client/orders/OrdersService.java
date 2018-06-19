package com.chinacaring.peixian.patient.client.orders;

import com.chinacaring.common.exception.CommonException;
import com.chinacaring.peixian.patient.client.dao.entity.Orders;
import com.chinacaring.peixian.patient.client.dto.pingpp.Refund;
import com.chinacaring.peixian.patient.client.exception.SoapException;
import com.chinacaring.peixian.patient.client.wsdl.orders.response.get_order_infoby_opercode.GetOrderInfoByOperCode;
import org.springframework.core.io.InputStreamResource;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.ParseException;
import java.util.Date;
import java.util.List;

/**
 * @author xjh1994
 * @date 2017/12/5
 * @intro 订单
 */
public interface OrdersService {

    List<GetOrderInfoByOperCode> getHisOrders(Date startDate, Date endDate) throws CommonException, SoapException;

    List<Orders> getOrders(Pageable pageable, Date startDate, Date endDate, String channel, String type, Boolean
            paid, Boolean refunded, Integer offline_refund_status, HttpServletResponse response) throws CommonException, ParseException, SoapException;

    Refund refund(RefundRequest request) throws CommonException;

    Orders getOrderByOrderNo(String order_no) throws CommonException;

    List<Refund> getRefundByChargeId(String charge_id);

    OrderTotalResponse getOrdersTotal(Date startDate, Date endDate, String channel, String type, Boolean paid,
                                      Boolean refunded, Integer offline_refund_status, HttpServletResponse response) throws CommonException, ParseException, SoapException;

    ExcelNameResponse generateTheExcel(Date startDate, Date endDate, String channel, String type, Boolean paid,
                                       Boolean refunded, Integer offline_refund_status, HttpServletResponse response) throws NoSuchFieldException, IllegalAccessException, IOException, CommonException, ParseException, SoapException;

    ResponseEntity<InputStreamResource> downloadTheExcel(String fileName) throws CommonException;

    void sync() throws CommonException;
}
