package arrays.collections.set;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {

	@SuppressWarnings({ "rawtypes", "unchecked" }) // Silenciar advertências feitas pelo Eclipse
	public static void main(String[] args) {
		HashSet conjunto = new HashSet(); 
		
		conjunto.add(1.2); // automaticamento do double -> Double (Wrappers)
		conjunto.add(true);
		conjunto.add("TESTE");
		conjunto.add(1);
		conjunto.add("Teste");
		conjunto.add('x');
		conjunto.add("Teste"); // Não é contado porque é valor repetido
		
		System.out.println("Tamanho é " + conjunto.size());
		
		System.out.println(conjunto.remove("Teste"));
		
		System.out.println("Tamanho é " + conjunto.size());
		
		System.out.println(conjunto.contains('x'));
		
		Set nums = new HashSet();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		System.out.println(conjunto);
		System.out.println(nums);
		
		conjunto.addAll(nums);
		System.out.println(conjunto);
		
		conjunto.clear();
		System.out.println(conjunto);
	}
}
