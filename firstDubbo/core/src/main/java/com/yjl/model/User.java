package com.yjl.model;

import java.io.Serializable;

/**
 * Created by jimmy on 2016/11/19.
 * 需要使用dubbo来传输的话 类需要实现序列化接口
 */
public class User implements Serializable{

    private Integer id;
    private String loginName;
    private String password;

    public User(Integer id, String loginName, String password) {
        this.id = id;
        this.loginName = loginName;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
