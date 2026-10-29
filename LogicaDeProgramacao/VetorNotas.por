programa
{
	inclua biblioteca Matematica
	funcao inicio()
	{
		const inteiro qtd = 5
		real nota[qtd], menorNota=100.0, maiorNota=0.0, mediaNota=0.0

		para(inteiro i = 0; i < qtd; i++){
			escreva("Escreva a ", i+1 , "ª nota de ", qtd, ": ")
			leia(nota[i])
			
			enquanto(nota[i] < 0 ou nota[i] > 10){
				escreva("\nA nota deve ser >=0 ou <=10. Escreva novamente!")
				escreva("\nEscreva a ", i+1 , "ª nota de ", qtd, ": ")
				leia(nota[i])
			}
			
			limpa()

			mediaNota += nota[i] 

			se(menorNota > nota[i]){
				menorNota = nota[i]
			}
			se(maiorNota < nota[i]){
				maiorNota = nota[i]
			}
		}

		maiorNota = Matematica.arredondar(maiorNota, 1)
		menorNota = Matematica.arredondar(menorNota, 1)
		mediaNota = Matematica.arredondar(mediaNota/qtd, 1)

		escreva("\n-------Maior nota: ", maiorNota)
		escreva("\n-------Menor nota: ", menorNota)
		escreva("\n---Média das nota: ", mediaNota)
		escreva("\nNotas registradas: ")
		
		para(inteiro i = 0; i < qtd; i++){
			escreva(nota[i], "  ")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 268; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */