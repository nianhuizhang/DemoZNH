package com.example.demo.studentSystem.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.demo.studentSystem.entity.User;


import java.util.List;


public interface userService extends IService<User> {

    List<User> selectByid(User user);
    List<User> selectAll(User user);
    int insert(User user);
    int delete(User user);
    int update(User user);


}
