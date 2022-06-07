package br.com.generation.lista02;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class numeroMaior {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int num1, num2, num3;
		
		System.out.print("Digite um número: ");
		num1 = scanner.nextInt();
		System.out.print("Digite um número: ");
		num2 = scanner.nextInt();
		System.out.print("Digite um número: ");
		num3 = scanner.nextInt();
		
		if (num1 > num2 && num1 > num3)
		{
			System.out.println("O maior número é " + num1);
		}
		else if (num2 > num1 && num2 > num3)
		{
			System.out.println("O maior número é " + num2);
		}
		else
		{
			System.out.println("O maior número é " + num3);
		}
	}
}

