package com.chinacaring.hmsrmyy.dao.repository;

import com.chinacaring.hmsrmyy.dao.entity.Outpatient;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OutpatientRepository extends JpaRepository<Outpatient, Integer>{

    List<Outpatient> findByOrderNo(String orderNo);
}
