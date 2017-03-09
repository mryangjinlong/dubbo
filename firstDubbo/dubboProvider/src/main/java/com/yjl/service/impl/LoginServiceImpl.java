package com.yjl.service.impl;

import com.yjl.model.User;
import com.yjl.persist.UserDao;
import com.yjl.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by jimmy on 2016/11/19
 */
@Service("loginService")
public class LoginServiceImpl implements LoginService {

    private UserDao userDao;

    @Override
    public User login(String loginName, String password) {
        User user = userDao.get(loginName, password);
        return user;
    }


    public UserDao getUserDao() {
        return userDao;
    }
    @Autowired
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
