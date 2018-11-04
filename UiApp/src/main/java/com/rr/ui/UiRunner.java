package com.rr.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.rr.config.ConfigPropSpringBean;

@Component
public class UiRunner implements CommandLineRunner {

	@Value("${prop.a}")
	private String a;
	
	@Value("${prop.b}")
	private String b;
	
	@Value("${prop.c}")
	private String c;


	@Autowired
	private ConfigPropSpringBean configPropSpringBean;

	@Override
	public void run(String... args) throws Exception {

		System.out.println("===========Ui-start=============");

		System.out.println("prop.a  config  bean ->> " + configPropSpringBean.getA());
		System.out.println("prop.a  ->> " + a);
		System.out.println("prop.b  ->> " + b);
		System.out.println("prop.c  ->> " + c);
		System.out.println("===========Ui-end=============");

	}
}
