package com.springboot.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;


@Data
@Setter
@Getter
public class Emp {
    private int id;
    private String ename;
    private Date joindate;
    private Double salary;
    private Double bouns;
    private Integer dep_id;
    private String job;


//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getEname() {
//        return ename;
//    }
//
//    public void setEname(String ename) {
//        this.ename = ename;
//    }
//
//    public Date getJoindate() {
//        return joindate;
//    }
//
//    public void setJoindate(Date joindate) {
//        this.joindate = joindate;
//    }
//
//    public Double getSalary() {
//        return salary;
//    }
//
//    public void setSalary(Double salary) {
//        this.salary = salary;
//    }
//
//    public Double getBouns() {
//        return bouns;
//    }
//
//    public void setBouns(Double bouns) {
//        this.bouns = bouns;
//    }
//
//    public int getDep_id() {
//        return dep_id;
//    }
//
//    public void setDep_id(int dep_id) {
//        this.dep_id = dep_id;
//    }
//
//    public String getJob() {
//        return job;
//    }
//
//    public void setJob(String job) {
//        this.job = job;
//    }
//
//    @Override
//    public String toString() {
//        return "Emp{" +
//                "id=" + id +
//                ", ename='" + ename + '\'' +
//                ", joindate=" + joindate +
//                ", salary=" + salary +
//                ", bouns=" + bouns +
//                ", dep_id=" + dep_id +
//                ", job='" + job + '\'' +
//                '}';
//    }
//
//    public void setJoindate(int i) {
//    }
}
