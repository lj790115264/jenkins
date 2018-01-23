package com.chinacaring.peixian.patient.client.dao.repository;


import com.chinacaring.peixian.patient.client.dao.entity.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdersRepository extends JpaRepository<Orders, Integer> {

    Orders findByOrderNo(String orderNo);
}
