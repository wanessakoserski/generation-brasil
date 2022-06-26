package utilFunction;

import java.util.function.BinaryOperator;

public class Main {

	public static void main(String[] args) {
		
		BinaryOperator<Double> calcular = (a, b) -> {return a + b; };
		System.out.println(calcular.apply(2.0, 3.0));

		BinaryOperator<Integer> calcularApenasInteios = (a, b) -> {return a + b; };
		System.out.println(calcularApenasInteios.apply(2, 3));
		
	}

}
