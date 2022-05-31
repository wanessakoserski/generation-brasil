programa
{
	
	funcao inicio()
	{
		real numeroUsuario, soma = 0, contador = 0
		
		escreva("Este programa só lerá números positivos, caso inserido um número "
				+ "não positivo esse programa será cancelado"
				+ "\nPor favor insira seu primeiro número: ")
		leia(numeroUsuario)

		
		enquanto(numeroUsuario >= 0)
		{
			soma += numeroUsuario
			
			escreva("Obrigado, número esperado. \n\nInsira outro número: ")
			leia(numeroUsuario)

			contador++ //contador = contador + 1
		}

		real media = soma/contador

		escreva("\nVocê inseriu um número não positivo >:(")
		escreva("\nA soma é " + soma)
		escreva("\nA média é " + media)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 479; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */