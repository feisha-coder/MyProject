package com.qiming.springboot.bean;

import lombok.Data;

import java.util.*;

@Data
public class Book {

    private Integer id;
    private String bookname;
    private String author;
    private Integer price;

}
