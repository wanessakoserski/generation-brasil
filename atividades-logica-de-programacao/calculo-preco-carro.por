programa
{
	
	funcao inicio()
	{
		real precoDeCusto
		escreva("\nQual o preço de custo do carro?   ")
		leia(precoDeCusto)

		real imposto, distribuidora
		imposto = precoDeCusto * 0.28
		distribuidora = precoDeCusto * 0.45

		real precoFinal = precoDeCusto + imposto + distribuidora

		escreva("\nO consumidor final irá pagar " + precoFinal + " reais pelo carro\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 371; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */