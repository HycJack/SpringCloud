package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Jack on 2018-04-19.
 */
@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String index(){
		System.out.println("clent1");
        return "Hello World!";
    }
}
