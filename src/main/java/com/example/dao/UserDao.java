package com.example.dao;

import com.example.pojo.User;

public interface UserDao {

    public User findUserById(int id) throws Exception;
}
