package com.springboot.controller;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.springboot.controller.util.R;
import com.springboot.entity.Book;
import com.springboot.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Books")
public class BookController {

    //注入
    @Autowired
    private BookService bookService;
    //查询全部
    //Rest风格 用get方法
    @GetMapping
    public R selectAll(){
//        R r =new R();
//        r.setRobject(bookService.selectAll());
        return  new R(true,bookService.selectAll());

    }
    //修改
    @PutMapping
    public R updateById(@RequestBody Book book){
        return new R(bookService.updateById(book));
    }
    //增加
    @PostMapping
    public R save(@RequestBody Book book){
        return new R(bookService.insert(book));
    }
    //删除
    @DeleteMapping("{id}")
    public R delete(@PathVariable Integer id )
    {
        return new R(bookService.deleteById(id));
    }
    //单个查询
    @GetMapping("{id}")
    public R selectById(@PathVariable Integer id){
        return new R(true,bookService.selectById(id));
    }
}
