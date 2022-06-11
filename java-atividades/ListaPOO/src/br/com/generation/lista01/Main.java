package br.com.generation.lista01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		/*
		Cliente cliente = new Cliente();		
		
		String nome, email;
		int idade;
		
		System.out.printf("Informe seu nome: ");
		nome = scanner.nextLine();
		System.out.printf("Informe seu email: ");
		email = scanner.next();
		System.out.printf("Informe sua idade: ");
		idade = scanner.nextInt();
		
		System.out.println(cliente.verificarConta());
		
		cliente.cadastrar(nome, email, idade);
		
		System.out.println("\nInformações guardadas:");
		System.out.println(cliente.verificarConta());		
		System.out.println("Seu nome é " + cliente.nome
							+	" e sua idade é " + cliente.idade
							+	" e o e-mail cadastrado é "	+ cliente.email);
		*/
		
		Aviao aviao = new Aviao();
		
		
		System.out.printf("Qual o modelo do avião: ");
		aviao.modelo = scanner.next();
		System.out.printf("Qual o porte do avião: ");
		aviao.getPorte(scanner.next());
		System.out.printf("Quantos passageiros são suportados: ");
		aviao.passageiros = scanner.nextInt();
		
		System.out.println("\nInformações do avião:");
		System.out.println("Modelo --> " + aviao.modelo);
		System.out.println("Porte --> " + aviao.porte);
		System.out.println("Nº de passageiros --> " + aviao.passageiros);
		
		System.out.println("\nProcesso da viagem:");
		System.out.println(aviao.partida());
		System.out.println(aviao.levantarVoo());
		System.out.println(aviao.aterrisar());
	}

}
