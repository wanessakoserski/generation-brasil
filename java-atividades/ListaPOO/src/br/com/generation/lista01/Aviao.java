package br.com.generation.lista01;

public class Aviao {

	String modelo;
	String porte;
	int passageiros;
	
	String partida()
	{
		return "Avião começando a rodar na pista";
	}
	
	String levantarVoo()
	{
		return "Avião decolando";
	}
	
	String aterrisar()
	{
		return "Indo ao chão";
	}
	
	void getPorte(String porte)
	{		
		switch (porte)
		{
			case "pequeno", "Pequeno", "PEQUENO":
				this.porte = "Pequeno";
				break;
			case "médio", "Médio", "MÉDIO":
				this.porte = "Médio";
				break;
			case "grande", "Grande", "GRANDE":
				this.porte = "Grande";
				break;
			default:
				System.out.println("\nEntrada de dados errada");
				System.exit(0);
				break;
		}
	}
	
}
