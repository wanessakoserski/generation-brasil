programa
{
	
	funcao inicio()
	{
		// Escreva um sistema que leia três números inteiros e positivos (A, B, C) e calcule a seguinte expressão:
		// D = (R + S)/2 
		// onde
		//		R = (A + B)² e S = (B + C)²
		
		real a, b, c

		escreva("\nDigite um número: ")
		leia(a)

		escreva("\nDigite um número: ")
		leia(b)

		escreva("\nDigite um número: ")
		leia(c)

		real resultadoR, resultadoS, resultadoD

		 resultadoR = (a + b) * (a + b)
		 resultadoS = (b + c) * (b + c)

		 resultadoD = (resultadoR + resultadoS)/2

		 escreva(resultadoD)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 544; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */