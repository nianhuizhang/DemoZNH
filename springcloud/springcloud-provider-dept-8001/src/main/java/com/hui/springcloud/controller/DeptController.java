package com.hui.springcloud.controller;

import com.hui.springcloud.pojo.Dept;
import com.hui.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

//提供Restful服务
@RestController
public class DeptController {
@Autowired
    private DeptService deptservice;
    @PostMapping("/dept/add")
    public boolean addDept(Dept dept){
        return deptservice.addDept(dept);
    }

    @GetMapping("/dept/get/{id}")
    public Dept get(@PathVariable("id") int id){
        return deptservice.queryById(id);
    }

    @GetMapping("/dept/list")
    public List<Dept> queryAll(){
        return deptservice.queryAll();
    }

//注册进来的微服务，获取一些消息
}
