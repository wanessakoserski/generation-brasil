package utilFunction;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class OperadorBinario {

	public static void main(String[] args) {
		
		BinaryOperator<Double> average =
				(Double n1, Double n2) -> (n1 + n2) / 2;
				
		System.out.println(average.apply(10.0, 8.5));
		
		BiFunction<Double, Double, String> result = (n1, n2) -> {
			double averageFunction = (n1 + n2) / 2;
			return averageFunction >= 7 ? "Aprovado" : "Reprovado";
		};
		
		System.out.println(result.apply(9.7, 2.5));
		
		Function<Double, String> concept = 
				m -> m >= 7 ? "Aprovado" : "Reprovado";
				
		System.out.println(average.andThen(concept).apply(8.7, 8.2));

	}

}
