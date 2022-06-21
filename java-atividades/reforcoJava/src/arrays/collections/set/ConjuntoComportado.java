package arrays.collections.set;

import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {

	public static void main(String[] args) {
		
		//Set<String> lista = new HashSet<String>(); // <>Definir quais tipos serão inserido
		// pode escrever Set<String> lista = new HashSet<>();
		SortedSet<String> lista = new TreeSet<String>();  // Ordena de ordem alfabetica
		//pode escrever Set<String> lista = new TreeSet<String>(); 
		
		
		lista.add("Lucas");
		lista.add("Carla");
		lista.add("Matheus");
		lista.add("Luna");
		lista.add("Ash");
		
		for (String nome: lista)
		{
			System.out.println(nome);
		}
		
	}

}
