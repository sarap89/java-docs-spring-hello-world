package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@RequestMapping("/")
	String sayHello() {
		return "Hello World from tomcat!";
	}
	@RequestMapping(value = "/test-api")
	String sayHelloAPI() {
		return "Hello World from tomcat API!";
	}
	@GetMapping("/test-api2")
	public String sayHelloAPI2() {
		return "Hello World from tomcat API2!";
	}
}
