package arrays.collections.list;

import java.util.ArrayList;

public class Lista {

	public static void main(String[] args) {
		
		ArrayList<Usuario> lista = new ArrayList<>(); // pode ser List<Usuario> lista = new ArrayList<>();

		var user1 = new Usuario("Ana");
		lista.add(user1);
		lista.add(new Usuario("Carlos"));
		lista.add(new Usuario("Beatriz"));
		lista.add(new Usuario("Mario"));
		lista.add(new Usuario("Rafaela"));
		
		System.out.println(lista.get(3)); //implicitamente chama o metodo toString
		
		for (Usuario user: lista)
		{
			System.out.println(user.nome);
		}
		
		System.out.println(lista.remove(new Usuario("Mario")));
		System.out.println(lista.remove(2));
		System.out.println(lista.remove(new Usuario("Mario")));
		
		
		
	}
}
