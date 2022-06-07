package br.com.generation.lista02;

import java.util.Scanner;

public class ordemCrescente {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double num1, num2, num3;
		
		System.out.print("Digite um número: ");
		num1 = scanner.nextInt();
		System.out.print("Digite um número: ");
		num2 = scanner.nextInt();
		System.out.print("Digite um número: ");
		num3 = scanner.nextInt();
		
		
		
		if (num1 < num2 && num2 < num3)
		{
			System.out.println("A sequênica é " + num1 + ' ' + num2 + ' ' + num3);
		}
		else if (num1 < num3 && num3 < num2)
		{
			System.out.println("A sequênica é " + num1 + ' ' + num3 + ' ' + num2);
		}
		else if (num2 < num1 && num1 < num3)
		{
			System.out.println("A sequênica é " + num2 + ' ' + num1 + ' ' + num3);
		}
		else if (num2 < num3 && num3 < num1)
		{
			System.out.println("A sequênica é " + num2 + ' ' + num3 + ' ' + num1);
		}
		else if (num3 < num1 && num1 < num2)
		{
			System.out.println("A sequênica é " + num3 + ' ' + num1 + ' ' + num2);
		}
		else
		{
			System.out.println("A sequênica é " + num3 + ' ' + num2 + ' ' + num1);
		}
	}

}
