package br.com.generation.lista03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;

public class ArrayListExercicio {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		Collection<String> estoque = new ArrayList<>();
		
		String numUser;
		
		do
		{
			System.out.print("Digite os itens do estoque: ");
			numUser = scanner.next();
			
			if (!numUser.equals("pare"))
			{
				estoque.add(numUser);
			}
			
		}
		while(!numUser.equals("pare"));
		
		if (estoque.isEmpty())
		{
			System.out.println("Lista vazia...");
		}
		else
		{
			System.out.println("Lista do estoque: " + estoque);
		}
		
		
		System.out.print("Remover item: ");
		numUser = scanner.next();
		
		String mensagem;
		if (estoque.contains(numUser))
		{
			estoque.remove(numUser);
			mensagem = "Removido";
		}
		else
		{
			mensagem = "Item não encontrado";
		}
		System.out.println("Sistema:  " + mensagem );
		
		for(String item: estoque)
		{
			System.out.println("Item da lista: " + item);
		}
		
	}
	
}
