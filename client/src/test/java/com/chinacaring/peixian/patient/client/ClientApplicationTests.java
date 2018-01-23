package com.chinacaring.peixian.patient.client;

import com.chinacaring.common.exception.CommonException;
import com.chinacaring.peixian.patient.client.service.AppointmentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ClientApplicationTests {

	@Autowired
	private AppointmentService appointmentService;

	@Test
	public void contextLoads() {

	}


}
