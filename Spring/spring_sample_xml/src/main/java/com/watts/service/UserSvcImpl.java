package com.watts.service;

import com.watts.model.User;
import com.watts.repository.UserRepository;

import java.util.List;

public class UserSvcImpl implements UserService {

    private UserRepository userRepo;

    /**
     * Constructor used for the autowire byType, byName, and Setter injection.
     */
//    public UserSvcImpl(){}

    /**
     * Constructor used for the autowire by constructor and constructor injection
     */
    public UserSvcImpl(UserRepository userRepo){
        this.userRepo = userRepo;
    }

    /**
     * Setter used for the autowire byType, byName, and Setter injection.
     */
//    public void setUserRepo(UserRepository userRepo) {
//        this.userRepo = userRepo;
//    }

    @Override
    public List<User> findAll(){
        return userRepo.findAll();
    }

}
