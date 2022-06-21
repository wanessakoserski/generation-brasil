package oo.compra;

public class Item {

	String nome;
	int quantidade;
	double preco;
	Sacola sacola;
	
	Item(String nome, int quantidade, double preco)
	{
		this.nome = nome;
		this.quantidade = quantidade;
		this.preco = preco;
	}
	
}
