package br.com.generation.lista04;

import java.util.Scanner;

public class maiorValor {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		double maior = 0;
		double[] vetor = new double[5];
		
		for (int i = 0; i < vetor.length; i++)
		{
			System.out.printf("Digite um número: ");
			vetor[i] = scanner.nextDouble();
			
			System.out.printf("Na posição " + i + " está guardado " + vetor[i] + "\n");
			if (vetor[i] > maior || i == 0)
			{
				maior = vetor[i];
			}
		}
		
		System.out.println("\nO maior número é " + maior);

	}

}
