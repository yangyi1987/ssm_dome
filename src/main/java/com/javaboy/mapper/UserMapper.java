package com.javaboy.mapper;

import com.javaboy.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface UserMapper {
    List<User> getUserList();

    /*
    *
    * @Param 传参
    *
    * */
    User login(@Param("userId") Integer userId,@Param("passWord") String passWord);
}
