package oo.comida;

public class Main {

	public static void main(String[] args) {
		
		Pessoa convidado = new Pessoa(99.65);
		
		Arroz arroz = new Arroz(0.21);
		Feijao feijao = new Feijao (0.14);
		
		System.out.println(convidado.getPeso());
		
		convidado.comer(arroz);
		convidado.comer(feijao);
		System.out.println(convidado.getPeso());
		
		Sorvete sobremesa = new Sorvete(0.5);
		
		convidado.comer(sobremesa);
		System.out.println(convidado.getPeso());
	}

}
