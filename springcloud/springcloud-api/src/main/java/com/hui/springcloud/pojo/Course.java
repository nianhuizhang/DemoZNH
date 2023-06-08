package com.hui.springcloud.pojo;


import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@NoArgsConstructor
@Accessors(chain = true)//链式写法
public class Course {
    private int cno;
    private String cname;
    private String ctime;
}
