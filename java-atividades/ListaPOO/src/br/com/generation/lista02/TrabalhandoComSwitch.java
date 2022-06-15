package br.com.generation.lista02;

import java.util.Scanner;

public class TrabalhandoComSwitch {
	
	public static String teste(String escolha)
	{
		switch(escolha) {

        case "A","a" :
            return "\nVocê escolheu: A.";                            

        case "B","b" :
            return "\nVocê escolheu: B.";     

        case "C","c" :
            return "\nVocê escolheu: C.";      

        default :
            return "\nResposta invalida!";
            
		}
	}

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		String resposta;
		String mensagem;
	
		do {
			resposta = scanner.next();
			mensagem = teste(resposta);
			System.out.println(mensagem); 
		}
            while (mensagem == "\nResposta invalida!");
		
		}
	}
