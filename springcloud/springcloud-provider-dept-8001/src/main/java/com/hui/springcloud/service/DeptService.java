package com.hui.springcloud.service;

import com.hui.springcloud.pojo.Dept;

import java.util.List;

public interface DeptService {
    public boolean addDept(Dept dept);

    public Dept queryById(int id);
    public List<Dept> queryAll();
}
