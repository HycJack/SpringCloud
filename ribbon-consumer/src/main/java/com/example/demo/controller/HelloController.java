package com.example.demo.controller;

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
	RestTemplate restTemplate;
    @RequestMapping("/ribbon-consumer")
    public String index(){
        return restTemplate.getForEntity("http://HELLO-SERVICE/hello",String.class).getBody();
    }
}
