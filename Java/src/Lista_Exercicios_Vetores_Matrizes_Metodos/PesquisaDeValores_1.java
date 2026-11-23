/*
* 1. Pesquisa de valores:
* Leia 10 números inteiros em um vetor. Mostre os números, quantos são pares, quantos são
* ímpares e a soma de todos.
*
* Entrada: 3 8 5 12 7 10 1 4 9 6
*
* 3 8 5 12 7 10 1 4 9 6
* Pares: 5
* Ímpares: 5
* Soma: 65
*/
package Lista_Exercicios_Vetores_Matrizes_Metodos;

import java.util.Scanner;

public class PesquisaDeValores_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] vetor = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.printf("Digite o %dº valor: ",i+1);
            vetor[i] = scan.nextInt();
        }
        scan.close();

        mostrarNumeros(vetor);
        parImpar(vetor);
        somar(vetor);
    }

    static void mostrarNumeros(int vetor[]){
        System.out.print("\nOs números são: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(vetor[i] + " ");
        }
    }

    static void parImpar(int vetor[]){
        int par=0, impar=0;
        for (int i = 0; i < vetor.length; i++) {
            if(vetor[i]%2==0){
                par++;
            }else{
                impar++;
            }
        }
        System.out.printf("\nPares---------: %d", par);
        System.out.printf("\nÍmpares-------: %d", impar);
    }

    static void somar(int vetor[]){
        int soma=0;
        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i];
        }
        System.out.printf("\nSoma----------: %d", soma);
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