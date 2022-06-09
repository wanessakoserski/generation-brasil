package br.com.generation.lista04;

import java.util.Random;

public class dadoLancado {

	public static void main(String[] args) {
		
		Random random = new Random();
		
		int[] vetor = new int[10];
		int maior = 0, repeticoes = 1;
		
		for (int i = 0; i < 10; i++)
		{
			vetor[i] = random.nextInt(6) + 1;
			
			System.out.printf("\nO número lançado foi %d", vetor[i]);
			
			if (vetor[i] >= maior || i == 0)
			{
				if (vetor[i] == maior)
				{
					repeticoes++;
				}
				else 
				{
					maior = vetor[i];
					repeticoes = 1;
				}
			}
		}
		
		System.out.println("\nRepetiu " + repeticoes + "x");

	}

}
