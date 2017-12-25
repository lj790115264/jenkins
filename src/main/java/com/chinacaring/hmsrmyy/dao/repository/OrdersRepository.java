package com.chinacaring.hmsrmyy.dao.repository;


import com.chinacaring.hmsrmyy.dao.entity.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdersRepository extends JpaRepository<Orders, Integer> {

    Orders findByOrderNo(String orderNo);
}
