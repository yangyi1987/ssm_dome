package com.javaboy.service;

import com.javaboy.entity.Book;
import com.javaboy.mapper.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class BookService {
    @Autowired
    BookMapper bookMapper;

    public List<Book> getUserList(){
        return bookMapper.getUserList();
    }

}
