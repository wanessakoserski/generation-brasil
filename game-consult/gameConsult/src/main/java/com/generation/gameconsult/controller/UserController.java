package com.generation.gameconsult.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.generation.gameconsult.model.User;
import com.generation.gameconsult.repository.UserRepository;

@RestController
@RequestMapping("/user")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class UserController {
	
	@Autowired
	private UserRepository repository;

	@GetMapping
	public ResponseEntity<List<User>> getAll() {
		return ResponseEntity.ok(repository.findAll());
	}
	
	
	
	@PostMapping
	public ResponseEntity<User> post(@RequestBody User user) {
		return ResponseEntity.status(HttpStatus.CREATED)
								.body(repository.save(user));
	}
	
	@PutMapping
	public ResponseEntity<User> put (@RequestBody User user) {
		return ResponseEntity.ok(repository.save(user));
	}

	
}
