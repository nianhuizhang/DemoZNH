package com.hui.springcloud.controller;

import com.hui.springcloud.pojo.Dept;
import com.hui.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//提供Restful服务
@RestController
public class DeptController {
    //获取一些配置的信息，得到具体的微服务
    @Autowired
    private DiscoveryClient client;


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



    @GetMapping("/dept/discovery")
    public Object discovery(){
        List<String> services =  client.getServices();
        System.out.println("discovery=>services"+services);
        //得到一个具体的微服务信息,通过具体的微服务id，applicationname
        List<ServiceInstance> instances =   client.getInstances("SPRINGCLOUD-PROVIDER-DEPT");
        for(ServiceInstance instance : instances){
             System.out.println(
                     instance.getHost()+"\t"+
                     instance.getPort()+"\t"+
                     instance.getUri()+"\t"+
                     instance.getServiceId()
             );
        }
        return this.client;
    }
    }


