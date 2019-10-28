package com.example.demo;

import org.apache.log4j.Logger;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@SpringBootApplication
@EnableDiscoveryClient
public class TraceApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder(TraceApplication.class).web(true).run(args);
	}

	private final Logger logger = Logger.getLogger(getClass());

	@Bean
	@LoadBalanced
	RestTemplate restTemplate() {
		return new RestTemplate();
	}

	@RequestMapping(value = "/trace-1", method = RequestMethod.GET)
	public String trace(){
		logger.info("==== call trace-1 ====");
		return restTemplate().getForEntity("http://hello-service/trace-2",String.class).getBody();
	}
}
