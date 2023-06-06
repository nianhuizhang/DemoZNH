package com.example.demo.studentSystem.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.studentSystem.entity.Student;
import com.example.demo.studentSystem.mapper.StudentMapper;
import com.example.demo.studentSystem.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements StudentService {

    @Resource
    private StudentMapper studentMapper;



}
