package utilFunction;

import java.util.Arrays;
import java.util.List;

public class Foreach {

	public static void main(String[] args) {
		
		List<String> aprovados = Arrays.asList("Ana", "Bia", "Lia");

		System.out.println("forma tradicional");
		for (String nome: aprovados)
		{
			System.out.println(nome);
		}
		
		System.out.println("\nLambda 01");
		aprovados.forEach((nome) ->  System.out.println(nome + "!") );
		
		System.out.println("\nMethod Reference 01");
		aprovados.forEach(System.out::println);
		
		System.out.println("\nLambda 02");
		aprovados.forEach(nome ->  imprimir(nome));
		
		System.out.println("\nMethod Reference 02");
		aprovados.forEach(Foreach::imprimir);
		
	}
	
	static void imprimir(String nome) {
		System.out.println("Oi, meu nome é " + nome);
	}
	

}
