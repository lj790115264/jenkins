package com.chinacaring.peixian.patient.client.controller;

import com.chinacaring.common.exception.CommonException;
import com.chinacaring.common.vo.Result;
import com.chinacaring.common.vo.ResultStatusCode;
import com.chinacaring.peixian.patient.client.config.Constant;
import com.chinacaring.peixian.patient.client.dao.entity.Orders;
import com.chinacaring.peixian.patient.client.dao.repository.AppointmentRepository;
import com.chinacaring.peixian.patient.client.dao.repository.OrdersRepository;
import com.chinacaring.peixian.patient.client.dto.pingpp.PayResponse;
import com.chinacaring.peixian.patient.client.service.AppointmentService;
import com.chinacaring.peixian.patient.client.service.InbalanceService;
import com.chinacaring.peixian.patient.client.service.OutPatientService;
import com.chinacaring.peixian.patient.client.service.RefundService;
import com.chinacaring.peixian.patient.client.utils.WebhooksUtils;
import com.chinacaring.util.JacksonUtil;
import com.pingplusplus.model.Event;
import com.pingplusplus.model.Webhooks;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author xjh1994
 * @date 2017/10/16
 * @intro
 */
@RestController
@RequestMapping("webhooks")
public class WebhookController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @PostMapping("register")
    public Object registerWebhook(@RequestBody String data, HttpServletRequest request, HttpServletResponse response) throws CommonException {
        Event event = Webhooks.eventParse(data);
        String signature = request.getHeader("x-pingplusplus-signature");
        logger.info("signature：" + signature);

        //验证签名。重要！！！
        if (!WebhooksUtils.verify(data, signature)) {
            return new Result<>(ResultStatusCode.SYSTEM_ERR, "签名验证失败", null);
        }

        logger.info(event.toString());

        switch (event.getType()) {
            case "charge.succeeded":
                // 开发者在此处加入对支付异步通知的处理代码
                
                callbackHandler(event, response);
                break;
            case "refund.succeeded":
                // 开发者在此处加入对退款异步通知的处理代码
                response.setStatus(200);
                break;
            default:
                response.setStatus(400);
                break;
        }

        return new Result<>();
    }

    @Autowired
    private AppointmentRepository appointmentRepository;

    @Autowired
    private OrdersRepository ordersRepository;

    @Autowired
    private RefundService refundService;

    @Autowired
    private AppointmentService appointmentService;

    @Autowired
    private OutPatientService outPatientService;

    @Autowired
    private InbalanceService inbalanceService;

    /**
     * 支付成功后进行挂号
     * @param event
     * @param response
     */
    private void callbackHandler(Event event, HttpServletResponse response) throws CommonException {
        String result = event.getData().getObject().toString();
        PayResponse charge = JacksonUtil.toObject(result, PayResponse.class);
        String orderNo = charge.getOrder_no();

        if (StringUtils.isEmpty(orderNo)) {
            throw new CommonException("订单号不能为空");
        }

        //根据order no 去订单总表中 获取 对应的订单类型 和 对应表的 关联 id
        Orders orderByOrderNo = ordersRepository.findByOrderNo(orderNo);
        if (null == orderByOrderNo){
            throw new CommonException("无对应订单信息");
        }

        switch (orderByOrderNo.getType()){

            //预约挂号支付
            case Constant.ORDERS_APPOINTMENT:

                try {
                    appointmentService.doRegister(orderNo);
                    logger.info(orderNo + "挂号成功");
                } catch (CommonException e) {
                    e.printStackTrace();
                    //挂号失败。退款
                    refundService.refund(orderNo, Constant.ORDERS_APPOINTMENT, "退款原因" + e.getDetailMessage());
                    response.setStatus(500);
                    logger.info(orderNo + "挂号失败");
                }
                break;

            //门诊缴费
            case Constant.ORDERS_CLINIC:
                try {
                    outPatientService.doOutpatientConfirm(orderNo);
                    logger.info(orderNo + "门诊确认成功");
                } catch (CommonException e) {
                    e.printStackTrace();
                    //挂号失败。退款
                    refundService.refund(orderNo, Constant.ORDERS_CLINIC, "退款原因" + e.getDetailMessage());
                    response.setStatus(500);
                    logger.info(orderNo + "门诊确认成功");
                }
                break;

            //住院预交金
            case Constant.ORDERS_INHOS_PRE_CHARGE:
                try {
                    inbalanceService.doInbalanceConfirm(orderNo);
                    logger.info(orderNo + "住院预交金确认成功");
                } catch (CommonException e) {
                    e.printStackTrace();
                    //挂号失败。退款
                    refundService.refund(orderNo, Constant.ORDERS_INHOS_PRE_CHARGE, "退款原因" + e.getDetailMessage());
                    response.setStatus(500);
                    logger.info(orderNo + "住院预交金确认成功");
                }
                break;

            default: break;
        }



        response.setStatus(200);
    }






}
