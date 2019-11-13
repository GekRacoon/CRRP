package com.gdou.crrp.controller;

import com.gdou.crrp.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.thymeleaf.util.StringUtils;

@Controller
public class UserController {
    @Autowired
    UserRepository userRepository;

    @RequestMapping("/toLogin")
    public String toLogin(){
        return "login";
    }

    @PostMapping("/login")
    public String login(String phone, String password, Model model){
        if(!StringUtils.isEmpty(phone)&&"12345".equals(password))
            return "home";
        else {
            model.addAttribute("msg", "账号或密码错误（提示：账号任意，密码：12345）");
            return "login";
        }
    }

}
