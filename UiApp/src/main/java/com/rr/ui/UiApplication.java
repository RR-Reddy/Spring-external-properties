package com.rr.ui;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages= {"com.rr"})
public class UiApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.setProperty("spring.config.additional-location", "file:/home/rr-reddy/Desktop/external_props/");
	//	System.setProperty("spring.config.name", "application_config");
		System.setProperty("spring.config.name", "application_ui,application");
		//System.setProperty("spring.config.location", "file:/home/rr-reddy/Desktop/external_props/");
		SpringApplication.run(UiApplication.class, args);
	}

}
