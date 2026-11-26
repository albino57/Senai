/* 16. Calculadora
* Crie os métodos somar, subtrair, multiplicar e dividir, cada um recebendo dois double e
* devolvendo o resultado. O main() lê os dois números e mostra os quatro resultados. Não divida por zero.
*
* Entrada: 10 e 4
*
* Soma: 14.0
* Subtração: 6.0
* Multiplicação: 40.0
* Divisão: 2.5
* OU ↓
* Divisão: não é possível dividir por zero.
*/
package Lista_Exercicios_Vetores_Matrizes_Metodos;

import java.util.Scanner;

public class Calculadora_16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double num1, num2;

        System.out.print("---- Calculadora ----\n");

        System.out.print("Digite o primeiro número: ");
        num1 = scan.nextDouble();
        System.out.print("Digite o segundo número: ");
        num2 = scan.nextDouble();
        scan.close();

        System.out.printf("\nSoma---------: %.1f", soma(num1, num2));
        System.out.printf("\nSubtração----: %.1f", subtracao(num1, num2));
        System.out.printf("\nMultiplicação: %.1f", multiplicacao(num1, num2));
        
        double divZero = divisao(num1, num2);
        if(divZero == 0){
            System.out.print("\nDivisão------: não é possível dividir por zero.");
        }else{
            System.out.printf("\nDivisão------: %.1f", divZero);
        }
    }

    public static double soma(double num1, double num2) {
        return num1 + num2;
    }

    public static double subtracao(double num1, double num2) {
        return num1 - num2;
    }

    public static double multiplicacao(double num1, double num2) {
        return num1 * num2;
    }

    public static double divisao(double num1, double num2) {
        return num1 / num2;
    }
}
