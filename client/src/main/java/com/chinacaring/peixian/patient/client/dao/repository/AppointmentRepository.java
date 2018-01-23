package com.chinacaring.peixian.patient.client.dao.repository;

import com.chinacaring.peixian.patient.client.dao.entity.Appointment;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AppointmentRepository extends JpaRepository<Appointment, Integer> {

    List<Appointment> findAllByType(Integer type);

    Appointment findOneByOrderNo(String orderNo);

    Appointment findByUserIdAndRegisterIdAndIdCard(Integer userId, String registerId, String idCard);

    List<Appointment> findAllByUserId(Integer userId, Sort sort);

    List<Appointment> findAllByRegState(Integer state);

    List<Appointment> findAllByPatientCodeAndUserId(String patientCode, Integer userId, Sort sort);

    List<Appointment> findAllByPatientCodeAndUserIdAndPayStateAndRegisterIdNotNull(String patientCode, Integer
            userId, Integer payState, Sort sort);

    List<Appointment> findAllByIdCardAndUserIdAndPayState(String idCard, Integer userId, Integer payState);
}
