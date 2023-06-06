package com.hui.springcloud.service;

import com.hui.springcloud.dao.DeptDao;
import com.hui.springcloud.pojo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class DeptServiceImpl implements DeptService{
@Autowired
private DeptDao deptDao;

    public boolean addDept(Dept dept) {
        return deptDao.addDept(dept);
    }

    public Dept queryById(int id) {
        return deptDao.queryById(id);
    }

    public List<Dept> queryAll() {
        return deptDao.queryAll();
    }
}
