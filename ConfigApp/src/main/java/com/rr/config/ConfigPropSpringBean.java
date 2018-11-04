package com.rr.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ConfigPropSpringBean {
	@Value("${prop.a}")
	private String a;

	public String getA() {
		return a;
	}

}
