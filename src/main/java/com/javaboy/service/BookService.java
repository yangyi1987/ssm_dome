package com.javaboy.service;

import com.javaboy.entity.Book;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface BookService {
    List<Book> getUserList();
}
