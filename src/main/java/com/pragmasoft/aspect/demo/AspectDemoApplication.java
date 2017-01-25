package com.pragmasoft.aspect.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableLoadTimeWeaving;
import org.springframework.context.annotation.EnableLoadTimeWeaving.AspectJWeaving;
import org.springframework.context.annotation.aspectj.EnableSpringConfigured;

@SpringBootApplication
@EnableSpringConfigured
@EnableLoadTimeWeaving(aspectjWeaving=AspectJWeaving.AUTODETECT)
public class AspectDemoApplication {

	static Logger log = LoggerFactory.getLogger(AspectDemoApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(AspectDemoApplication.class, args);
		log.info(new POJO().toString());
	}
	
}
