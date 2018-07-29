package com.example.dao;

import com.example.po.User;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;

public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao {

    @Override
    public User findUserById(int id) throws Exception {
        SqlSession sqlSession = getSqlSession();
        User user = sqlSession.selectOne("com.example.mapper.UserMapper.findUserById", id);
        return user;
    }
}
