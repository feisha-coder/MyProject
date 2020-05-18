package com.qiming.springboot.service;

import com.qiming.springboot.bean.Book;

import java.util.List;


public interface BookService {

    List<Book> findAllBooks();

    int insertBooks(Book book);

    Book findById(int id);

    int updateBooks(Book book);

    int deleteBooks(int id);

}
