package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by wangjianfeng on 2017/12/26.
 */

@Controller
@RequestMapping("/")
public class HelloWorldController {

    @GetMapping()
    String helloWorld() {
        return "index";
    }

}
