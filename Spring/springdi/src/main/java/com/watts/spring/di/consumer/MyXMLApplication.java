package com.watts.spring.di.consumer;

import com.watts.spring.di.service.MessageService;

public class MyXMLApplication {

    private MessageService service;

    public void setService(MessageService service) {
        this.service = service;
    }

    public boolean processMessage(String msg, String rec){
        return this.service.sendMessage(msg, rec);
    }

}
