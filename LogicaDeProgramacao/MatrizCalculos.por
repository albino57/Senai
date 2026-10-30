programa
{
	funcao inicio(){
		const inteiro linha=3, coluna=2
		real soma=0.0, subtracao=0.0, multi=0.0, divisao=0.0
		real matriz [linha][coluna] = {{5.0,2.0},
								    {1.0,9.0},
								    {4.0,1.0}}						    
		para(inteiro i=0; i<linha; i++){
			para(inteiro x=0; x<coluna; x++){
				soma += matriz[i][x]
			}
		}
		para(inteiro i=0; i<linha; i++){
			para(inteiro x=0; x<coluna; x++){
				subtracao -= matriz[i][x]
			}
		}
		para(inteiro i=0; i<linha; i++){
			para(inteiro x=0; x<coluna; x++){
				//multi *= matriz[i][x]
				multi = multi * matriz[i][x]
			}
		}
		para(inteiro i=0; i<linha; i++){
			para(inteiro x=0; x<coluna; x++){
				divisao /= matriz[i][x]
			}
		}

		escreva("A adição da matriz é: ", soma)
		escreva("\nA subtração da matriz é: ", subtracao)
		escreva("\nA multiplicação da matriz é: ", multi)
		escreva("\nA divisão da matriz é: ", divisao)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 517; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */