package br.com.generation.lista02;

public class Main {
	
	public static void main(String[] args) {
		
		Cachorro toto = new Cachorro();
		
		toto.nome = "Toto";
		toto.idade = 5;
		
		System.out.printf("\nO nome dele é " + toto.nome +"\n"
									+ "A idade dele é " + toto.idade +" anos\n"
									+ "Ele faz " + toto.emitirSom() +"\n"
									+ "Olha ele " + toto.correr() +"\n");
		
		Cavalo alasao = new Cavalo();
		
		alasao.nome = "Alasão";
		alasao.idade = 10;
		
		System.out.printf("\nO nome dele é " + alasao.nome +"\n"
									+ "A idade dele é " + alasao.idade +" anos\n"
									+ "Ele faz " + alasao.emitirSom() +"\n"
									+ "Olha ele " + alasao.correr() +"\n");
		
		Preguica flash = new Preguica();
		
		flash.nome = "Flash";
		flash.idade = 8;
		
		System.out.printf("\nO nome dele é " + flash.nome +"\n"
									+ "A idade dele é " + flash.idade +" anos\n"
									+ "Ele faz " + flash.emitirSom() +"\n"
									+ "Olha ele " + flash.correr() +"\n");
	}

}
