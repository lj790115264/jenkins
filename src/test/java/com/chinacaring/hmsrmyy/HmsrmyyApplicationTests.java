package com.chinacaring.hmsrmyy;

import com.chinacaring.common.exception.CommonException;
import com.chinacaring.hmsrmyy.service.BaseInfoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HmsrmyyApplicationTests {

	@Autowired
	private BaseInfoService baseInfoService;

	@Test
	public void contextLoads() {
	}

	@Test
	public void test() throws CommonException {
		baseInfoService.getExistProfile("410323199407104513");
	}

}
