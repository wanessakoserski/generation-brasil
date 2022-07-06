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
	
	@GetMapping("email/{email}")
	public ResponseEntity<User> getByEmail(@PathVariable String email) {
		return repository.findById(email)
							.map(m -> ResponseEntity.ok(m))
							.orElse(ResponseEntity.notFound().build());
	}
	
	@GetMapping("name/{username}")
	public ResponseEntity<List<User>> getByName(@PathVariable String username) {
		return ResponseEntity.ok(repository.findAllByUsernameContainingIgnoreCase(username));
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
	
	@DeleteMapping("/{email}")
	public void delete(@PathVariable String email) {
		repository.deleteById(email);
	}
	
}
