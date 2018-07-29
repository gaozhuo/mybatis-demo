package com.example.dao;

import com.example.po.User;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserDaoImplTest {
    private ApplicationContext applicationContext;

    @Before
    public void setUp() throws Exception {
        applicationContext = new ClassPathXmlApplicationContext("classpath:spring/applicationContext.xml");
    }

    @Test
    public void findUserById() throws Exception {
        UserDao userDao = (UserDao) applicationContext.getBean("userDao");
        User user = userDao.findUserById(1);
        System.out.println(user.getUsername());
    }
}