package com.example.demo.controller;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Jack on 2018-04-19.
 */
@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String index(){
		System.out.println("client...");
        return "Hello World!";
    }
    private final Logger logger = Logger.getLogger(getClass());
    @RequestMapping("/trace-2")
    public String trace() throws InterruptedException {
        logger.info("==== call trace-2 ====");
        return "Trace";
    }
}
