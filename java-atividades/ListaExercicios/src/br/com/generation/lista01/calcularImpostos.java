package br.com.generation.lista01;

import java.util.Scanner;

public class calcularImpostos 
{
	
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		double precoFabrica;
		
		System.out.print("Digite o valor de fábrica: ");
		precoFabrica = scanner.nextDouble();
		
		double parteDistribuidor = precoFabrica * 0.28;
		double imposto = precoFabrica * 0.48;
		double precoFinal = precoFabrica + parteDistribuidor + imposto;
		
		System.out.printf("\nO preço final será de R$ %.2f", precoFinal);
	}	
}
