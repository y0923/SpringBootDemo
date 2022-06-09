package com.springboot.service.impl;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.springboot.dao.BookDao;
import com.springboot.entity.Book;
import com.springboot.entity.Emp;
import com.springboot.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookDao bookDao;

    @Override
    public List<Book> selectAll() {
        return bookDao.selectList(null);
    }

    @Override
    public Book selectById(Integer id) {
     return bookDao.selectById(id);

    }

    @Override
    public Boolean insert(Book book) {
        //业务层 这里大于零就说明操作成功
        return bookDao.insert(book)>0;
    }

    @Override
    public Boolean updateById(Book book) {
        return bookDao.updateById(book)>0;
    }

    @Override
    public Boolean deleteById(Integer id) {
        return bookDao.deleteById(id)>0;
    }


}
