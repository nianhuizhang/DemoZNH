package com.example.demo.studentSystem.mapper;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.studentSystem.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface userMapper extends BaseMapper<User> {

    List<User> selectByid(User user);
    List<User> selectAll(User user);
    int insert(User user);
    int delete(User user);
    int update(User user);

}
