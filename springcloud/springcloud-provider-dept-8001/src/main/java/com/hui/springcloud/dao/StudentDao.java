package com.hui.springcloud.dao;

import com.hui.springcloud.pojo.Dept;
import com.hui.springcloud.pojo.Student;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface StudentDao {
    public boolean addStudent(Student student);
    public Student queryById(int id);
    public List<Student> queryAll();
    public int deleteById(int id);
    public int updateById(Student student);


}
