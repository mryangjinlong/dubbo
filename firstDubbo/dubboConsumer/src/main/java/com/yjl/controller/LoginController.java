package com.yjl.controller;

import com.yjl.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

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
        System.out.println("dddd");
        return "login";
    }
}
