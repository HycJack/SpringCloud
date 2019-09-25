package com.example.demo.controller;

import com.example.demo.service.IHelloService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Jack on 2018-04-19.
 */
@RestController
public class HelloController {
	@Autowired
    IHelloService helloService;
    @RequestMapping("/feign-consumer")
    public String index(){
        return helloService.hello();
    }
}
