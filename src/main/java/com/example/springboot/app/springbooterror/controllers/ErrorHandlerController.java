package com.example.springboot.app.springbooterror.controllers;

import java.util.Date;

import com.example.springboot.app.springbooterror.errors.UserNotFoundException;

import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ErrorHandlerController {
	
	@ExceptionHandler(ArithmeticException.class)
	public String arithmeticError(Exception e, Model model) {
		model.addAttribute("error", "Arithmetic exception");
		model.addAttribute("message", e.getMessage());
		model.addAttribute("status", HttpStatus.INTERNAL_SERVER_ERROR.value());
		model.addAttribute("timestamp", new Date());
		return "error/arithmetic";
	}

	@ExceptionHandler(NumberFormatException.class)
	public String numberFormatError(Exception e, Model model) {
		model.addAttribute("error", "Number format exception");
		model.addAttribute("message", e.getMessage());
		model.addAttribute("status", HttpStatus.INTERNAL_SERVER_ERROR.value());
		model.addAttribute("timestamp", new Date());
		return "error/numberFormat";
	}

	@ExceptionHandler(UserNotFoundException.class)
	public String userNotFoundError(Exception e, Model model) {
		model.addAttribute("error", "User not found exception");
		model.addAttribute("message", e.getMessage());
		model.addAttribute("status", HttpStatus.INTERNAL_SERVER_ERROR.value());
		model.addAttribute("timestamp", new Date());
		return "error/userNotFound";
	}

}
