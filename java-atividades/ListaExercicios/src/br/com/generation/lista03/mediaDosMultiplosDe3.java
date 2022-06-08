package br.com.generation.lista03;

import java.util.Scanner;

public class mediaDosMultiplosDe3 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		
		int numUser, soma = 0;
		
		do
		{
			System.out.printf("Digite um número: ");
			numUser = in.nextInt();
			
			if(numUser%3 == 0 && numUser != 0)
			{
				soma += numUser;
			}
		}
		while(numUser != 0);

		System.out.println("\nA soma é " + soma);
	}

}
