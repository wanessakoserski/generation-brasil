programa
{
	/*
	 * Cáculo de multa por excesso de quilo
	 * Máximo = 50kg
	 */
	
	funcao inicio()
	{
		real quilos, excesso, multa
		
		escreva("Qual o peso da carga em kg: ")
		leia(quilos)

		se (quilos > 50)
		{
			excesso = quilos - 50
			multa = excesso * 4
			escreva("\nVocê está carregando " + excesso + "kg a mais do que o permitido"
			+ "\nVocê terá que pagar " + multa + " reais de multa")
		}
		senao 
		{
			escreva("\nO peso da carga está dentro do permitido, nenhuma multa precisará ser paga!")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 197; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */