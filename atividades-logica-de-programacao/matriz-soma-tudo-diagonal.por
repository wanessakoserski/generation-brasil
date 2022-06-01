programa
{
	
	funcao inicio()
	{
		inteiro matriz[3][3], somaTudo = 0, somaDiagonal = 0

		escreva("Digite os números da matriz:\n")
		para (inteiro i = 0; i < 3; i++)
		{
			escreva((i + 1) + "º linha\n")
			para (inteiro j = 0; j < 3; j++)
			{
				escreva("* ")
				leia(matriz[i][j])
				somaTudo += matriz[i][j]
				se (i == j)
				{
					somaDiagonal += matriz[i][j]
				}
			}
		}

		escreva("\nA soma de tudo é " + somaTudo + ". A soma da diagonal é " + somaDiagonal
				+ ".")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 208; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */