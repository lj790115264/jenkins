package com.chinacaring.peixian.patient.client;

import com.chinacaring.common.exception.CommonException;
import com.chinacaring.peixian.patient.client.config.Constant;
import com.chinacaring.peixian.patient.client.service.AppointmentService;
import com.chinacaring.peixian.patient.client.service.InbalanceService;
import com.chinacaring.peixian.patient.client.service.PayDataService;
import com.chinacaring.peixian.patient.client.service.RefundService;
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

	@Autowired
	private RefundService refundService;

	@Autowired
	private InbalanceService inbalanceService;

	@Autowired
	private PayDataService payDataService;

	@Test
	public void contextLoads() {
		refundService.refund("1520995047460ts116t7", Constant.ORDERS_CLINIC,"测试退款");
		refundService.refund("1520994919173rn3vrii", Constant.ORDERS_CLINIC,"测试退款");
	}


	@Test
	public void inbalance() throws CommonException {
		payDataService.updateChargeId();
	}
}
