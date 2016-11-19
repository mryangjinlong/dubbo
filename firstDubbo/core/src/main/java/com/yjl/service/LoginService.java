package com.yjl.service;

import com.yjl.model.User;

/**
 * Created by jimmy on 2016/11/19.
 */
public interface LoginService {
     User login(String loginName , String password);
}
