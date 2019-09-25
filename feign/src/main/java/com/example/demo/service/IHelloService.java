package com.example.demo.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("hello-service")
public interface IHelloService {
    @RequestMapping("/hello")
    String hello();


}
