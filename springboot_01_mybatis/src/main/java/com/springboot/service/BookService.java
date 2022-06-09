package com.springboot.service;

import com.springboot.entity.Book;
import com.springboot.entity.Emp;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface BookService {
    List<Book> selectAll();

    Book selectById(Integer id);
    //增加
    Boolean insert(Book book);
    //修改按照id
    Boolean updateById(Book book);
    //删除
    Boolean deleteById(Integer id);

}
