programa
{
	
	funcao inicio()
	{
		inteiro num1[4][6] = {{10, 20, 30, 40, 50, 60},
						  {10, 20, 30, 40, 50, 60},
						  {10, 20, 30, 40, 50, 60},
						  {10, 20, 30, 40, 50, 60}}

		inteiro num2[4][6] = {{5, 10, 15, 20, 30, 40},
						  {5, 10, 15, 20, 30, 40},
						  {5, 10, 15, 20, 30, 40},
						  {5, 10, 15, 20, 30, 40}}

		inteiro matriz1[4][6]
		inteiro matriz2[4][6]

		para (inteiro i = 0; i < 4; i++)
		{
			para (inteiro j = 0; j < 6; j++)
			{
				matriz1[i][j] = num1[i][j] + num2[i][j]
				matriz2[i][j] = num1[i][j] - num2[i][j]
			}
		}

		para (inteiro i = 0; i < 4; i++)
		{
			para (inteiro j = 0; j < 6; j++)
			{
				escreva(matriz1[i][j] + "  ") 
			}
			escreva("\n")
		}

		escreva("\n")

		para (inteiro i = 0; i < 4; i++)
		{
			para (inteiro j = 0; j < 6; j++)
			{
				escreva(matriz2[i][j] + "  ") 
			}
			escreva("\n")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 417; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */