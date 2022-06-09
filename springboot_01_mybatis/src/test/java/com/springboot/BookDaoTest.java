package com.springboot;

import com.springboot.dao.BookDao;
import com.springboot.entity.Book;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BookDaoTest {

    //注入dao层
    @Autowired
    private BookDao bookDao;

    @Test
    void selectBook(){ bookDao.selectList(null);
    }

    @Test
    void  selectById(){
        bookDao.selectById(1);
    }
    @Test
    void TestInsert(){
        Book book =new Book();
        book.setBookname("西游记");
        book.setBookms("四大名著之一");
        book.setBookzz("施耐庵");
        bookDao.insert(book);
    }
    @Test
    void Testupdate(){
        bookDao.updateById(new Book(3,"西游记","四大名著","吴承恩"));
//        Book book = bookDao.selectById(3);
//        System.out.println(book);
    }
}
