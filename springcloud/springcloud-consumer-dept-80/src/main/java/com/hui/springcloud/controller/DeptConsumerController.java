package com.hui.springcloud.controller;

import com.hui.springcloud.pojo.Dept;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class DeptConsumerController {
    //理解:消费者，不应该有service层
    //RestTemplate...供我们直接调用就可以了！注册到spring中
    //(url,实体：Map，class<T> responseType)
    @Autowired
    private RestTemplate restTemplate;//提供多种便捷访问远程http服务的方法，简单地restful服务模板


    //Ribbon. 我们这里的地址应该是一个变量，通过服务名来访问
    private static final String REST_URL_PREFIX = "http://springcloud-provider-dept";
   // private static final String REST_URL_PREFIX = "http://SPRINGCLOUD-PROVIDER-DEPT";



    @RequestMapping("/consumer/dept/add")
    public boolean add(Dept dept){
        return restTemplate.postForObject(REST_URL_PREFIX+"/dept/list",dept,Boolean.class);
    }
    @RequestMapping("/consumer/dept/list")
    public List<Dept> list(){

        return restTemplate.getForObject(REST_URL_PREFIX+"/dept/list",List.class);
    }

    //http://localhost:8001/dept/list
    @RequestMapping("/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id") int id){

        return restTemplate.getForObject(REST_URL_PREFIX+"/dept/get/"+id,Dept.class);
    }
}
