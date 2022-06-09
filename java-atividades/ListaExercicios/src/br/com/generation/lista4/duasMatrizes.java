package br.com.generation.lista4;

import java.util.Random;

public class duasMatrizes {

	public static void main(String[] args) {
		
		Random random = new Random();
		
		int[][] matriz1 = new int[4][6];
		int[][] matriz2 = new int[4][6];
		int[][] matrizSoma = new int[4][6];
		int[][] matrizSubt = new int[4][6];
		
		for (int i = 0; i < 4; i++)
		{
			for (int j = 0; j < 6; j++)
			{
				matriz1[i][j] = random.nextInt(50);
				matriz2[i][j] = random.nextInt(50);
				
				matrizSoma[i][j] = matriz1[i][j] + matriz2[i][j];
				matrizSubt[i][j] = matriz1[i][j] - matriz2[i][j];
			}
		}
		
		for (int i = 0; i < 4; i++)
		{
			for (int j = 0; j < 6; j++)
			{
				System.out.print(matrizSoma[i][j] + " ");
			}
			System.out.print("\n");
		}
		
		System.out.print("\n");
		
		for (int i = 0; i < 4; i++)
		{
			for (int j = 0; j < 6; j++)
			{
				System.out.print(matrizSubt[i][j] + " ");
			}
			System.out.print("\n");
		}
	
	}
	
}
