package com.javaboy.mapper;

import com.javaboy.entity.User;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface UserMapper {
    List<User> getUserList();

    User login(Integer userId,String passWord);
}
