programa
{
	inclua biblioteca Util --> util
	inclua biblioteca Matematica --> mat
	funcao inicio()
	{
		inteiro opcao=0
		caracter loop='s'
		real num1=0.0, num2=0.0, resultado=0.0
		
		faca{
			escreva("===Calculadora===")
			escreva("\n1-Soma \n2-Subtração \n3-Multiplição \n4-Divisão \n\nDigite: ")
			leia(opcao)

			escolha(opcao){
				caso 1:
					limpa()
					escreva("=Soma=")
					escreva("\nDigite o 1º número: ")
					leia(num1)

					escreva("Digite o 2º número: ")
					leia(num2)

					resultado = mat.arredondar(num1 + num2, 2)

					escreva("\nResultado: ", num1, " + ", num2, " = ", resultado)
				pare
				
				caso 2:
					limpa()
					escreva("=Subtração=")
					escreva("\nDigite o 1º número: ")
					leia(num1)

					escreva("Digite o 2º número: ")
					leia(num2)

					resultado = mat.arredondar(num1 - num2, 2)

					escreva("\nResultado: ", num1, " - ", num2, " = ", resultado)
				pare

				caso 3:
					limpa()
					escreva("=Multiplicação=")
					escreva("\nDigite o 1º número: ")
					leia(num1)

					escreva("Digite o 2º número: ")
					leia(num2)

					resultado = mat.arredondar(num1 * num2, 2)

					escreva("\nResultado: ", num1, " x ", num2, " = ", resultado)
				pare

				caso 4:
					limpa()
					escreva("=Divisão=")
					escreva("\nDigite o 1º número: ")
					leia(num1)

					escreva("Digite o 2º número: ")
					leia(num2)

					resultado = mat.arredondar(num1 / num2, 2)

					escreva("\nResultado: ", num1, " % ", num2, " = ", resultado)
				pare
			}
			//util.aguarde()
			escreva("\n\nFazer outro cálculo? 's' ou 'n': ")
			leia(loop)
			limpa()
			
		}enquanto (loop == 's')
		
		escreva("Calculadora finalizada \n-Resultado do cálculo feito: ", resultado)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 191; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */