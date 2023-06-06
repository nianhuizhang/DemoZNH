package com.example.demo.studentSystem.controllor;

import com.example.demo.studentSystem.entity.User;
import com.example.demo.studentSystem.service.impl.userServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/demo")
public class userControllor {
    @Resource
    private userServiceImpl userserviceImpl;
@GetMapping("select")
    public List<User> selectInfo(User user)
    {
        return userserviceImpl.selectAll(user);
    }


}
