package com.generation.mercadolimpo.repository;

import java.util.List;
import org.springframework.stereotype.Repository;
import com.generation.mercadolimpo.model.Usuario;

@Repository
public interface UsuarioRepository {

	public List<Usuario> findAllByNameContainingIgnoreCase(String nome);
	public List<Usuario> findAllByEmailContainingIgnoreCase(String email);
	
}
