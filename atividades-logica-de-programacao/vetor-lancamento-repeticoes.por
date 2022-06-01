programa
{
	
	funcao inicio()
	{
		inteiro lancamento[5], soma = 0, maior = 0, ocorrencia = 1

		escreva("Digite os lançamentos:\n")
		para (inteiro i = 0; i < 5; i++)
		{
			escreva("* ")
			leia(lancamento[i])
			soma += lancamento[i]
			se (lancamento[i] >= maior)
			{
				se (lancamento[i] == maior)
				{
					ocorrencia++
				}
				maior = lancamento[i]
			}
		}

		escreva("\nO maior lançamento é " + maior + ", e se ocorreu " + ocorrencia + "x")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 196; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */