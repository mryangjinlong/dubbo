package com.yjl.persist;

import com.yjl.model.User;

/**
 * Created by jimmy on 2016/11/28.
 */
public interface UserDao {
        User get(int id);

        User get(String loginName, String password);
}
