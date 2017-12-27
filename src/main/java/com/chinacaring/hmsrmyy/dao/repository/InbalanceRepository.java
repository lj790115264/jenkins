package com.chinacaring.hmsrmyy.dao.repository;


import com.chinacaring.hmsrmyy.dao.entity.Inbalance;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface InbalanceRepository extends JpaRepository<Inbalance, Integer> {

    List<Inbalance> findByOrderNo(String orderNo);

    List<Inbalance> findAllByIdCardAndUserIdAndPayState(String idCard, Integer userId, Integer payState);
}
