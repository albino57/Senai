programa
{
	
	funcao inicio()
{
		const inteiro linha=2, coluna=3
		cadeia matriz[linha][coluna]

		para(inteiro i=0; i < linha; i++){
			para(inteiro x=0; x < coluna; x++){
				escreva("Digite o ", i+1, "º de ", linha, " cadastros")

				se(x == 0){
					escreva("\nDigite o nome: ")
				}
				se(x == 1){
					escreva("\nDigite o nº do telefone: ")
				}
				se(x == 2){
					escreva("\nDigite o E-mail: ")
				}
				leia(matriz[i][x])
				limpa()
			}
		}

		escreva("↓ C A D A S T R O S ↓\n")
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
 * @POSICAO-CURSOR = 350; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */