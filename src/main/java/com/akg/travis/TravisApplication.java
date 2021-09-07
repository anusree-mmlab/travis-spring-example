package com.akg.travis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TravisApplication {

	public static void main(String[] args) {
		SpringApplication.run(TravisApplication.class, args);
	}
	
	@GetMapping("/hello")
	public String hello() {
		return "Hello";
	}

}
