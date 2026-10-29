programa
{
	
	funcao inicio()
	{	
		const inteiro quantidade = 5
		caracter vogal[quantidade] = {'A','E','I','O','U'}

		/*
		para(inteiro i=0; i < quantidade; i++){
			escreva("Digite a vogal: ")
			leia(vogal[i])	
		}
		*/

		escreva("\nAs vogais digitadas:")
		para(inteiro i = 0; i < quantidade; i++){
			escreva(" ", vogal[i])
		}
		
		escreva("\nAs vogais digitadas invertidas:")
		para(inteiro i = quantidade-1; i >= 0; i--){
			escreva(" ", vogal[i])
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 102; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */