package br.com.generation.lista04;

import java.util.Random;

public class somarMatriz {

	public static void main(String[] args) {
		
		Random random = new Random();
		
		int matriz[][] = new int[3][3];
		int somaTotal = 0, somaDiagonal = 0; 
		
		for (int i = 0; i < 3; i++)
		{
			for (int j = 0; j < 3; j++)
			{
				matriz[i][j] = random.nextInt(89) + 10;
				
				System.out.printf(matriz[i][j] + " ");
				
				somaTotal += matriz[i][j];
				if (i == j)
				{
					somaDiagonal += matriz[i][j];
				}
			}
			System.out.printf("\n");
		}
		
		System.out.printf("A soma total é " + somaTotal + " e a soma da diagonal é " + somaDiagonal);
		
	}

}
