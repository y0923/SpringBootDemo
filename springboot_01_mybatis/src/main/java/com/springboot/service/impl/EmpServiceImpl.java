package com.springboot.service.impl;

import com.springboot.dao.EmpDao;
import com.springboot.entity.Emp;
import com.springboot.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.List;
//定义业务层的bean
@Service
public class EmpServiceImpl implements EmpService {
    //定义数据层接口
    @Autowired
    private EmpDao empDao;




    @Override
    public Boolean save(Emp emp) {
        //大于0是影响行  当大于0 就说明为真操作成功
        return empDao.insert(emp)>0;
    }

    @Override
    public Boolean update(Emp emp) {
        return empDao.updateById(emp) >0;
    }

    @Override
    public Boolean delete(int id) {
        return empDao.deleteById(id) >0;
    }

    @Override
    public Emp getById(int id) {
        return empDao.selectById(id);
    }

    @Override
    public List<Emp> getAll() {
        return empDao.selectList(null);
    }
}
