package br.com.generation.lista03;

import java.util.Scanner;

public class quantosImparesPares {

	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		
		int quantosImpares = 0, quantosPares = 0, numUser;
		
		for(int i = 0; i < 10; i++)
		{
			System.out.printf("Digite um número: ");
			numUser = in.nextInt();
			
			if (numUser%2 == 0)
			{
				quantosPares++;
			}
			else
			{
				quantosImpares++;
			}
		}
		
		System.out.println(quantosPares + " são pares e " + quantosImpares
							+ " são impares");

	}

}
