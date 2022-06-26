package operacoes;

public class Main {

	public static void main(String[] args) {
	
		Calculo calculo = new Soma();
		System.out.println(calculo.executar(2, 3));
		
		calculo = new Multipllicar();
		System.out.println(calculo.executar(2, 3));

	}

}
