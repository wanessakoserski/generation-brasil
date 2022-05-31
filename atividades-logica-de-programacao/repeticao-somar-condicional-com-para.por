programa
{
	
	funcao inicio()
	{
		inteiro soma = 0
		
		para(inteiro i = 1; i <= 500; i++)
		{
			se(i%3 == 0 e i%2 == 1)
			{
				soma += i
			}
		}

		escreva("\nA soma dos números entre 1 a 500, ímpares e múltiplos de 3 é " + soma)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 239; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */