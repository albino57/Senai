programa
{
	inclua biblioteca Util
		
	funcao inicio()
	{
		const inteiro qtd=10
		inteiro ganhador=0
		cadeia nomes[qtd]
		
		para(inteiro i=0; i < qtd; i++){
			escreva("Escreva o ", i+1, "º de ", qtd, " nomes: ")
			leia(nomes[i])
		}

		ganhador = Util.sorteia(0, qtd-1)
		escreva("Nome ganhador do sorteio: ", nomes[ganhador])
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 84; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */