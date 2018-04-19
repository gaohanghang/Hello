package com.immoc.controller;

import com.immoc.pojo.IMoocJSONResult;
import com.immoc.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;


//@Controller
@RestController     // @RestController = @Controller + @ResponseBody
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/getUser")
//    @ResponseBody
    public Object getUser(){

        User u = new User();
        u.setName("imooc");
        u.setAge(18);
        u.setBirthday(new Date());
        u.setDesc("hello imoox~~");

        return u;
    }

    @RequestMapping("/getUserJson")
//    @ResponseBody
    public IMoocJSONResult getUserJson(){

        User u = new User();
        u.setName("imooc");
        u.setAge(18);
        u.setBirthday(new Date());
        u.setDesc("hello imoox~~");

        return IMoocJSONResult.ok(u);
    }



}
