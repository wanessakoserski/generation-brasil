programa
{
	
	funcao inicio()
	{
		real horasTrabalhadas, horasExcedentes

		escreva("Digite as horas trabalhadas nesta semana: ")
		leia(horasTrabalhadas)

		real salarioHorasTrabalhadas, salarioHorasExcedentes

		se (horasTrabalhadas > 50)
		{
			horasExcedentes = horasTrabalhadas - 50
			horasTrabalhadas = 50

			salarioHorasTrabalhadas = horasTrabalhadas * 10
			salarioHorasExcedentes = horasExcedentes * 20	
		}
		senao
		{
			salarioHorasTrabalhadas = horasTrabalhadas * 10
			salarioHorasExcedentes = 0			
		}

		escreva("O salario desta semana é de " + salarioHorasTrabalhadas + " reais.\nSeus extras foram de "
		+ salarioHorasExcedentes + " reais.")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 318; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */