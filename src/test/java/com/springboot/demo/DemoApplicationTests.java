package com.springboot.demo;

import com.alibaba.fastjson.JSON;
import com.springboot.utils.ConfigProperties;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.UUID;

@RunWith(SpringRunner.class)
@SpringBootTest
@ComponentScan(basePackages={"com.springboot.utils","org.kfit"})
public class DemoApplicationTests {

	@Autowired
	ConfigProperties configProperties;
	@Test
	public void contextLoads() {
		System.out.println(JSON.toJSONString(configProperties));
		System.out.println(UUID.randomUUID().toString());
	}

}
