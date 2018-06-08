package com.chinacaring.peixian.patient.client.orders;

import com.chinacaring.common.exception.CommonException;
import com.chinacaring.peixian.patient.client.dao.entity.Orders;
import com.chinacaring.peixian.patient.client.dao.repository.OrdersRepository;
import com.chinacaring.peixian.patient.client.dto.check.CheckCompare;
import com.chinacaring.peixian.patient.client.dto.check.CheckCount;
import com.chinacaring.peixian.patient.client.dto.check.HisOrder;
import com.chinacaring.peixian.patient.client.enumeration.PayWay;
import com.chinacaring.peixian.patient.client.enumeration.TradeType;
import com.chinacaring.peixian.patient.client.service.HisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class CheckOrdersServiceOrdersImpl implements CheckOrdersService {

    @Autowired
    private HisService hisService;
    @Autowired
    private OrdersRepository ordersRepository;

    void setMoneyHis(CheckCount c, HisOrder h) {
        c.getTotalMoney().setHisVal(c.getTotalMoney().getHisVal() + h.getFee());
        c.getCount().setHisVal(c.getCount().getHisVal() + 1);
        if (null != h.getPayWay()) {
            if (h.getPayWay().equals(PayWay.WX)) {
                c.getWxMoney().setHisVal(c.getWxMoney().getHisVal() + h.getFee());
                c.getWxCount().setHisVal(c.getWxCount().getHisVal() + 1);
            }
            if (h.getPayWay().equals(PayWay.ALI)) {
                c.getAliMoney().setHisVal(c.getAliMoney().getHisVal() + h.getFee());
                c.getAliCount().setHisVal(c.getAliCount().getHisVal() + 1);
            }
        }
    }

    void setMoneyUs(CheckCount c, Orders o ) {
        c.getTotalMoney().setCaringVal(c.getTotalMoney().getCaringVal() + o.getAmount());
        c.getCount().setCaringVal(c.getCount().getCaringVal() + 1);
        if (null != o.getPayChannel()) {
            if (o.getPayChannel().indexOf("wx") > -1) {
                c.getWxMoney().setCaringVal(c.getWxMoney().getCaringVal() + o.getAmount());
                c.getWxCount().setCaringVal(c.getWxCount().getCaringVal() + 1);
            }
            if (o.getPayChannel().indexOf("ali") > -1) {
                c.getAliMoney().setCaringVal(c.getAliMoney().getCaringVal() + o.getAmount());
                c.getAliCount().setCaringVal(c.getAliCount().getCaringVal() + 1);
            }
        }
    }

    @Override
    public List<CheckCount> checkCount(Date begin, Date end) throws CommonException {

        List<HisOrder> hisList;
        hisList = hisService.getHisOrders(begin, end);
        List<Orders> orders = ordersRepository.findAllByPayTimeBetweenAndIsPaidAndIsRefund(begin, end, 1, 0);
        CheckCount total = new CheckCount();
        total.setName("总交易");
        CheckCount register = new CheckCount();
        register.setName("挂号");
        CheckCount recipe = new CheckCount();
        recipe.setName("门诊处方");
        CheckCount inbalance = new CheckCount();
        inbalance.setName("住院押金");
        for (HisOrder his: hisList) {
            // 如果这条记录his有钱
            if (null != his.getFee()) {
                setMoneyHis(total, his);
                if (his.getTradeType().equals((TradeType.REGISTER))) {
                    setMoneyHis(register, his);
                } else if (his.getTradeType().equals((TradeType.RECIPE))) {
                    setMoneyHis(recipe, his);
                } else if (his.getTradeType().equals(TradeType.INBALACNCE)) {
                    setMoneyHis(inbalance, his);
                }
            }
        }
        for (Orders order: orders) {
            if (null != order.getAmount()) {
                setMoneyUs(total, order);
                if (null != order.getType()) {
                    switch (order.getType()) {
                        case "clinic": setMoneyUs(recipe, order); break;
                        case "appointment": setMoneyUs(register, order); break;
                        case "inhos_pre_charge": setMoneyUs(inbalance, order); break;
                    }
                }
            }
        }
        List<CheckCount> checkCountList = new ArrayList();
        checkCountList.add(total);
        checkCountList.add(register);
        checkCountList.add(recipe);
        checkCountList.add(inbalance);
        return checkCountList;
    }

    void injectHisOrder(CheckCompare c, HisOrder hisOrder) {
        c.setHisInvoiceNo(hisOrder.getRecipe());
        c.setHisName(hisOrder.getName());
        c.setHisTradeMoney(hisOrder.getFee());
        c.setHisTradeTime(hisOrder.getTradeTime());
        c.setHisTradeType(hisOrder.getTradeType());
    }

    void injectPPPOrder(CheckCompare c, Orders order) {
        c.setChargeId(order.getChargeId());
        c.setName(order.getUsername());
        c.setInvoiceNo(order.getInvoiceNo());
        c.setTradeTime(order.getPayTime());
        String channel = order.getPayChannel();
        if (null != channel) {
            if (channel.indexOf("wx") > -1) {
                c.setPayWay(PayWay.WX);
            }
            if (channel.indexOf("ali") > -1) {
                c.setPayWay(PayWay.ALI);
            }
        }
        if (null != order.getType()) {
            switch (order.getType()) {
                case "clinic": c.setTradeType(TradeType.RECIPE); break;
                case "appointment": c.setTradeType(TradeType.REGISTER); break;
                case "inhos_pre_charge": c.setTradeType(TradeType.INBALACNCE); break;
            }
        }

        c.setTradeMoney(order.getAmount());
    }

    @Override
    public List<CheckCompare> longMoney(Date begin, Date end) throws CommonException {
        // 左边代表我们这边 右边代表his
        List<HisOrder> hisList = hisService.getHisOrders(begin, end);
        List<Orders> orders = ordersRepository.findAllByPayTimeBetweenAndIsPaidAndIsRefund(begin, end, 1, 0);
        int i = 0;
        List<CheckCompare> checkCompareList = new ArrayList<>();
        for (Orders order: orders) {
            CheckCompare c = new CheckCompare();
            // 相同的两笔订单钱是否相同
            boolean equal = false;
            injectPPPOrder(c, order);
            if (null == order.getInvoiceNo()) {
                // 如果没有发票号且未退款 则，记录下来
                if (order.getIsRefund() == 0) {
                    checkCompareList.add(c);
                }
                continue;
            }
            for (int n = i; n < hisList.size(); n++) {
                HisOrder hisOrder = hisList.get(n);
                // 处方号互相匹配代表同一次交易
                if (order.getInvoiceNo().equals(hisOrder.getRecipe())) {
                    // 把his的数据补充进来
                    injectHisOrder(c, hisOrder);
                    // 我们钱少或者相等都不是长款
                    if (order.getAmount() <= hisOrder.getFee()) {
                        equal = true;
                    }
                    // 下一个右边列表的循环从当前位置开始,
                    i = n;
                    break;
                }
                // 如果到最后了都没有匹配到，就从i的位置向前再匹配
                if (n == hisList.size() - 1) {
                    for (int k = i; k >= 0; k --) {
                        hisOrder = hisList.get(k);
                        if (order.getInvoiceNo().equals(hisOrder.getRecipe())) {
                            // 把his的数据补充进来
                            injectHisOrder(c, hisOrder);
                            // 我们钱少或者相等都不是长款
                            if (order.getAmount() <= hisOrder.getFee()) {
                                equal = true;
                            }
                            // 下一个右边列表的循环从当前位置开始,
                            i = k;
                            break;
                        }
                    }
                }
            }
            if (!equal) {
                checkCompareList.add(c);
            }
        }
        return checkCompareList;
    }

    @Override
    public List<CheckCompare> shortMoney(Date begin, Date end) throws CommonException {
        // 左边代表his（一层循环） 右边代表我们这边（二层）
        List<HisOrder> hisList = hisService.getHisOrders(begin, end);
        List<Orders> orders = ordersRepository.findAllByPayTimeBetweenAndIsPaidAndIsRefund(begin, end, 1, 0);
        int i = 0;
        List<CheckCompare> checkCompareList = new ArrayList<>();
        for (HisOrder hisOrder: hisList) {
            CheckCompare c = new CheckCompare();
            boolean equal = false;
            injectHisOrder(c, hisOrder);
            for (int n = i; n < orders.size(); n++) {
                Orders order = orders.get(n);
                if (null == order.getInvoiceNo()) {
                    continue;
                }
                // 处方号互相匹配代表同一次交易
                if (order.getInvoiceNo().equals(hisOrder.getRecipe())) {
                    // 把p++的数据补充进来
                    injectPPPOrder(c, order);
                    if (order.getAmount() >= hisOrder.getFee()) {
                        equal = true;
                    }
                    // 下一个右边列表的循环从当前位置开始,
                    i = n;
                    break;
                }
                // 如果到最后了都没有匹配到，就从i的位置向前再匹配
                if (n == hisList.size() - 1) {
                    for (int k = i; k >= 0; k --) {
                        order = orders.get(k);
                        if (order.getInvoiceNo().equals(hisOrder.getRecipe())) {
                            // 把his的数据补充进来
                            injectPPPOrder(c, order);
                            // 我们钱多或者相等都不是短款
                            if (order.getAmount() >= hisOrder.getFee()) {
                                equal = true;
                            }
                            // 下一个右边列表的循环从当前位置开始,
                            i = k;
                            break;
                        }
                    }
                }
            }
            if (!equal) {
                checkCompareList.add(c);
            }
        }
        return checkCompareList;
    }
}
