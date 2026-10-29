programa
{
	inclua biblioteca Matematica
	
	funcao inicio()
	{
		const inteiro qtd = 5
		real salario[qtd] = {1500.56, 2567.43, 1906.43, 3546.00, 3000.00}
		
		escreva("Reajustando salários acima de R$:2000,00 em 10%")
		para(inteiro i = 0; i < qtd; i++){
			
			se(salario[i] >= 2000.00){
				salario[i] = Matematica.arredondar(salario[i] *= 1.1, 2)
			}
		}

		escreva("\n\nSalarios ajustados: ")
		para(inteiro i = 0; i < qtd; i++){
			escreva("R$:", salario[i], " ")
		}
		escreva("\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 400; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */