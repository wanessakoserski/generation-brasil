package utilFunction;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {

	public static void main(String[] args) {
		
		Consumer<Produto> imprimir = 
				p -> System.out.println(" - " + p.nome);

		Produto produto1 = new Produto ("Caneta Vermelha", 18.50, 0);
		Produto produto2 = new Produto ("Caneta Azul", 16.50, 0);
		Produto produto3 = new Produto ("Caneta Verde", 12.50, 0);
		Produto produto4 = new Produto ("Caneta Amarelo", 12.50, 0.5);
		
		//imprimir.accept(produto1);
		
		List<Produto> produtos = Arrays.
				asList(produto1, produto2, produto3, produto4);
		
		produtos.forEach(imprimir);
		produtos.forEach(p -> System.out.println(p.preco));
		produtos.forEach(System.out::println);
		
	}

}
