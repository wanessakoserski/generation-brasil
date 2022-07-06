package com.generation.gameconsult.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.generation.gameconsult.model.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
	
	public List<Category> findAllByCategoryContainingIgnoreCase(String category);

}
