package com.sunny.user.service.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sunny.user.service.entities.User;

public interface UserRepository extends JpaRepository<User, String>{
	

}
