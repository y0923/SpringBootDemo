package com.springboot.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor//会生成一个包含所有变量，同时如果变量使用了NotNull annotation ， 会进行是否为空的校验， 全部参数的构造函数的自动生成，该注解的作用域也是只有在实体类上，参数的顺序与属性定义的顺序一致
@NoArgsConstructor//无参构造函数
public class Book {
    private Integer id;
    private String bookname;
    private String bookms;//m描述
    private String bookzz;//作者

}
