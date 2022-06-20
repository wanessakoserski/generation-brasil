package objeto;

public class Data {
	
	static String autor = "Pedro Henrique";
	
	String nomeEvento;
	int dia;
	String mes;
	int ano;
	
	Data () {
		nomeEvento = "Evento aberto";
	}
	
	Data (String evento)
	{
		nomeEvento = evento;
	}
	
	String converterMes()
	{
		switch (mes.toLowerCase())
		{
			case "janeiro":
				return "01";
			case "fevereiro":
				return "02";
			case "março":
				return "03";
			case "abril":
				return "04";
			case "maio":
				return "05";
			case "junho":
				return "06";
			case "julho":
				return "07";
			case "agosto":
				return "08";
			case "setembro":
				return "09";
			case "outubro":
				return "10";
			case "novembro":
				return "11";
			case "dezembro":
				return "12";
			default:
				return "Erro - mês inválido, modifique para um mês válido";
		}
	}
	
	int converterAno()
	{
		if (ano >= 1900 && ano < 2000)
		{
			return ano - 1900;
		}
		else if (ano >= 2000 && ano < 3000)
		{
			return ano - 2000;
		}
		else
		{
			return 0;
		}
	}
	
}
