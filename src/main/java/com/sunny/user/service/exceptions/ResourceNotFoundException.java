package com.sunny.user.service.exceptions;

public class ResourceNotFoundException extends RuntimeException{

	public ResourceNotFoundException() {
		super("Resource Not Found on server !!");
		// TODO Auto-generated constructor stub
	}

	public ResourceNotFoundException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	
	

}
