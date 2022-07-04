package com.generation.mercadolimpo.repository;

import java.util.List;
import org.springframework.stereotype.Repository;
import com.generation.mercadolimpo.model.Categoria;
import com.generation.mercadolimpo.model.Produto;
import com.generation.mercadolimpo.model.Usuario;

@Repository
public interface ProdutoRepository {

	public List<Produto> findAllByNameContainingIgnoreCase(String produto);
	public List<Produto> findAllByDescriptionContainingIgnoreCase(String descricao);	
	public List<Produto> findAllByPriceContainingIgnoreCase(double preco);
	public List<Produto> findAllByStockContainingIgnoreCase(boolean estoque);
	public List<Produto> findAllByCategoryContainingIgnoreCase(Categoria categoria);
	public List<Produto> findAllByUserContainingIgnoreCase(Usuario usuario);
	
}
