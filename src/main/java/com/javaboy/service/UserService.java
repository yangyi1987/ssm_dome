package com.javaboy.service;


import com.javaboy.entity.User;

import java.util.List;

public interface UserService {
    List<User> getUserList();

    // 用户登录
     User login(Integer userId,String passWord);
}
