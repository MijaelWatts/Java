package com.watts.repository;

import com.watts.model.User;

import java.util.List;

public interface UserRepository {
    List<User> findAll();
}
