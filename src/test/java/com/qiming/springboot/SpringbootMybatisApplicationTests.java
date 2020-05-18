package com.qiming.springboot;

import com.qiming.springboot.bean.Book;
import com.qiming.springboot.service.BookService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class SpringbootMybatisApplicationTests {

    @Autowired
    BookService service;

    @Test
    void contextLoads() {
        Book book = service.findById(1);
        System.out.println(book);
        book.setBookname("三国志");
        book.setAuthor("姜子牙");
        book.setPrice(15);
        service.updateBooks(book);
        System.out.println(service.findById(1));
    }

}
