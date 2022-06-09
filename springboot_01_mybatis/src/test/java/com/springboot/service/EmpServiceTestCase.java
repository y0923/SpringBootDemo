package com.springboot.service;

import com.springboot.entity.Emp;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@SpringBootTest
public class EmpServiceTestCase {
    //测试业务层
    //注入业务层
    @Autowired
    private EmpService empService;

    //单个查询
    @Test
    void testGetById(){
        System.out.println(empService.getById(6));
    }

    //添加
    @Test
    void Testsave() throws ParseException {
        Emp emp =new Emp();
        SimpleDateFormat simpleDateFormat =new SimpleDateFormat("YYYY-MM-DD");
        String strDate ="2022-06-07";
        Date date =simpleDateFormat.parse(strDate);
//        emp.setId(7);
        emp.setEname("马超");

        emp.setBouns(400.0);
        emp.setJoindate(date);
        emp.setDep_id(1);
        emp.setSalary(600.0);
        emp.setJob("骑兵");
//        empDao.insert(emp);
        empService.save(emp);
    }
    //查询全部
    @Test
    void TestGetAll(){
        empService.getAll();
    }
}
