package utilFunction;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Fornecedor {

	public static void main(String[] args) {
		
		Supplier<List<String>> aList = 
				() -> Arrays.asList("Lia", "Bia", "Mia");
				
		System.out.println(aList.get());

	}

}
