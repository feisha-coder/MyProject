package com.qiming.springboot.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.qiming.springboot.bean.Book;
import com.qiming.springboot.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    private BookService bookService;

    //插入书
    @RequestMapping("/findAll")
    public List<Book> findAllBooks(){
        return bookService.findAllBooks();
    }

    //保存书
    @RequestMapping("/save")
    public String insertBooks(@RequestBody Book book){
        int result = bookService.insertBooks(book);
        if (result > 0)
            return "sucess";
        else
            return "fail";
    }

    //根据id查书
    @RequestMapping("/find/{id}")
    public Book findById(@PathVariable("id") Integer id){
        return bookService.findById(id);
    }

    //更新书
    @RequestMapping("/update")
    public String updateBooks(@RequestBody Book book){
        int result = bookService.updateBooks(book);
        if (result > 0)
            return "sucess";
        else
            return "fail";
    }

    //删除书
    @RequestMapping("/delete/{id}")
    public String deleteBooks(@PathVariable("id") Integer id){
        int result = bookService.deleteBooks(id);
        if (result > 0)
            return "sucess";
        else
            return "fail";
    }

    /**
     * 使用PageHelper进行分页查询
     *
     * @param pageNum 查询的页数
     * @param pageSize 每一页查询的数量
     * @return
     */
    @RequestMapping("/findPage/{pageNum}/{pageSize}")
    public PageInfo<Book> findPage(@PathVariable("pageNum") Integer pageNum,
                                   @PathVariable("pageSize") Integer pageSize){
        PageHelper.startPage(pageNum,pageSize);
        List<Book> list = bookService.findAllBooks();
        PageInfo<Book> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }
}
