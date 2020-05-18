package com.qiming.springboot.service;

import com.qiming.springboot.bean.Book;
import com.qiming.springboot.mapper.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService{

    @Autowired
    private BookMapper mapper;

    @Override
    public List<Book> findAllBooks() {
        return mapper.findAllBooks();
    }

    @Override
    public int insertBooks(Book book) {
        return mapper.insertBooks(book);
    }

    @Override
    public Book findById(int id) {
        return mapper.findById(id);
    }

    @Override
    public int updateBooks(Book book) {
        return mapper.updateBooks(book);
    }

    @Override
    public int deleteBooks(int id) {
        return mapper.delete(id);
    }

}
