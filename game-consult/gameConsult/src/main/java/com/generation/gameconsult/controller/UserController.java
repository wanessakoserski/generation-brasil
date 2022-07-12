package com.generation.gameconsult.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.generation.gameconsult.model.User;
import com.generation.gameconsult.model.UserLogIn;
import com.generation.gameconsult.service.UserService;

@RestController
@RequestMapping("/user")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class UserController {
	
	@Autowired
	private UserService userService;

	@PostMapping("/login")
	public ResponseEntity<UserLogIn> Autentication(@RequestBody Optional<UserLogIn> user) {
		return userService.Login(user).map(m -> ResponseEntity.ok(m))
				.orElse(ResponseEntity.status(HttpStatus.UNAUTHORIZED).build());
	}
	
	@PostMapping("/register")
	public ResponseEntity<User> post(@RequestBody User user) {
		return ResponseEntity.status(HttpStatus.CREATED)
				.body(userService.RegisterUser(user));
	}
	
}
