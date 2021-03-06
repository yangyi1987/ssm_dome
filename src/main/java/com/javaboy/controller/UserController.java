package com.javaboy.controller;


import com.javaboy.entity.User;
import com.javaboy.service.Impl.UserServiceImpl;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.*;
import java.io.IOException;
import java.io.PrintWriter;
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
    public String login(@RequestParam("userId")Integer userId, @RequestParam("passWord")String passWord, HttpServletResponse resp, Model model) throws IOException {
        User user = userService.login(userId,DigestUtils.sha256Hex(passWord));
        System.out.println(DigestUtils.sha256Hex(passWord));
        if (user!=null){
            model.addAttribute("user",user);
            return "succeed";
        }else {

            return  "error";
        }
    }
}
