package br.com.generation.lista01;

public class Cliente {

	String nome;
	String email;
	int idade;
	int itensSacola = 0;
	int itensComprados = 0;
	boolean conta = false;
	
	String verificarConta()
	{
		if (conta == true)
			return "Bem vindo de volta";
		else
			return "Primeiro, precisamos fazer seu cadastro";
	}
	
	void cadastrar(String nome, String email, int idade)
	{
		
		this.nome = nome;
		this.email = email;
		this.idade = idade;
		this.conta = true;
	}
	
	void adicionarItem()
	{
		this.itensSacola++;
	}
	
	void comprar()
	{
		this.itensComprados = this.itensSacola;
		this.itensSacola = 0;
	}
	
}
