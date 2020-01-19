package com.my.restfulcrud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.Map;

@Controller
public class HelloController {

   /* @RequestMapping({"/", "/index.html"})
    public String index(){
        return "index";
    }*/

    @ResponseBody
    @RequestMapping("/hello")
    public String hello(){
        return "Hello World!";
    }

    @RequestMapping("/success")
    public String success(Map<String, Object> map){
        map.put("hello", "<div>你好</div>");
        map.put("class", "one");
        map.put("users", Arrays.asList("张三", "李四", "王五"));
        return "success";
    }
}
