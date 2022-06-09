package com.springboot.service;

import com.springboot.entity.Emp;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface EmpService {
    //service接口  保存
    Boolean save(Emp emp);

    Boolean update(Emp emp);

    Boolean delete(int id);

    Emp getById(int id);
    List<Emp> getAll();

}
