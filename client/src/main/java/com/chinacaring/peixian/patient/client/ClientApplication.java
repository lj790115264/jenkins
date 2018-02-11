package com.chinacaring.peixian.patient.client;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.client.RestTemplate;

import java.net.Authenticator;
import java.net.InetSocketAddress;
import java.net.PasswordAuthentication;
import java.net.Proxy;

@SpringBootApplication(scanBasePackages = {"com.chinacaring"})
@MapperScan({"com.chinacaring.user.mapper", "com.chinacaring.user.dao.mapper"})
@EnableAsync
@EnableScheduling
@EnableDiscoveryClient
@EnableZuulProxy
@EnableFeignClients(basePackages = "com.chinacaring")
public class ClientApplication {

	@Bean(name = "proxy")
	public RestTemplate restTemplateProxy() {
		SimpleClientHttpRequestFactory requestFactory = new SimpleClientHttpRequestFactory();

		Proxy proxy= new Proxy(Proxy.Type.HTTP, new InetSocketAddress("172.17.10.89", 3128));
		requestFactory.setProxy(proxy);

		return new RestTemplate(requestFactory);
	}

	@Bean
	public RestTemplate restTemplate() {

		return new RestTemplate();
	}

	public static void main(String[] args) {

		SpringApplication.run(ClientApplication.class, args);

//		System.setProperty("http.proxyHost", "172.17.10.89");
//		System.setProperty("http.proxyPort", "3128");
//
//		Authenticator authenticator = new Authenticator() {
//			public PasswordAuthentication getPasswordAuthentication() {
//				return new PasswordAuthentication("caring", "chinacaring".toCharArray());
//			}
//		};
//
//		Authenticator.setDefault(authenticator);
	}
}
