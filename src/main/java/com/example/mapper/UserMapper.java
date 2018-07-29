package com.example.mapper;

import com.example.po.User;

import java.util.List;

public interface UserMapper {

    public User findUserById(int id);

    public List<User> findUserList();

}
