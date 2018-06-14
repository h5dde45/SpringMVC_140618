package com.newproject.dao;

import com.newproject.entity.User;

import java.util.List;

public interface UserDao {
    List<User> findAll();
}
