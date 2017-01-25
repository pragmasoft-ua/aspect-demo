package com.pragmasoft.aspect.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;

@Configurable
public class POJO {

	@Autowired Service service;

	@Override
	public String toString() {
		return "POJO depends on " + service;
	}
	
	
}
