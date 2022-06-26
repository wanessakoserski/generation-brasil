package utilFunction;

import java.util.function.Function;

public class Funcao {

	public static void main(String[] args) {
		
		Function<Integer, String> parOuImpar = 
				numero -> numero % 2 == 0 ? "Par" : "Ímpar";
				
		System.out.println(parOuImpar.apply(0));
		
		Function<String, String> resultado = 
				valor -> "Esse número é " + valor;
				
		Function<String, String> empolgado =
				valor -> valor + "!!!";
				
		String resultadoFinal = 
				parOuImpar
				.andThen(resultado)
				.andThen(empolgado)
				.apply(33);

		System.out.println(resultadoFinal);
	}

}
