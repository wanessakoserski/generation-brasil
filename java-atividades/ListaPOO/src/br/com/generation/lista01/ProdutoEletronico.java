package br.com.generation.lista01;

public class ProdutoEletronico {

	String produto;
	String marca;
	String funcao;
	double preco;
	double peso;
	boolean funcionando = true;
	boolean energia = true;
	
	void quebrar()
	{
		funcionando = false;
	}
	
	void desligar()
	{
		energia = false;
	}
	
	void ligar()
	{
		energia = true;
	}
	
	void status()
	{
		if (funcionando == true && energia == true)
		{
			System.out.println("Produto em ordem");
		}
		else if (funcionando == true)
		{
			System.out.println("Produto não energizado");
		}
		else
		{
			System.out.println("Produto precisa ser enviado para manutenção");
		}
	}
	
}
