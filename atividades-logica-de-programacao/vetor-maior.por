programa
{
	
	funcao inicio()
	{
		real vetor[5]
		real maior = 0

		para (inteiro i = 0; i < 5; i++)
		{
			escreva("\nDigite um número: ")
			leia(vetor[i])
			se (maior < vetor[i] ou i == 0)
			{
				maior = vetor[i]
			}

		}

		para (inteiro i = 0; i < 5; i++)
		{
			escreva(vetor[i] + "  ")
		}

		escreva("\nO maior número dentro do vetor é " + maior)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 70; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */