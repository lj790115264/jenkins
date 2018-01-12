package com.chinacaring.hmsrmyy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication(scanBasePackages = {"com.chinacaring"})
@MapperScan({"com.chinacaring.user.mapper", "com.chinacaring.user.dao.mapper"})
@EnableAsync
@EnableScheduling
public class HmsrmyyApplication {

	public static void main(String[] args) {
		SpringApplication.run(HmsrmyyApplication.class, args);
	}
}
