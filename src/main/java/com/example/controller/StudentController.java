package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2019/3/7.
 */
@Controller
public class StudentController {
    @RequestMapping("hello")
    @RequestBody
    public String hello(){
        return "hello";
    }

}
