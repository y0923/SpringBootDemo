package com.springboot.controller.util;

import com.springboot.entity.Book;
import lombok.Data;

//规范接口 统一数据格式
@Data
public class R {
    private Boolean Msg;
    private Object data;

    //无参
    public R(Book book){

    }

    //构造方法传个 判断是否成功
    public R(Boolean Msg){
        this.Msg =Msg;
    }
    //再传个data 用于存储数据
    public R(Boolean Msg,Object data){
        this.Msg =Msg;
        this.data=data;
    }


}
