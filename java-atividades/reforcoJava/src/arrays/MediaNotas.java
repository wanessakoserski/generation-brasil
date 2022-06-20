package arrays;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class MediaNotas {

	public static void main(String[] args) {
		Locale.setDefault(new Locale("en", "US"));
		
		Scanner input = new Scanner(System.in);
		
		System.out.printf("Digite quantas notas você gostaria de calcular: ");
		int tamanho = input.nextInt();
		
		double[] notas = new double[tamanho];
		
		// entrada de dados
		for(int i = 0; i < notas.length; i++)
		{
			System.out.printf("%d° nota: ", i + 1);
			notas[i] = input.nextDouble();
		}
		
		//calculo da média
		double soma = 0;
		for(double nota: notas)
		{
			soma += nota;
		}
		
		double media = soma/tamanho;
		
		System.out.println(Arrays.toString(notas));
		System.out.printf("A média dessas notas é %.1f", media);
		
		input.close();
	}
}
