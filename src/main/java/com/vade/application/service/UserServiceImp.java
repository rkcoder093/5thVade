package com.vade.application.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vade.application.entity.Users;
import com.vade.application.repositery.UserRepositery;

@Service
public class UserServiceImp implements UserServices {

	@Autowired
	UserRepositery uRepo;

	@Override
	public void cerateUsers(Users user) {
		uRepo.save(user);

	}

	@Override
	public boolean validate(String email, String pass) {
		if (uRepo.existsByuserEmail(email)) {
			Users uEmail = uRepo.getByuserEmail(email);
			System.out.println(uEmail);
			String dPass = uEmail.getUserPassword();
			if (pass.equals(dPass)) {
				return true;
			} else {
				return false;
			}
		}
		else{
			System.out.println("email doesnot exists");
			return false;
		}
	}

	@Override
	public boolean checkEmail(String email) {
		return uRepo.existsByuserEmail(email);
	}

	@Override
	public String getRole(String email) {
		return uRepo.getByuserEmail(email).getUserrole();

	}

}
