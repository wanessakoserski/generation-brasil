package arrays.collections.set;

import java.util.HashSet;

public class Hashcode {

	public static void main(String[] args) {
		
		HashSet<Usuario> usuarios = new HashSet<Usuario>();
		
		usuarios.add(new Usuario("Pedro"));
		usuarios.add(new Usuario("Ana"));
		usuarios.add(new Usuario("Gustavo"));
		
		System.out.println(usuarios.contains(new Usuario("Gustavo")));
		
	}

}
