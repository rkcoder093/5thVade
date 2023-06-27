package com.vade.application.service;

import com.vade.application.entity.Users;

public interface UserServices {

	void cerateUsers(Users user);

	boolean validate(String email, String pass);

	boolean checkEmail(String email);

    String getRole(String email);

}
