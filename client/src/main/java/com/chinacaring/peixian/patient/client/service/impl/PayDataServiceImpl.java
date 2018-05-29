package com.chinacaring.peixian.patient.client.service.impl;

import com.chinacaring.peixian.patient.client.dao.entity.Orders;
import com.chinacaring.peixian.patient.client.dao.entity.OrdersPayData;
import com.chinacaring.peixian.patient.client.dao.mapper.OrderMapper;
import com.chinacaring.peixian.patient.client.dao.repository.OrdersRepository;
import com.chinacaring.peixian.patient.client.service.PayDataService;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

@Service
public class PayDataServiceImpl implements PayDataService {

    @Autowired
    private OrderMapper orderMapper;

    @Autowired
    private OrdersRepository ordersRepository;

    @Override
    public void updateChargeId() {
        Gson gson = new Gson();
        List<OrdersPayData> list = orderMapper.getPayData();
        List<Orders> orders = new ArrayList();
        for (OrdersPayData l: list) {
            Orders order = ordersRepository.findById(l.getId());
            Map map = gson.fromJson(l.getPayData(), Map.class);
            String chargeId = (String)map.get("id");
            order.setChargeId(chargeId);
            order.setInvoiceNo(l.getInvoiceNo());
            orders.add(order);
        }
        ordersRepository.save(orders);
    }
}
