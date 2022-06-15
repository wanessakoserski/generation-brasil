package br.com.generation.projeto;

import javax.swing.JOptionPane;

public class Formulario01 {

	public static void formularioParaMulheres(int pontuacao) {

		int check1, check2;
		boolean abuso = false, superior = false, salario = false;

		do 
		{
			check1 = Integer.parseInt(JOptionPane
					.showInputDialog("Segundo o levantamento das empresas de pesquisa Nielsen e Opinion Box, \n"
							+ "a maior parte das mulheres sabe o que é assédio (92%)\n e 46% delas já sofreram ou "
							+ "presenciaram isso no trabalho, \nespecialmente na faixa etária entre 24 e 45 anos.\r\n"
							+ "\r\n"
							+ "	Você já sofreu algum abuso no seu local de trabalho?\n\nDigite: \n\n(1) para sim \n\n(2) "
							+ "para não\n\n"));
		} 
		while (check1 != 1 && check1 != 2);

		if (check1 == 1) 
		{
			abuso = true;
			
			int sup = Integer.parseInt(JOptionPane.showInputDialog(
					"Esse abuso veio de um superior?\n\nDigite: \n\n(1) para sim\n\n(2) para não\n\n"));
			if (sup == 1) 
			{
				superior = true;
			} 
			else 
			{
				superior = false;
			}
		} 
		else 
		{
			abuso = false;
		}

		do 
		{
			check2 = Integer.parseInt(
					JOptionPane.showInputDialog("De acordo com um estudo do IBGE as mulheres ganharam em média 20,50%"
							+ "\nmenos do que os homens no 4º trimestre de 2021.\r\n" + "\r\n"
							+ "	Você recebe menos que um colega de trabalho homem na mesma função?\n\nDigite: \n\n(1) "
							+ "para sim\n\n(2) para não\n\n"));
			if (check2 == 1) 
			{
				salario = true;
			} 
			else 
			{
				salario = false;
			}
		} 
		while (check2 != 1 && check2 != 2);

		JOptionPane.showInputDialog(
				"O que você acha que pode ser feito para minimizar o abuso contra a mulher no local de trabalho? ");

		if (abuso == true) 
		{
			JOptionPane.showInputDialog(null,
					"Algumas atitudes são importantes para fazer cessar o assédio e evitar que ele se propague e se agrave no "
							+ "ambiente de trabalho:\r\n" + " Dizer, claramente, não ao assediador; \r\n"
							+ "Evitar permanecer sozinha (o) no mesmo local que o (a) assediador (a); \r\n"
							+ "Anotar, com detalhes, todas as abordagens de caráter sexual sofridas: dia, mês, ano, hora, "
							+ "local ou setor, nome do (a) agressor (a), colegas que testemunharam os fatos, conteúdo das "
							+ "conversas e o que mais achar necessário; \r\n"
							+ "Dar visibilidade, procurando a ajuda dos colegas, principalmente daqueles que testemunharam "
							+ "o fato, que são ou foram vítimas; \r\n"
							+ "Reunir provas, como bilhetes, e-mails, mensagens em redes sociais, presentes.; \r\n"
							+ "Livrar-se do sentimento de culpa, uma vez que a irregularidade da conduta não depende do "
							+ "comportamento da vítima, mas sim do agressor; \r\n"
							+ "Denunciar aos órgãos de proteção e defesa dos direitos das mulheres ou dos trabalhadores, "
							+ "inclusive o sindicato profissional; \r\n"
							+ "Comunicar aos superiores hierárquicos, bem como informar por meio dos canais internos da "
							+ "empresa, tais como ouvidoria, comitês de éticas ou outros meios idôneos disponíveis; \r\n"
							+ "Buscar apoio junto a familiares, amigos e colegas; \r\n"
							+ "Relatar o fato perante a Cipa (Comissão Interna de Prevenção de Acidentes) e ao SESMT "
							+ "(Serviço Especializado em Engenharia de Segurança e em Medicina do Trabalho)\n\nObrigado por "
							+ "jogar!\n\nSe tiver algum comentário para a equipe de desenvolvimento, "
							+ "sobre algo que faltou no jogo, por favor comente abaixo e dê ok. Caso contrário, clique apenas"
							+ "no Enter.");
		}
		
		Final.mensagemFinal(pontuacao);

	}
}