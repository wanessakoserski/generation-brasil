package fundamentos;

import java.util.Scanner;

public class ConversaoTemperatura {

		public static void main(String[] args) {
		
			// (°F - 32) x 5/9 = °C
			// (°C / 5/9) + 32 = °F
			Scanner scanner = new Scanner (System.in);
			
			final int aritmetica = 32;
			final double geometrica = 5/9.0;
			double resultado = 0; //Programa pediu pra inicializar
			
			System.out.printf("Digite o valor a ser convertido: ");
			double numUser = scanner.nextDouble();
			System.out.printf("Informe \nc - se inseriu em Celsius \n"
							+ "f - se inseriu em fahrenheit\naqui: ");
			char charUser = scanner.next().charAt(0);
			
			switch (charUser)
			{
				case 'f': //necessario minuscula por conta de ser char
					resultado = (numUser - aritmetica) * geometrica;
					break;
				case 'c':
					resultado = (numUser/geometrica) + aritmetica;
					break;
				default:
					System.out.println("Opção inválida");
					break;
			}
			
			System.out.printf("\n\nTemperatura convertida: " + resultado);
		}
}
