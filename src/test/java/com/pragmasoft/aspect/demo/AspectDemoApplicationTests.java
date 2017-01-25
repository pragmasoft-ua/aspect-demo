package com.pragmasoft.aspect.demo;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class AspectDemoApplicationTests {

	@Test
	public void contextLoads() {
		
		POJO pojo = new POJO();
		log.info(pojo.toString());
		Assertions.assertThat(pojo.service).isNotNull();
		
	}

}
