package com.example.springboot.app.springbooterror.services;

import java.util.List;
import java.util.Optional;

import com.example.springboot.app.springbooterror.models.domain.User;

public interface UserService {
	
	public List<User> getUsers();

	public User findById(Integer id);

	public Optional<User> findByIdOptional(Integer id);

}
