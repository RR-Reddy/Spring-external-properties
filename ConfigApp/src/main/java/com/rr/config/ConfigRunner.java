package com.rr.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ConfigRunner implements CommandLineRunner {

	@Value("${prop.a}")
	private String a;

	@Autowired
	private ConfigPropSpringBean configPropSpringBean;
	
	@Value("${prop.b}")
	private String b;

	@Override
	public void run(String... args) throws Exception {

		System.out.println("===========Config-start=============");

		System.out.println("prop.a  ->> " + a);
		System.out.println("prop.b  ->> " + b);
		System.out.println("prop.a bean --> " + configPropSpringBean.getA());
		System.out.println("===========Config-end=============");

	}

}
