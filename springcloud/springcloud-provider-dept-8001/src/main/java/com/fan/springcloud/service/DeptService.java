package com.fan.springcloud.service;

import com.fan.springcloud.pojo.Dept;
import org.springframework.stereotype.Service;

import java.util.List;

public interface DeptService {
    public boolean addDept(Dept dept);

    public Dept queryById(Long id);

    public List<Dept> queryAll();
}
