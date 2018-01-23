package com.chinacaring.peixian.patient.client.wsdl;

import com.chinacaring.peixian.patient.client.wsdl.request.QuyiServiceNo;
import com.chinacaring.peixian.patient.client.wsdl.request.QuyiServiceNoSoap;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SoapConfiguration {

    @Bean
    public QuyiServiceNo webService() {
        return new QuyiServiceNo();
    }
}
