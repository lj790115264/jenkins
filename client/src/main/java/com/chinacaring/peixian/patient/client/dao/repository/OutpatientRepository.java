package com.chinacaring.peixian.patient.client.dao.repository;

import com.chinacaring.peixian.patient.client.dao.entity.Outpatient;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OutpatientRepository extends JpaRepository<Outpatient, Integer>{

    List<Outpatient> findByOrderNo(String orderNo);

    List<Outpatient> findAllByIdCardAndUserIdAndPayState(String idCard, Integer userId, Integer state);
}
