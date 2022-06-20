package objeto;

public class Main {

	public static void main(String[] args) {
		
		var aniversarioTia = new Data();
		aniversarioTia.dia = 14;
		aniversarioTia.mes = "julho";
		aniversarioTia.ano = 1980;
		
		var festaAniversarioTia = new Data("Festa da titia na casa da Julia");
		festaAniversarioTia.dia = 16;
		festaAniversarioTia.mes = "julho";
		festaAniversarioTia.ano = 2022;
		
		System.out.printf("  ______________________________________________\n||"
									+ "\n||Titia nasceu %d de %s de %d "
									+ "\n||e esse ano iremos comemorar seu aniversário \n||num final de semana"
									+ "no dia %d de %s\n||\n", aniversarioTia.dia, aniversarioTia.mes, 
									aniversarioTia.ano, festaAniversarioTia.dia, festaAniversarioTia.mes);
		System.out.printf("||______________________________________________\n||\n");
		System.out.printf("||   %d/%s/%d - %s\n||\n", festaAniversarioTia.dia, festaAniversarioTia.converterMes(), 
									festaAniversarioTia.converterAno(), festaAniversarioTia.nomeEvento);
		System.out.printf("|| - Comprar presente para Titia\n"
									+ "|| - Comprar nova roupa\n"
									+ "|| - Fazer pudim para levar\n"
									+ "||\n");
		System.out.printf("||______________________________________________\n\n");
		System.out.printf("   ~Essa agenda pertece a %s", Data.autor);
	}

}
