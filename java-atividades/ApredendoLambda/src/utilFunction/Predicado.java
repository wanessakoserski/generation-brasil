package utilFunction;

import java.util.function.Predicate;

public class Predicado {

	public static void main(String[] args) {
		
		Predicate<Produto> isCaro = 
						prod -> (prod.preco * (1 - prod.desconto)) >= 750;
		
		Produto produto = new Produto("Notebook", 2345.90, 0.05);
		
		System.out.println(isCaro.test(produto));
		
	}

}