package com.watts.spring.di.consumer;

import com.watts.spring.di.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyApplication {

    @Autowired
    private MessageService service;

//    @Autowired
//    MyApplication(MessageService service) {
//        this.service = service;
//    }

//    @Autowired
//    public void setService(MessageService service) {
//        this.service = service;
//    }

    public boolean processMessage(String msg, String rec){
        return this.service.sendMessage(msg, rec);
    }

}
