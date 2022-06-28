package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Desafio {

	public static void main(String[] args) {
		
		Consumer<Object> print = System.out::println;
		List<Integer> nums = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);
				
		/*
		 * 1. Número para string binário... 6 => "110"
		 * 2. Reverter a string... "110" = "011"
		 * 3. Converter de volta para inteiro => "011" => 3
		 */
		
		nums.stream()
			.map(Utilitarios.binario)
			.map(Utilitarios.inverter)
			.map(Utilitarios::decimal)
			.forEach(print);
		
		nums.stream()
					.map(Integer::toBinaryString)
					.forEach(print);
		
		
		
	}

}
