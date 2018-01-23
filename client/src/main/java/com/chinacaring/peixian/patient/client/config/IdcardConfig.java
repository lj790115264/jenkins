package com.chinacaring.peixian.patient.client.config;

import com.chinacaring.util.IdCardUtil;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class IdcardConfig {

    @Bean
    IdCardUtil getIdCardUtil(){
        return new IdCardUtil();
    }
}
