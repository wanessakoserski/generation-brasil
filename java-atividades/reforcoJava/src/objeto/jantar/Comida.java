package objeto.jantar;

public class Comida {
	
	String nome;
	double pesoPrato;
	double pesoColher;
	
	Comida(String nome, double pesoPrato)
	{
		this.nome = nome;
		this.pesoPrato = pesoPrato;
		this.pesoColher = this.pesoPrato/6.0;
	}

}
