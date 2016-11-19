package com.yjl.service.impl;

import com.yjl.model.User;
import com.yjl.service.LoginService;
import org.springframework.stereotype.Service;

/**
 * Created by jimmy on 2016/11/19
 */
@Service("loginService")
public class LoginServiceImpl implements LoginService {
    @Override
    public User login(String loginName, String password) {
        User user =  new User(1111l,loginName,"password");
        System.out.println("login in server" + user);
        return user;
    }

}
