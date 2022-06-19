package fundamentos;

public class CalcularFormula {

	public static void main(String[] args) {
		
		int numeradorPrimeiraFracao = (int) Math.pow(6 * (3 + 2), 2);
		int denominadorPrimeiraFracao = 3 * 2;
		int PrimeiraFracao = numeradorPrimeiraFracao/denominadorPrimeiraFracao;
		
		int numeradorSegundaFracao = (1 - 5) * (2 - 7);
		int denominadorSegundaFracao =  2;
		int SegundaFracao = (int) Math.pow(numeradorSegundaFracao/denominadorSegundaFracao, 2);
		
		int numerador = (int) Math.pow(PrimeiraFracao - SegundaFracao, 3);
		int denominador = (int) Math.pow(10, 3);
		int resultado = numerador/denominador;
		
		System.out.println(resultado);
		
	}

}
