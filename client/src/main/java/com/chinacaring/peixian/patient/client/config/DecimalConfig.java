package com.chinacaring.peixian.patient.client.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.text.DecimalFormat;

@Configuration
public class DecimalConfig {

    @Bean
    public DecimalFormat getTwoDecimal(){
        return new DecimalFormat("#0.00");
    }

}
