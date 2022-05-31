programa
{
	
	funcao inicio()
	{
		inteiro numeroUsuario
		
		escreva("Insira um número para x3: ")
		leia(numeroUsuario)
		escreva("\n" + numeroUsuario)

		enquanto(numeroUsuario <= 100)
		{
			numeroUsuario *= 3
			escreva("\n" + numeroUsuario)
		}

		escreva("\n\nPassou de 100 o programa já não consegue mais calcular bem, lo siento")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 159; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */