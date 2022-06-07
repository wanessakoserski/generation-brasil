package br.com.generation.lista02;

import java.util.Scanner;

public class categoriaIdade {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int idade;
		
		System.out.print("Digite sua idade: ");
		idade = scanner.nextInt();
		
		if (idade >= 10 && idade <=14)
		{
			System.out.println("Infatil");
		}
		else if (idade >= 15 && idade <17)
		{
			System.out.println("Juvenil");
		}
		else
		{
			System.out.println("Adulto");
		}
	}
}
