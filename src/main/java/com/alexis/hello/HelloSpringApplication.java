package com.alexis.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class HelloSpringApplication {

	@RequestMapping("/")
	@ResponseBody
	String home() {
		return "~*~*~*~*~Hello Alexis~*~*~*~*~";
	}

	@RequestMapping("/hello")
	@ResponseBody
	String hellopage() {
		return "Hello page!";
	}

	public static void main(String[] args) {

		SpringApplication.run(HelloSpringApplication.class, args);
	}
}
