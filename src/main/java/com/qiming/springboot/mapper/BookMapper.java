package com.qiming.springboot.mapper;

import com.qiming.springboot.bean.Book;
import org.apache.ibatis.annotations.*;


import java.util.List;

@Mapper
public interface BookMapper {

    //查询所有的书
    @Select("select * from book")
    List<Book> findAllBooks();

    //插入
    @Insert("insert into book(bookname,author,price)values(#{bookname},#{author},#{price})")
    int insertBooks(Book book);

    //根据id查找
    @Select("select * from book where id=#{id}")
    Book findById(int id);

    //更新
    @Update("update book set bookname=#{bookname},author=#{author},price=#{price} where id=#{id}")
    int updateBooks(Book book);

    //删除书
    @Delete("delete from book where id=#{id}")
    int delete(int id);
}
