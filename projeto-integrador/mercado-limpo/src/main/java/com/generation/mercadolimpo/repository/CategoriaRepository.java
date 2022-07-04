package com.generation.mercadolimpo.repository;

import java.util.List;
import org.springframework.stereotype.Repository;
import com.generation.mercadolimpo.model.Categoria;

@Repository
public interface CategoriaRepository {

	public List<Categoria> findAllByNameContainingIgnoreCase(String categoria);
	public List<Categoria> findAllByTypeContainingIgnoreCase(String tipo);
	
}
