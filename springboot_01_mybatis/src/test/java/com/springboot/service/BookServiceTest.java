package com.springboot.service;

import com.springboot.entity.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BookServiceTest {
    @Autowired
    private BookService bookService;

    @Test
    void BookSelectAll(){
        bookService.selectAll();
    }

    @Test
    void TestselectById(){
        bookService.selectById(3);
    }

    @Test
    void TestInsert(){
        Book book = new Book();
        book.setBookname("钢铁是怎样炼成的");
        book.setBookms("小说");
        book.setBookzz("洛夫斯基");
        bookService.insert(book);
    }
    @Test
    void  TestupdateById(){
        bookService.updateById(new Book(5,"钢铁炼成","一本小说","主角"));
    }
}
