package com.vade.application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.vade.application.entity.Users;
import com.vade.application.service.UserServices;

@Controller
public class UserController {

	@Autowired
	UserServices uService;

	// this method is for register the user
	@PostMapping("/create")
	public String register(@RequestParam("name") String name, @RequestParam("email") String email,
			@RequestParam("pass") String pass, @RequestParam("role") String role, @RequestParam("phone") String phone) {
		// System.out.println(name+email+pass+role+phone);

		boolean emailExist = uService.checkEmail(email);

		if (emailExist == false) {
			Users user = new Users();
			user.setUserEmail(email);
			user.setUsermobile(phone);
			user.setUserName(name);
			user.setUserPassword(pass);
			user.setUserrole(role);
			uService.cerateUsers(user);
			System.out.println("user registered");
			return "redirect:/signin";
		} else {
			System.out.println("user already registered");
			return "redirect:/signup";
		}
	}

	// this mehtod is for login the registered user
	@PostMapping("/login")
	public String validateUsers(@RequestParam("email") String email, @RequestParam("pass") String pass) {
		// System.out.println(email + pass);
		boolean uExist = uService.validate(email, pass);
		if (uExist == true) {
			String urole = uService.getRole(email);
			if (urole.equals("student")) {
				System.out.println("loged in as student");
				return "redirect:/student";

			} else {
				System.out.println("loged in as trainer");
				return "redirect:/trainer";

			}
		} else {
			System.out.println("email not registered please register first");
			return "redirect:/signin";
		}

	}

}
