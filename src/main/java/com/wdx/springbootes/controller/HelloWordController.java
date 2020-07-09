package com.wdx.springbootes.controller;

import com.wdx.springbootes.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HelloWordController {

    @GetMapping("/all")
    public String all(ModelMap model) {
        // 查询用户
        List<User> users = new ArrayList<>();
        users.add(new User(1L,"WDX"));
        users.add(new User(2L,"WDD"));
        // 放入模型
        model.addAttribute("users", users);
        // 返回模板名称（就是classpath:/templates/目录下的html文件名）
        return "user";
    }


    @GetMapping("/a")
    @ResponseBody
    public String a() {
        return "user";
    }

}
