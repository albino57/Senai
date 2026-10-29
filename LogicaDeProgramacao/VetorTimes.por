programa
{
	funcao inicio()
	{
		const inteiro qtd = 3
		cadeia times[qtd]={"Fluminese","Botafogo","Flamengo"}
		cadeia campeao="", lanterna=""
		inteiro pontuacao[qtd], maiorPontuacao=0, menorPontuacao=100

		 	para(inteiro i = 0; i < qtd; i++){
		 		escreva("Nome do Time: ")
		 		leia(times[i])
		 		escreva("Pontuação: ")
		 		leia(pontuacao[i])
		 	}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 113; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */