package com.example.application;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
@RestController


public class Application {


	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	@GetMapping("/welcome")
	public String hello() {
		return "Hello Manju";
	}

}
