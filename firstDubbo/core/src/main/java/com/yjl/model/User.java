package com.yjl.model;

import java.io.Serializable;

/**
 * Created by jimmy on 2016/11/19.
 * 需要使用dubbo来传输的话 类需要实现序列化接口
 */
public class User implements Serializable{
    private long id;
    private String name;
    private String password;

    public User(long id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
