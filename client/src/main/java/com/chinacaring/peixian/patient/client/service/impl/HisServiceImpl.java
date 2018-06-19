package com.chinacaring.peixian.patient.client.service.impl;

import com.chinacaring.common.exception.CommonException;
import com.chinacaring.peixian.patient.client.dto.check.HisOrder;
import com.chinacaring.peixian.patient.client.enumeration.PayWay;
import com.chinacaring.peixian.patient.client.enumeration.TradeType;
import com.chinacaring.peixian.patient.client.exception.SoapException;
import com.chinacaring.peixian.patient.client.orders.OrdersService;
import com.chinacaring.peixian.patient.client.service.HisService;
import com.chinacaring.peixian.patient.client.wsdl.orders.response.get_order_infoby_opercode.GetOrderInfoByOperCode;
import com.chinacaring.util.TimeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 底层数据基础
 */
@Service
public class HisServiceImpl implements HisService {

    @Autowired
    private OrdersService ordersService;

    private static final ThreadLocal<List<HisOrder>> his = new ThreadLocal<>();

    @Override
    public List<HisOrder> getHisOrders(Date start, Date end) throws CommonException, SoapException {

        if (null != his.get()) {
            return his.get();
        }

        List<GetOrderInfoByOperCode> hisOrders;
        try {
            hisOrders = ordersService.getHisOrders(start, end);
        } catch (CommonException e) {
            hisOrders = new ArrayList<>();
        }

        List<HisOrder> iHisOrders = new ArrayList<>();
        for (GetOrderInfoByOperCode hisOrder: hisOrders) {
            HisOrder iHisOrder = new HisOrder();
            iHisOrder.setFee((int) (100 * Double.valueOf(hisOrder.getFEE())));
            iHisOrder.setName(hisOrder.getNAME());
            if (null != hisOrder.getPAYMODE()) {
                if ("wechat".equals(hisOrder.getPAYMODE())) {
                    iHisOrder.setPayWay(PayWay.WX);
                }
            }
            iHisOrder.setRecipe(hisOrder.getRECEIPTNUM());
            if (null != hisOrder.getRECIEPTTYPE()) {
                switch (hisOrder.getRECIEPTTYPE()) {
                    case "0": iHisOrder.setTradeType(TradeType.REGISTER); break;
                    case "1": iHisOrder.setTradeType(TradeType.RECIPE); break;
                    case "2": iHisOrder.setTradeType(TradeType.INBALACNCE); break;
                }
            }
            try {
                iHisOrder.setTradeTime(TimeUtil.parseDate(hisOrder.getTRANSTIME(), TimeUtil.FORMAT_LONG));
            } catch (ParseException e) {

            }
            iHisOrders.add(iHisOrder);
        }

        his.set(iHisOrders);

        return iHisOrders;
    }
}
