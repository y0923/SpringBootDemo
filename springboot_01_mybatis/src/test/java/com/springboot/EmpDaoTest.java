package com.springboot;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.springboot.dao.EmpDao;
import com.springboot.entity.Emp;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.xml.crypto.Data;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@SpringBootTest
class EmpDaoTest {
    @Autowired
    private EmpDao empDao;

    //查询所有
    @Test
    void contextLoads() {
    empDao.selectList(null);

    }
    @Test
    void TestinsertEmp() throws ParseException {
        Emp emp =new Emp();
        SimpleDateFormat simpleDateFormat =new SimpleDateFormat("YYYY-MM-DD");
        String strDate ="2022-06-07";
        Date date =simpleDateFormat.parse(strDate);
//        emp.setId(7);
        emp.setEname("刘备");

        emp.setBouns(4000.0);
        emp.setJoindate(date);
        emp.setDep_id(1);
        emp.setSalary(6000.0);
        emp.setJob("UI设计师");
//        empDao.insert(emp);

        int Count =empDao.insert(emp);
        if (Count > 0){
            System.out.println("插入成功");
        }else {
            System.out.println("数据刷新失败");
        }
    }
    //修改
    @Test
    void Testupdate(){
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("YYYY-MM-DD");
            String str ="2022-06-08";
            Date date =simpleDateFormat.parse(str);
//            empDao.updateById(new Emp(7,"小猪",date,2000.0,3000.0,"科学"));
            Emp emp1 = empDao.selectById(7);
        }catch (Exception e){
           e.printStackTrace();
        }
    }
    //删除
    @Test
    void TestDelect(){
        empDao.deleteById(14);
    }
    @Test
    void selectById(){
        System.out.println(empDao.selectById(1));
    }
    //分页查询 MP不能直接查需要拦截器在config文件中配置page
    @Test
    void  testGetPage(){
        IPage page = new Page(1,3);
        empDao.selectPage(page,null);
    }
    //按条件查询
    @Test
    void selectBy(){
//        LambdaMetafactory<Emp> lam =new LambdaMetafactory();

    }
}
