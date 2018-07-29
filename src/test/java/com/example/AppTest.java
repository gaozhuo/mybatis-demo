package com.example;

import com.example.po.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.Reader;
import java.util.List;

/**
 * Unit test for simple App.
 */
public class AppTest {
    private SqlSessionFactory sqlSessionFactory;

    @Before
    public void setUp() throws Exception {
        String resource = "mybatis/mybatis-config.xml";
        Reader reader = Resources.getResourceAsReader(resource);
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
    }

    @Test
    public void findUserByIdTest() throws Exception {
        SqlSession session = sqlSessionFactory.openSession();
        User user = session.selectOne("test.findUserById", 1);
        System.out.println(user.getUsername());
        session.close();
    }

    @Test
    public void findUserListTest() throws Exception {
        SqlSession session = sqlSessionFactory.openSession();
        List<User> userList = session.selectList("test.findUserList", 1);
        System.out.println(userList.size());
        session.close();
    }
}
