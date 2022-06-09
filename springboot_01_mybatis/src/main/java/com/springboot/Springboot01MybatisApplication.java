package com.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//添加扫描注解，写入mapper的路径，否则会找不到接口并报错
//@MapperScan("com.springboot.dao.EmpDao.java")
public class Springboot01MybatisApplication {

    public static void main(String[] args) {

        SpringApplication.run(Springboot01MybatisApplication.class, args);
    }

}
