programa
{

     funcao inicio()
     {
          cadeia nome
          cadeia banco[2][2] = {
               {"marcelo", "carlos"},
               {"igor", "ryan"}
          }


          inteiro idade[2][2] = {
               {25, 9},
               {9, 2}
          }
          cadeia ano[2][2] = {
               {"3°ano", "1°ano"},
               {"2°ano", "9°ano"}
          }
          escreva("=====BANCO DE DADOS ESCOLAR====\n")
          escreva("digite um nome: ")
          leia(nome)
          para (inteiro l = 0; l < 2; l++) {
               para (inteiro c = 0; c < 2; c++) {
                    se (nome == banco[l][c]) {
                         escreva("Nome do aluno: " + nome)
                    }
                
                    se (nome == banco[l][c]) {
                         escreva("\nIdade do Aluno: " + idade[l][c] + " Anos" + "\nTurma: " + ano[l][c])
                    }

               }
          }
     }
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 886; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */