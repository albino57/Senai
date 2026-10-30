programa
{
	
	funcao inicio(){
		const inteiro linha=3, coluna=2
		inteiro matriz[linha][coluna] =   {{22,10},
									{30,14},
									{18,16}}
		para(inteiro i=0; i < linha; i++){
			
			para(inteiro x=0; x < coluna; x++){
				escreva(matriz[i][x])

				se(x != coluna-1){
					escreva(",")
				}
			}
			escreva("\n")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 331; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */