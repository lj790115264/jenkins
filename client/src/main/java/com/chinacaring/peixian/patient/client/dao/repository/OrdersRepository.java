package com.chinacaring.peixian.patient.client.dao.repository;


import com.chinacaring.peixian.patient.client.dao.entity.Orders;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

public interface OrdersRepository extends JpaRepository<Orders, Integer> {

    Orders findByOrderNo(String orderNo);

    Page<Orders> findAll(Specification<Orders> where, Pageable pageable);
    Page<Orders> findAll(Pageable pageable);
    Orders findById(Integer id);
    List<Orders> findAllByPayTimeBetweenAndIsPaidAndIsRefund(Date begin, Date end, Integer isPaid, Integer isRefund);
}
