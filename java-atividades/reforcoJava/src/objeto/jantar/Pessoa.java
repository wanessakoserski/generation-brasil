package objeto.jantar;

public class Pessoa {

	String nome;
	double peso;
	
	Pessoa(String nome, double peso)
	{
		this.nome = nome;
		this.peso = peso;
	}
	
	double comer(double caloria, double pesoPrato)
	{
		
		System.out.println("\nNham...Nham...");
		this.peso += caloria;
		pesoPrato -= caloria;
		
		return pesoPrato;
	}
	
	String consultarPeso()
	{
		return "O seu peso atual é " + this.peso;
	}
	
}
