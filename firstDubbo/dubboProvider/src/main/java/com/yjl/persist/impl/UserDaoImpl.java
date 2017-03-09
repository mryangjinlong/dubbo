package com.yjl.persist.impl;

import com.yjl.model.User;
import com.yjl.persist.UserDao;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import redis.clients.jedis.Jedis;

/**
 * Created by jimmy on 2016/11/29.
 */
@Repository("userDao")
public class UserDaoImpl implements UserDao {

    private SqlSessionTemplate sqlSessionTemplate;
    private Jedis jedis;

    @Override
    public User get(int id) {
        return null;
    }

    @Override
    public User get(String loginName, String password) {
//        System.out.println("Server is running: "+jedis.ping());

        User user = (User) sqlSessionTemplate.selectOne("com.yjl.model.User.selectOne",1009843);
//        User user = new User(111, "hahaha","password");
        return user;
    }


    public SqlSessionTemplate getSqlSessionTemplate() {
        return sqlSessionTemplate;
    }
    @Autowired
    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
        this.sqlSessionTemplate = sqlSessionTemplate;
    }

    public Jedis getJedis() {
        return jedis;
    }

    @Autowired
    public void setJedis(Jedis jedis) {
        this.jedis = jedis;
    }
}
