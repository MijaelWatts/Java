package com.watts.spring.di.consumer;

import com.watts.spring.di.configuration.DIConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ClientApplication {

    public static void main(String[] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DIConfiguration.class);
        MyApplication app = context.getBean(MyApplication.class);

        app.processMessage("Hi Victor", "victor.lopez@watts.com");

        context.close();
    }

}
