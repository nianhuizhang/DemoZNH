package com.hui.springcloud.dao;

import com.hui.springcloud.pojo.Course;
import com.hui.springcloud.pojo.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
@Mapper
@Repository
public interface CourseDao {
    public boolean addCourse(Course course);
    public Course queryById(int id);
    public List<Course> queryAll();
    public int deleteById(int id);
    public int updateById(Course course);


}
