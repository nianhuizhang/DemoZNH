package com.hui.springcloud.dao;

import com.hui.springcloud.pojo.Dept;
import com.hui.springcloud.pojo.SC;
import com.hui.springcloud.pojo.Student;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
@Mapper
@Repository
public interface SCDao {

    public List<SC> queryAll();


}
