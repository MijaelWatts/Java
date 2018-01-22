package com.watts.repository;

import com.watts.model.User;

import java.util.ArrayList;
import java.util.List;

public class HibernateUserRepoImpl implements UserRepository {

    @Override
    public List<User> findAll(){
        User user        = new User();
        List<User> users = new ArrayList<>();

        user.setFirstName("Mijael");
        user.setLastName("Watts");

        users.add(user);

        return users;
    }

}