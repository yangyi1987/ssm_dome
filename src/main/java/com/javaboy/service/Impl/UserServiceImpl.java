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
        User user = userMapper.login(userId,passWord);
        System.out.println(user.getUserId());
        System.out.println(user.getPassWord());
        System.out.println(user.getUserType());
        return user;
    }

}
