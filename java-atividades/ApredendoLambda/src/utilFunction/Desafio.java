package utilFunction;

import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class Desafio {

	public static void main(String[] args) {
		
		Produto produto = new Produto("iPad", 3235.89, 0.13);
		
		/*
		 * 1. A partir do produto calcular o preço com desconto
		 * 2. Imposto municipal: >= 2.500 (8,5%) e < 2.500 (Isento)
		 * 3. Frete: >= 3.000 (100) e < 3.000 (50)
		 * 4. Arredondar: Deixar duas casas decimais
		 * 5. Formatar: R$1234,56
		 */
		
		
		Function<Produto, Double> precoFinal = prod -> {
				double result = prod.preco * (1 - prod.desconto);
				return result;
		};
		double preco = precoFinal.apply(produto);
		System.out.println("Preço do produto com o desconto é " + preco);
		
		
		
		Predicate<Double> temImposto = p -> p >= 2500;	
		UnaryOperator<Double> imposto = i -> i * 0.085;		
		if (temImposto.test(preco)) {
			System.out.printf("É necessário pagar %.2f reais de imposto\n", imposto.apply(preco));
		}
		
		
		
		Function<Double, Integer> frete = f -> f >= 3000 ? 100 : 50;		
		System.out.println("O preço do frete é " + frete.apply(preco));
		
		
		
		 UnaryOperator<Double> arredondar = a -> {
			 double rounded = Math.round(a * 100.0)/100.0;
			 return rounded;
		 };
		 System.out.println("Preço com o valor arrendodado: " + arredondar.apply(preco));
		 preco = arredondar.apply(preco);
		 
		 Function<Double, String> precoFormatado = f -> {
			String numero = Double.toString(f);
			numero = numero.replace(".", ",");
			return "R$" + numero;
		 };
		 
		 System.out.println("Preço formatado: " + precoFormatado.apply(preco));

	}

}
