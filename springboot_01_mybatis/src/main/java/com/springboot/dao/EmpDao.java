package com.springboot.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.springboot.entity.Emp;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface EmpDao extends BaseMapper<Emp> {
//    void selectList(Emp emp);
//    @Select("select * from emp ")
//    List<Emp> selectAll();



//    @Select("select * from emp where id =#{id}")
//    Emp selectById(int i);

//    void insertEmp(Emp emp);
}
