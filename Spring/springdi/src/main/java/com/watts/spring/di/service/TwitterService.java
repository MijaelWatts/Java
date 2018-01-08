package com.watts.spring.di.service;

public class TwitterService implements MessageService {

    public boolean sendMessage(String msg, String rec) {
        System.out.println("Email sent to " + rec + " with message = " + msg);
        return true;
    }

}
