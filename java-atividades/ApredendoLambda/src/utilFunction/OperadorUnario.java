package utilFunction;

import java.util.function.UnaryOperator;

public class OperadorUnario {

	public static void main(String[] args) {
		
		UnaryOperator<Integer> plusTwo = n -> n + 2;
		UnaryOperator<Integer> timesTwo = n -> n * 2;
		UnaryOperator<Integer> squared = n -> n * n;
		
		System.out.println(plusTwo
										.andThen(timesTwo)
										.andThen(squared)
										.apply(0));
		
		int result = squared
								.compose(timesTwo)
								.compose(plusTwo)
								.apply(0);
		
		System.out.println(result);

	}

}
