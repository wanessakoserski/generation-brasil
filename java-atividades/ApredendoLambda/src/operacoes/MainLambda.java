package operacoes;

public class MainLambda {

	public static void main(String[] args) {
		
		Calculo soma = (x, y) -> {
			return x + y;
		};
		
		System.out.println(soma.executar(2, 3));
		
		
		soma = (x, y) -> x * y; // return é o próprio resultado, isso é um retorno implicito
											// (possível por uma sentença de código
		
		System.out.println(soma.executar(2, 3));
	}
	
}
