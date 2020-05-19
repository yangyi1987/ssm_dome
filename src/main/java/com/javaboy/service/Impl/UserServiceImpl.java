package com.javaboy.service.Impl;

import com.javaboy.entity.User;
import com.javaboy.mapper.UserMapper;
import com.javaboy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public List<User> getUserList() {
        return userMapper.getUserList();
    }




    @Override
    public User login(Integer userId, String passWord) {
        System.out.println("<----------------->");
        System.out.println(passWord);
        System.out.println(userId);
        User user = userMapper.login(userId,passWord);
        return user;
    }

}
