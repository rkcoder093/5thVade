package com.vade.application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NavController {

	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@GetMapping("/signin")
	public String login() {
		return "login";
	}
	
	@GetMapping("/signup")
	public String register() {
		return "register";
	}

		@GetMapping("/student")
	public String studentLogin() {
		return "student";
	}


		@GetMapping("/trainer")
	public String trainerLogin() {
		return "trainer";
	}


	@GetMapping("/addc")
	public String addCourse() {
		return "createCourse";
	}
		@GetMapping("/addl")
	public String addLesson() {
		return "addLesson";
	}
	
}
