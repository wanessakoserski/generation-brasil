programa
{
	
	funcao inicio()
	{
		real numeroUsuario
		
		escreva("Este programa só lerá números positivos, caso inserido um número "
				+ "não positivo esse programa será cancelado"
				+ "\nPor favor insira seu primeiro número: ")
		leia(numeroUsuario)

		enquanto(numeroUsuario >= 0)
		{
			escreva("Obrigado, número esperado. \n\nInsira outro número: ")
			leia(numeroUsuario)
		}

		escreva("\nVocê inseriu um número não positivo >:(")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 340; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */