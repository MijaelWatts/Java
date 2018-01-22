package com.watts.service;

import com.watts.model.User;
import com.watts.repository.HibernateUserRepoImpl;
import com.watts.repository.UserRepository;

import java.util.List;

public class UserSvcImpl implements UserService {

    private UserRepository userRepo = new HibernateUserRepoImpl();

    @Override
    public List<User> findAll(){
        return userRepo.findAll();
    }

}
