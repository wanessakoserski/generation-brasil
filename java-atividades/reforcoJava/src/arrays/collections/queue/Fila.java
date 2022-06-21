package arrays.collections.queue;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<String>();
		
		fila.add("Ana");
		fila.offer("Bia");  // se a fila tiver restrição de tamanho não vai dar errao, mas vai retornar falso
		fila.offer("Daniel");
		fila.offer("Carlos");
		fila.offer("Marcia");
		
		System.out.println(fila.peek()); // fila vazia - retorna null
		System.out.println(fila.peek());
		System.out.println(fila.element()); // fila vazia - retorna erro
		
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		
	}

}
