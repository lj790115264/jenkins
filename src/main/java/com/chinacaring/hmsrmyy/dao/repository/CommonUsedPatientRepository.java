package com.chinacaring.hmsrmyy.dao.repository;


import com.chinacaring.hmsrmyy.dao.entity.CommonUsedPatient;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommonUsedPatientRepository extends JpaRepository<CommonUsedPatient, Integer> {

    CommonUsedPatient findByIdCardAndUserId(String idCard, Integer userId);

    List<CommonUsedPatient> findAllByUserIdAndState(Integer userId, Integer state);

    List<CommonUsedPatient> findAllByIdCardAndUserId(String idCard, Integer userId);

    CommonUsedPatient findByIdCardAndUserIdAndState(String idCard, Integer userId, Integer state);

    List<CommonUsedPatient> findByUserIdAndPatientCode(Integer userId, String patientCode);

}
