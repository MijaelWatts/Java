package com.watts.spring.di.configuration;

import com.watts.spring.di.service.EmailService;
import com.watts.spring.di.service.MessageService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(value = {"com.watts.spring.di.consumer"})
public class DIConfiguration {

    @Bean
    public MessageService getMessageService() {
        return new EmailService();
    }

}
