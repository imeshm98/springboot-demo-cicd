package com.imeshgroup.springbootdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootDemoApplication {

	@GetMapping("/welcome")
	public String welcome(){
		return "You all are in welcome page";
	}

	@GetMapping("/login")
	public String login(){
		return "your in login page";
	}

	@GetMapping("/")
	public String home(){
		return "your in Home page";
	}


	//	git init
	//	git add README.md
	//	git commit -m "first commit"
	//	git branch -M main
	//	git remote add origin https://github.com/imeshm98/springboot-demo-cicd.git
	//	git push -u origin main

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDemoApplication.class, args);
	}

}
