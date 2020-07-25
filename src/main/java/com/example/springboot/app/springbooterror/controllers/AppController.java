package com.example.springboot.app.springbooterror.controllers;

import com.example.springboot.app.springbooterror.errors.UserNotFoundException;
import com.example.springboot.app.springbooterror.models.domain.User;
import com.example.springboot.app.springbooterror.services.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class AppController {

	@Autowired
	private UserService userService;
	
	@GetMapping({"", "/", "/index"})
	public String index() {
		Integer math = Integer.parseInt("10x");
		return "index";
	}

	@GetMapping("/view/{id}")
	public String view(@PathVariable("id") Integer id, Model model) {
		User result = userService.findByIdOptional(id).orElseThrow(() -> new UserNotFoundException(id.toString()));
		model.addAttribute("user", result);
		return "view";
	}
}
