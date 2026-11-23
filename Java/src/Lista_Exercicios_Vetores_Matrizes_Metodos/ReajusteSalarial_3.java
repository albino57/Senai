/* 3. Reajuste salarial
* Leia os salários de 5 funcionários em um vetor. Dê 10% de aumento apenas para quem ganha
* menos de R$ 2.000,00 e mostre os salários atualizados.
* Entrada: 1500 2500 1999,99 3000 1000

*Funcionário 1: R$ 1650,00
*Funcionário 2: R$ 2500,00
*Funcionário 3: R$ 2199,99
*Funcionário 4: R$ 3000,00
*Funcionário 5: R$ 1100,00
*/
package Lista_Exercicios_Vetores_Matrizes_Metodos;

import java.util.Scanner;

public class ReajusteSalarial_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[] salario = new double[5];
        
        for (int i = 0; i < salario.length; i++) {
            System.out.printf("Digite o %d salário: ", i+1);
            salario[i] = scan.nextDouble();
        }
        scan.close();

        System.out.print("----------------------------");
        for (int i = 0; i < salario.length; i++) {
            if(salario[i] < 2000){ 
                System.out.printf("\nFuncionário %d: %.2f",i+1, salario[i] * 1.10);
            }else{ 
                System.out.printf("\nFuncionário %d: %.2f",i+1, salario[i]);
            }
        }

    }
}

/*
 * ------------------------------------------------------------------------
 * String > scan.next(); Lê uma palavra/letra
 * String > scan.nextLine(); Lê uma frase inteira e para só com ENTER
 * char scan.next().charAt(0); Lê o primeiro caracter
 * ------------------------------------------------------------------------
 * Locale.setDefault(Locale.US); | Locale.setDefault(Locale.of("pt","BR"));
 * ------------------------------------------------------------------------
 * %f = float, double | %d = byte, short, int, long
 * %s = String/boolean | %b = boolean | %c = char | %n = quebra de linha
 */