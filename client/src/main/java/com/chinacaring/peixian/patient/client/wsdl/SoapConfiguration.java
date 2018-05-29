package com.chinacaring.peixian.patient.client.wsdl;

import com.chinacaring.peixian.patient.client.wsdl.request.QuyiServiceNo;
import com.chinacaring.peixian.patient.client.wsdl.request.WebServiceCallInterface;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SoapConfiguration {

    @Bean
    public QuyiServiceNo webService() {
        return new QuyiServiceNo();
    }

    @Bean
    public WebServiceCallInterface queueWebservice() {
        return new WebServiceCallInterface();
    }

    @Bean()
    public com.chinacaring.peixian.patient.client.wsdl.orders.request.QuyiServiceNo formalWebservice() {
        return new com.chinacaring.peixian.patient.client.wsdl.orders.request.QuyiServiceNo();
    }
}
