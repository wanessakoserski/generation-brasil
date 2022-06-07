package br.com.generation.lista02;

import java.util.Scanner;

public class parOuImpar {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		double num;
		
		System.out.print("Digite um número: ");
		num = scanner.nextDouble();
		
		if (num%2 == 0)
		{
			double raiz = Math.sqrt(num);
			System.out.println("É par");
			System.out.println("A raiz deste número é " + raiz);
		}
		else
		{
			System.out.println("É impar");
		}
	}
}
