package br.com.generation.lista03;

import java.util.Scanner;

public class somaNumerosDigitados {

	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		
		int numUser, soma = 0;
		
		do
		{
			System.out.printf("Digite um número: ");
			numUser = in.nextInt();
			
			soma += numUser;			
		}
		while (numUser != 0);
		
		System.out.println("\nA soma é " + soma);
	}
}
