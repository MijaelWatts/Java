package com.watts.service;

public class UserSvcImplTest {

    public static void main(String[] args){
        UserSvcImpl userSvcImpl = new UserSvcImpl();

        System.out.println(userSvcImpl.findAll().get(0).getFirstName());
    }

}
