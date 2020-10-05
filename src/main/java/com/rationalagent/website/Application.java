package com.rationalagent.website;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@SpringBootApplication
public class Application {


/*	@RequestMapping("/error")
	String error() {
		return "error";
	}*/

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
