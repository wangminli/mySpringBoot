package com.wml.myspringboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Decription:
 * Created by WangMinli on 2018/1/23.
 */
@RestController
@RequestMapping("/hello")
public class TestController {

    @ResponseBody
    @RequestMapping("sayHello")
    public String getHello(){
        return "hello world";
    }

    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }
}
