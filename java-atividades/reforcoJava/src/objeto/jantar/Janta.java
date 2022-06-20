package objeto.jantar;

public class Janta {
	
	public static void main(String[] args) {
		
		var Pedrin = new Pessoa("Pedro", 78.0);
		var Larinha = new Pessoa("Larissa", 64.0);
		
		var arroz = new Comida("arroz", 6.0);
		var feijao = new Comida("feijão", 3.0);
		
		while (arroz.pesoPrato > 0 || feijao.pesoPrato > 0)
		{
			if (arroz.pesoPrato > 0)
			{
				arroz.pesoPrato = Pedrin.comer(arroz.pesoColher, arroz.pesoPrato);
			}
			
			if (feijao.pesoPrato > 0)
			{
				feijao.pesoPrato = Larinha.comer(feijao.pesoColher, feijao.pesoPrato);
			}
			
			System.out.printf("\nPeso de Pedrin: %f"
									+ "\n Peso de Larinha: %f"
									+ "\n Falta %.4fkg de arroz e %.4f de feijão no prato", 
									Pedrin.peso, Larinha.peso, arroz.pesoPrato, feijao.pesoPrato);
		}
		
		System.out.printf("\nPeso de Pedrin: %f"
				+ "\n Peso de Larinha: %f"
				+ "\n Falta %.4fkg de arroz e %.4f de feijão no prato", 
				Pedrin.peso, Larinha.peso, arroz.pesoPrato, feijao.pesoPrato);
		
	}

}
