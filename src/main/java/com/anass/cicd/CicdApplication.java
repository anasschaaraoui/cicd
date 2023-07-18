package com.anass.cicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CicdApplication {

	@GetMapping("/getMessage")
	public String getMessage() {
		return "This is first real test of cicd... !!";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(CicdApplication.class, args);
	}

}
