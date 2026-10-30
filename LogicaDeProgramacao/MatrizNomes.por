programa
{
	
	funcao inicio(){
		const inteiro linha=2, coluna=10
		cadeia matriz[linha][coluna]

		para(inteiro i=0; i < linha; i++){
			para(inteiro x=0; x < coluna; x++){
				escreva("Digite o ", x+1, "º nome de ", linha*coluna, " nomes: ")
				leia(matriz[i][x])
				limpa()
			}
		}

		escreva("↓ NOMES DIGITADOS ↓\n")
		para(inteiro i=0; i < linha; i++){
			para(inteiro x=0; x < coluna; x++){
				escreva(matriz[i][x])
				
				se(x != coluna-1){
					escreva(", ")
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
 * @POSICAO-CURSOR = 515; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */