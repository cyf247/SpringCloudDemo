package com.fan.springcloud.controller;

import com.fan.springcloud.pojo.Dept;
import com.fan.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//提供Restfull服务
@RestController
public class DeptController {
    @Autowired
    private DeptService deptService;
    @PostMapping("/dept/add")
    public boolean addDept(Dept dept){
        return deptService.addDept(dept);
    }
    @GetMapping("/dept/get/{id}")
    public Dept get(@PathVariable("id")Long id){
        return deptService.queryById(id);
    }
    @GetMapping("dept/getAll")
    public List<Dept> queryAll(){
        return deptService.queryAll();
    }
}
