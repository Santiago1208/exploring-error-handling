package com.example.springboot.app.springbooterror.errors;

public class UserNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public UserNotFoundException(String userId) {
		super("The user with ID ".concat(userId).concat(" was not found"));
	}
	
}
