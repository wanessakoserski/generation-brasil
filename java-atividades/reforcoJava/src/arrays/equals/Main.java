package arrays.equals;

public class Main {

	public static void main(String[] args) {
	
		var userOne = new Usuario("Maria Joaquina", "maria.joana@gmail.com");
		var userTwo = new Usuario("Maria Joaquina", "maria.joana@gmail.com");
		
		// Comparando endereço de memória
		System.out.println(userOne == userTwo);
		
		// Comparando com o equals sobreescrito 
		System.out.println(userOne.equals(userTwo));
	}

}
