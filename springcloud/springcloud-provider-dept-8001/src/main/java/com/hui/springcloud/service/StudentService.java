package com.hui.springcloud.service;

import com.hui.springcloud.pojo.Student;

import java.util.List;

public interface StudentService {
    public boolean addStudent(Student student);
    public Student queryById(int id);
    public List<Student> queryAll();
    public int deleteById(int id);
    public int updateById(Student student);

}
