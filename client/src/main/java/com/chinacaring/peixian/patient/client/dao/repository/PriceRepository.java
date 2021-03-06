package com.chinacaring.peixian.patient.client.dao.repository;


import com.chinacaring.peixian.patient.client.dao.entity.Price;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PriceRepository extends JpaRepository<Price, Integer> {

    List<Price> findByItemNameLike(String itemName);

    Price findTopByItemCode(String itemCode);
}
