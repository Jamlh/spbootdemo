package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wangjianfeng on 2017/12/26.
 */

@RestController
@RequestMapping("/")
public class HelloWorldController {

    @GetMapping()
    String home() {
        return "index";
    }

}
