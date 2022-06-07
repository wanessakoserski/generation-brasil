package br.com.generation.lista01;

import java.util.Scanner;

public class calculeExpresssao 
{
	
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int a, b, c;
		
		int r, s;
		
		System.out.print("\nDigite um valor: ");
		a = scanner.nextInt();
		System.out.print("\nDigite um valor: ");
		b = scanner.nextInt();
		System.out.print("\nDigite um valor: ");
		c = scanner.nextInt();
		
		r = (a + b) * (a + b);
		s = (b + c) * (b + c);
		
		double d = (r + s)/2.0;
		
		System.out.println("\nO resultado é " + d);
	}
	
}
