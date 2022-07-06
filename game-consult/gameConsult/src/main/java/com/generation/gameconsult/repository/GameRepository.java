package com.generation.gameconsult.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.generation.gameconsult.model.Game;

@Repository
public interface GameRepository extends JpaRepository<Game, Long> {

	public List<Game> findAllByTitleContainingIgnoreCase(String title);
	public List<Game> findAllByDescriptionContainingIgnoreCase(String description);
	
}
