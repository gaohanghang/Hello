package com.immoc.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by GaoHangHang 2018-04-19 13:45
 **/
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public Object hello(){
        return "hello springboot~~";
    }

}
