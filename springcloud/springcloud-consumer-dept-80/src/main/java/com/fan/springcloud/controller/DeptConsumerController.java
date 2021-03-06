package com.fan.springcloud.controller;

import com.fan.springcloud.pojo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class DeptConsumerController {
    @Autowired
    private RestTemplate restTemplate;
    private static final String REST_URL ="http://localhost:8001";

    @RequestMapping("/consumer/dept/get/{id}")
    public Dept queryById(@PathVariable("id")Long id){
        return restTemplate.getForObject(REST_URL+"dept/get/"+id,Dept.class);
    }
    @RequestMapping("/consumer/dept/add")
    public boolean add(Dept dept){
        return restTemplate.postForObject(REST_URL+"dept/add",dept,Boolean.class);
    }
    @RequestMapping("/consumer/dept/list")
    public List<Dept> getAll(){
        return restTemplate.getForObject(REST_URL+"dept/getAll",List.class);
    }
}
