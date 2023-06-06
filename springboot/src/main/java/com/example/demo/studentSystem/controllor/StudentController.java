package com.example.demo.studentSystem.controllor;


import com.example.demo.studentSystem.entity.Student;
import com.example.demo.studentSystem.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/Student")
public class StudentController {
    @Resource
    private StudentService studentService;



}
