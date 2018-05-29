package com.chinacaring.peixian.patient.client.dao.mapper;

import com.chinacaring.peixian.patient.client.dao.entity.OrdersPayData;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface OrderMapper {

    @Select("select id, pay_data from \n" +
            "(select * from orders where charge_id is null) as a left join \n" +
            "(select pay_data, order_no from appointment\n" +
            "union select pay_data, order_no from inbalance\n" +
            "UNION select pay_data, order_no from outpatient) as b\n" +
            "on a.order_no = b.order_no")
    List<OrdersPayData> getPayData();
}
