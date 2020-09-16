package com.atguigu.thymeleaf.demo.controller;

import com.atguigu.thymeleaf.demo.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * @author Baozhong Chen
 * @version 1.0
 * @date 2020/8/29 15:55
 */

@Controller
public class HelloController {
    @GetMapping("test")
    public String test(Model model){
        User user = new User("abcdefghigk", 22, new User("柳岩", 20, null));
        model.addAttribute("msg", "hello thymeleaf!");
        model.addAttribute("user", user);
        model.addAttribute("today", new Date());
        List<User> users = Arrays.asList(
                new User("柳岩", 21, null),
                new User("锋哥", 22, null),
                new User("杨紫", 23, null),
                new User("小鹿", 24, null)
        );
        model.addAttribute("users",users);

        return "hello";
    }
}
