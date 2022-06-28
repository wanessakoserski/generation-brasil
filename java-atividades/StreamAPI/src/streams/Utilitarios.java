package streams;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Utilitarios {

	public final static UnaryOperator<String> maiuscula = n -> n.toUpperCase();
	public final static  UnaryOperator<String> primeiraLetra = n -> n.charAt(0) + "";
	
	public final static  String grito(String n) {
		return n + "!!! ";
	}
	
	public final static Function<Integer, String> binario = num -> {
		String binario = "";
		
		while (num > 1) {
			binario = num%2 + binario;
			num = num / 2;
		}
		binario = num != 0 ? (1 + binario): "0";
		
		return binario;
	};
	
	public final static UnaryOperator<String> inverter = string -> {
		String newString = "";
		for(int i = string.length() - 1; i >= 0; i--) {
			newString += string.charAt(i);
		}
		
		return newString;
	};
	
	public final static int decimal(String string) {
		int numTotal = 0;
		for(int i = string.length() - 1; i >= 0; i--) {
			char letra = string.charAt(i);
			int num = Character.getNumericValue(letra);
			numTotal += (num *  Math.pow(2, i));
		} 
		
		return numTotal;
	}
	
}
