package com.hui.springcloud.config;




import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConfigBean {

    //配置负载均衡实现RestTemplate


    @LoadBalanced//ribbon
    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
//配置负载均衡实现RestTemplate
}
