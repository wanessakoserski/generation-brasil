package fundamentos;

import java.util.Locale;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class MediaSalario {

	public static void main(String[] args) {
		Locale.setDefault(new Locale("en", "US"));
		
		Scanner input = new Scanner (System.in);
		
		String salario;
		
		salario = JOptionPane.showInputDialog("Insira o salário do 1º mês: ").replace(",", ".");
		double salario1 = Double.parseDouble(salario);
		
		salario = JOptionPane.showInputDialog("Insira o salário do 2º mês: ").replace(",", ".");
		double salario2 = Double.parseDouble(salario);
		
		salario = JOptionPane.showInputDialog("Insira o salário do 3º mês: ").replace(",", ".");
		double salario3 = Double.parseDouble(salario);
		
		double mediaSalario = (salario1 + salario2 + salario3)/ 3;
		
		System.out.println("\nA média dos salários em 3 meses é " + mediaSalario);
		
		input.close();

	}

}
