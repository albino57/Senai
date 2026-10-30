programa
{
	
	funcao inicio(){
		const inteiro qtd=10
		inteiro vetor[qtd] = {4,9,1,1,8,6,7,7,2,5}
		inteiro auxiliar

		//Rederiza lista original
		escreva("-Lista Original: ")
		para(inteiro i=0; i<qtd; i++){
			escreva(vetor[i], " ")
		}

		//Processamento da ordenação
		para(inteiro i=0; i<qtd; i++){
			para(inteiro x=0; x<qtd; x++){
				se(vetor[i] < vetor[x]){
					auxiliar = vetor[i]
					vetor[i] = vetor[x]
					vetor[x] = auxiliar
				}
			}	
		}

		//Renderiza lista ordenada
		escreva("\n\n-Lista ordenada: ")
		para(inteiro i=0; i<qtd; i++){
			escreva(vetor[i], " ")
		}

		//Renderiza lista inversa
		escreva("\n\nLista invertida: ")
		para(inteiro i=qtd-1; i>=0; i--){
			escreva(vetor[i], " ")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 729; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */