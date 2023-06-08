package com.hui.springcloud.service;

import com.hui.springcloud.pojo.Course;

import java.util.List;

public interface CourseService {
    public boolean addCourse(Course course);
    public Course queryById(int id);
    public List<Course> queryAll();
    public int deleteById(int id);
    public int updateById(Course course);


}
