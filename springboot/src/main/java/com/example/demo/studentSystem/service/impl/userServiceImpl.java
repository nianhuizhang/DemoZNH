package com.example.demo.studentSystem.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.studentSystem.entity.User;
import com.example.demo.studentSystem.mapper.userMapper;

import com.example.demo.studentSystem.service.userService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class userServiceImpl extends ServiceImpl<userMapper,User> implements userService {

    @Resource
    private userMapper usermapper;


    @Override
    public List<User> selectByid(User user)
    {
        return usermapper.selectByid(user);

    }

    @Override
    public List<User> selectAll(User user){

        return usermapper.selectAll(user);
    }



    @Override
  public  int insert(User user)

    {
        return usermapper.insert(user);

    }
    @Override
    public int delete(User user)
    {

        return usermapper.delete(user);

    }
    @Override
    public int update(User user) {

        return usermapper.update(user);
    }


}
