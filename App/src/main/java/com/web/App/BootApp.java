package com.web.App;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.nls.controller")
public class BootApp {
	
	public static void main(String[] args) {
		SpringApplication.run(BootApp.class, args);
	}

}
