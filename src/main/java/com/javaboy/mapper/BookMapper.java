package com.javaboy.mapper;


import com.javaboy.entity.Book;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BookMapper{
    List<Book> getUserList();
}
