package com.vade.application.repositery;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vade.application.entity.Users;

public interface UserRepositery extends JpaRepository<Users, Integer>{


	Users getByuserEmail(String email);

	boolean existsByuserEmail(String email);
}
