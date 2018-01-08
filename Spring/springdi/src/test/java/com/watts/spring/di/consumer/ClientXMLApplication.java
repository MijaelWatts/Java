package com.watts.spring.di.consumer;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientXMLApplication {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        MyXMLApplication app = context.getBean(MyXMLApplication.class);

        app.processMessage("Hi Victor", "@MijaelWatts");

        context.close();
    }

}
