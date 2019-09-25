package com.example.demo.controller;

import com.example.demo.service.HelloService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Jack on 2018-04-19.
 */
@RestController
public class HelloController {
	@Autowired
    HelloService helloService;
    @RequestMapping("/ribbon-consumer")
    public String index(){
        return helloService.helloService();
    }
}
