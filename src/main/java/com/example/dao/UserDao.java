package com.example.dao;

import com.example.po.User;

public interface UserDao {

    public User findUserById(int id) throws Exception;
}
