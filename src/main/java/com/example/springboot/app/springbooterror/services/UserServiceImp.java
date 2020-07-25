package com.example.springboot.app.springbooterror.services;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import com.example.springboot.app.springbooterror.models.domain.User;

import org.springframework.stereotype.Service;

@Service
public class UserServiceImp implements UserService {

	private List<User> users;

	public UserServiceImp() {
		User u1 = new User(1, "Jhon", "Doe");
		User u2 = new User(2, "Karl", "Doe");
		User u3 = new User(3, "Jenniffer", "Doe");
		User u4 = new User(4, "Cintia", "Doe");
		users = Arrays.asList(u1, u2, u3, u4);
	}

	@Override
	public List<User> getUsers() {
		return users;
	}

	@Override
	public User findById(Integer id) {
		User result = null;
		for (int i = 0; i < users.size() && result == null; i++) {
			User currentUser = users.get(i);
			if (currentUser.getId().equals(id)) {
				result = currentUser;
			}
		}
		return result;
	}

	@Override
	public Optional<User> findByIdOptional(Integer id) {
		User result = findById(id);
		return Optional.ofNullable(result);
	}
	
}
