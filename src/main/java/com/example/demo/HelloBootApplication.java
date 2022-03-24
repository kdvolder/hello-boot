package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;


@SpringBootApplication
@RestController
public class HelloBootApplication {

	@GetMapping("/bye")
	public String byeaaaa() {
		return "So long";
	}

	@GetMapping("/aaaasd")
	public String booo() {
		return "So long";
	}
 
	@GetMapping(value = "/")
	public String hello() {
		return "Hello World!";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(HelloBootApplication.class, args);
	}

}

