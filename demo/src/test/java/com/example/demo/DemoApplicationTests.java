package com.example.demo;

import com.example.demo.controller.HelloController;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class DemoApplicationTests {


	private MockMvc mvc;

	@Before
	public void setUp(){
		mvc = MockMvcBuilders.standaloneSetup(new HelloController()).build();
	}

	@Test
	public void contextLoads() throws Exception {
		String url = "/hello";//访问url
		MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.get(url).accept(MediaType.APPLICATION_JSON))
				.andReturn();
		//访问返回状态
		int status = mvcResult.getResponse().getStatus();
		//接口返回结果
		String content = mvcResult.getResponse().getContentAsString();
		//打印结果和状态
		System.out.println(status);
		System.out.println(content);

	}

}
