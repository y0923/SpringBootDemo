package com.springboot.controller;

import com.springboot.entity.Emp;
import com.springboot.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/emps")
public class EmpController {
    @Autowired
    private EmpService empService;
    /*
    查询全部
     */
    @GetMapping
    public List<Emp> GetAll(){

        return empService.getAll();
    }
    //保存
    @PostMapping
    public String save(@RequestBody Emp emp) {
       emp.toString();
        System.out.println(emp.toString());
        return "success";
    }
    //修改
    @PutMapping
    public Boolean update(@RequestBody Emp emp){
        return empService.update(emp);
    }
    //删除
    @DeleteMapping("{id}")
    public Boolean delete(@PathVariable int id){
        return empService.delete(id);
    }
    //单个查询
    @GetMapping("{id}")
    public Emp GetById(@PathVariable int id){
        return empService.getById(id);
    }


}
