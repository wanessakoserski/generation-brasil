package operacoes;

@FunctionalInterface // Força a interface ter apenas um método, nesse caso para uso de Lambda
public interface Calculo {

	abstract double executar(double a, double b);
	
	// exceções por já ter retorno
	
	default String mensagem() {
		return "Olá";
	}
	
	static String bomdia() {
		return "Bom dia!";
	}
	
}
