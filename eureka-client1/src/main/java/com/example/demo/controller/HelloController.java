package com.example.demo.controller;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Jack on 2018-04-19.
 */
@RestController
public class HelloController {
    private final Logger logger = Logger.getLogger(getClass());
    @RequestMapping("/hello")
    public String index() throws InterruptedException {
		System.out.println("clent1");
		Thread.sleep(5000);
        return "Hello World!";
    }

    @RequestMapping("/trace-2")
    public String trace() throws InterruptedException {
        logger.info("==== call trace-2 ====");
        return "Trace";
    }
}
