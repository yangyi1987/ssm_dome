package com.javaboy.controller;


import com.javaboy.entity.Book;
import com.javaboy.service.BookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("")
public class BookController {

    @Autowired
    BookServiceImpl bookService;

    @RequestMapping("/book")
    public List<Book> getUserList(){
        System.out.println("我已经执行了");
        List<Book> list = bookService.getUserList();
        return list;
    }
}
