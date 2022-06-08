package br.com.generation.lista03;

import java.util.Scanner;

public class idades {

	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		
		int pessoaCalma = 0, mulherNervosa = 0, homemAgressivo = 0, outroCalmo = 0;
		int nervosaMaior40 = 0, calmaMenor18 = 0;
		int numeroDePessoas = 0;
		int idade, sexo, humor;
		
		while (numeroDePessoas < 150)
		{
			System.out.printf("Digite sua idade: ");
			idade = in.nextInt();
			
			System.out.printf("1 - feminimo  2 - masculino  3 - outros\nInforme seu sexo: ");
			sexo = in.nextInt();
			
			System.out.printf("1 - calma  2 - nervosa  3 - agressiva\nInforme que tipo de pessoa você se considera: ");
			humor = in.nextInt();
			
			if (humor == 1)
			{
				pessoaCalma++;
			}
			
			if (sexo == 1 && humor == 2)
			{
				mulherNervosa++;
			}
			
			if (sexo == 2 && humor == 3)
			{
				homemAgressivo++;
			}
			
			if (sexo == 3 && humor == 1)
			{
				outroCalmo++;
			}
			
			if (humor == 2 && idade > 40)
			{
				nervosaMaior40++;
			}
			
			if (humor == 1 && idade < 18)
			{
				calmaMenor18++;
			}
			
			numeroDePessoas++;
		}
		
		System.out.printf("\n\n o número de pessoas calmas: %d\n"
				+ " o número de mulheres nervosas: %d\n"
				+ " o número de homens agressivos: %d\n"
				+ " o número de outros calmos: %d\n"
				+ " o número de pessoas nervosas com mais de 40 anos: %d\n"
				+ " o número de pessoas calmas com menos de 18 anos: %d", pessoaCalma, mulherNervosa, homemAgressivo, outroCalmo, nervosaMaior40, calmaMenor18);

	}
}
