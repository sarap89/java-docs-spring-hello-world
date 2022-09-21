package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.GetMapping;
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
		return "Hello World from tomcat API......changed code!";
	}
	@GetMapping(value="/test-api1")
	String sayGetHello() {
		return "Hello World Test API!";
	}
	
}
