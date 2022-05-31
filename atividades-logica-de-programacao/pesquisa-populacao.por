programa
{
	
	funcao inicio()
	{
		real salario, maiorSalario = 0, somaSalario = 0, salarioMenor100 = 0
		inteiro numeroFilhos, somaNumeroFilhos = 0, quantidadePessoas = 20

		para(inteiro i = 1; i <= quantidadePessoas; i++)
		{
			escreva("\nBoa tarde insira os dados do habitante " + i + ", por favor")
			escreva("\nSalário: ")
			leia(salario)
			escreva("Quantidade de filhos: ")
			leia(numeroFilhos)

			somaSalario += salario
			somaNumeroFilhos += numeroFilhos

			se (salario > maiorSalario)
			{
				maiorSalario = salario
			}

			se (salario <= 100)
			{
				salarioMenor100++
			}
		}

		real mediaSalario, mediaFilhos, percentualMenor100

		mediaSalario = somaSalario/quantidadePessoas
		mediaFilhos = somaNumeroFilhos/quantidadePessoas
		percentualMenor100 = (salarioMenor100 * 100)/quantidadePessoas
		
		escreva("\nMédia do salário da população: " + mediaSalario
				+ "\nMédia do número de filhos: " + mediaFilhos
				+ "\nMaior salário: " + maiorSalario
				+ "\nPercentual de pessoa com salário até R$100,00: " + percentualMenor100 + "%")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1064; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */