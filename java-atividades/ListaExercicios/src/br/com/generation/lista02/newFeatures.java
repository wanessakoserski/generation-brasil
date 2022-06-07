package br.com.generation.lista02;

//import javax.swing.JOptionPane;
import java.util.Scanner;

public class newFeatures {

	public static void main(String[] args) {
		
		/*
		int num;
		
		num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro: "));
		
		if(num % 4 == 0 && num % 5 == 0)
		{
			JOptionPane.showMessageDialog(null, "O número " + num + " é dividivel por 4 e 5");
		}
		else 
		{
			JOptionPane.showMessageDialog(null, "O número " + num + " não é dividivel por 4 e 5");
		}
		*/
		
		Scanner scanner = new Scanner(System.in);
		
		char letra = scanner.next().charAt(0);
		
		switch(letra)
		{
		case 'a', 'A':
			System.out.println("Annie");
			break;
		case 'f':
			System.out.println("Felipe");
			break;
		default:
			System.out.println("Opção Inválida");
			break;
		}
		
	}

}
