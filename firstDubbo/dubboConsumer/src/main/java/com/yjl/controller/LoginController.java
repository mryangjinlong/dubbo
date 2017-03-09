package com.yjl.controller;

import com.yjl.model.User;
import com.yjl.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by jimmy on 2016/11/19.
 */
@Controller("loginController")
@RequestMapping("")
public class LoginController {

    @Autowired
    private LoginService loginService;

    @RequestMapping("login")
    public String login(Model model) {
        model.addAttribute("user", loginService.login("yjl", "1212adf"));
        System.out.println(new Date().getTime());
        return "login";
    }

    @RequestMapping("login2")
    @ResponseBody
    public Map<User, String> login2(Model model) {
        Map<User, String> map = new HashMap<>();
        map.put(new User(1212,"asdf","adsf"), "aaaa");
        return map;
    }
}
