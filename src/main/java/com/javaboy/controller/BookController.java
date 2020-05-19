package com.javaboy.controller;


import com.javaboy.entity.Book;
import com.javaboy.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {
    @Autowired
    BookService bookService;

    @RequestMapping("/book")
    public List<Book> getUserList(){
        System.out.println("我已经执行了");
        List<Book> list = bookService.getUserList();
        return list;
    }
}
