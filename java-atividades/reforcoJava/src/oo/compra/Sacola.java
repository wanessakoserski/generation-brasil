package oo.compra;

import java.util.ArrayList;

public class Sacola extends Cliente {

	String oi;
	ArrayList<Item> itens = new ArrayList<Item>();	
	
	void adicionarItem(Item item)
	{
		itens.add(item);
		item.sacola = this;
	}
	
	void adicionarItem(String nome, int quantidade, double preco)
	{
		this.adicionarItem(new Item(nome, quantidade, preco));
	}
	
	double obterValorTotal()
	{
		double total = 0;
		
		for (Item item: itens)
		{
			total += item.quantidade * item.preco;
		}
		
		return total;
	}
	
}
