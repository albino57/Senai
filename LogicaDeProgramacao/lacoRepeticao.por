programa
{
	inclua biblioteca Util --> u
	funcao inicio()
	{
		inteiro contador = 1
		escreva("Contador:")
		enquanto(contador <= 3){
			escreva(" ", contador)
			contador += 1
			u.aguarde(1000)
		}
		limpa() //Limpa tela.
		escreva("Boa noite!")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 223; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */