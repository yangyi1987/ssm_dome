package com.javaboy.controller;


import com.javaboy.entity.User;
import com.javaboy.service.Impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.swing.*;
import java.util.List;

@Controller
public class UserController {
    @Autowired
    UserServiceImpl userService;


    @RequestMapping("/user")
    public String getUserList(){
//        List<User> list = userService.getUserList();
//        model.addAttribute("list",list);
        return "login";
    }

    @RequestMapping("/login")
    public String login(@RequestParam("userId")Integer userId,@RequestParam("passWord")String passWord,  Model model){
        System.out.println(userId);
        System.out.println(passWord);
        User user = userService.login(userId,passWord);
        System.out.println(user.getUserId());
        System.out.println(user.getPassWord());
        System.out.println(user.getUserType());
        if(user!=null){
            model.addAttribute("user",user);
            return "succeed";
        }

        return "error";
    }
}
