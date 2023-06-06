package com.example.demo.studentSystem.entity;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

@Data
@TableName("student")
public class Student implements Serializable {
    @TableId(value = "house_id", type = IdType.AUTO)
    @TableField("student_id")
    private int id;
    @TableField("student_name")
    private String name;
    @TableField("student_age")
    private String age;
    @TableField("student_sex")
    private String Sex;
    @TableField("student_weight")
    private String weight;




}
