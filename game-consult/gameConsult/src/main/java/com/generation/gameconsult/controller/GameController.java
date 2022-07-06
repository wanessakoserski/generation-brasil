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

import com.generation.gameconsult.model.Game;
import com.generation.gameconsult.repository.GameRepository;

@RestController
@RequestMapping("/game")
@CrossOrigin("*")
public class GameController {

	@Autowired
	private GameRepository repository;
	
	@GetMapping
	public ResponseEntity<List<Game>> getAll() {
		return ResponseEntity.ok(repository.findAll());
	}
	
	@GetMapping("/title/{title}")
	public ResponseEntity<List<Game>> getByTitle(@PathVariable String title) {
		return ResponseEntity.ok(repository.findAllByTitleContainingIgnoreCase(title));
	}
	
	@GetMapping("description/{description}")
	public ResponseEntity<List<Game>> getByDescription(@PathVariable String description) {
		return ResponseEntity.ok(repository.findAllByDescriptionContainingIgnoreCase(description));
	}
	
	@GetMapping("id/{id}")
	public ResponseEntity<Game> getById(@PathVariable long id) {
		return repository.findById(id)
						.map(m -> ResponseEntity.ok(m))
						.orElse(ResponseEntity.notFound().build());
	}
	
	@PostMapping
	public ResponseEntity<Game> post(@RequestBody Game game) {
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(game));
	}
	
	@PutMapping
	public ResponseEntity<Game> put(@RequestBody Game game) {
		return ResponseEntity.ok(repository.save(game));
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable long id) {
		repository.deleteById(id);
	}
	
}
