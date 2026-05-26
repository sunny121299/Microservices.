package com.sunny.user.service.services;

import java.util.List;

import com.sunny.user.service.entities.User;

public interface UserService {
	
//	user operations
	
//	create user
	User saveUser(User user);
	
//	get all user
	List<User> getAllUser();
	
//	get user by userid
	User getUser(String userId);
	
//	delete user
	void deleteUser(String userId);
	
//	update user
	User updateUser(User user);
	

}
