/* 6. Combinar dois vetores
* Leia os vetores A e B (5 inteiros cada). Monte C, com a soma posição a posição, e D, com os
* valores de A e B intercalados.
*
* Saída: 
* A: 1 2 3 4 5
* B: 10 20 30 40 50
* C: 11 22 33 44 55
* D: 1 10 2 20 3 30 4 40 5 50
*/
package Lista_Exercicios_Vetores_Matrizes_Metodos;

import java.util.Scanner;

public class Combinar2Vetores_6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int tam = 5;
        int[] vetNum1 = new int[tam];
        int[] vetNum2 = new int[tam];
        int[] vetSoma = new int[tam];

        System.out.println("Primeiro vetor: ");
        for (int i = 0; i < vetNum1.length; i++) {
            System.out.printf("Digite o %dº número: ", i+1);
            vetNum1[i] = scan.nextInt();
        }

        System.out.print("\nSegundo vetor:");
        System.out.println();
        for (int i = 0; i < vetNum2.length; i++) {
            System.out.printf("Digite o %dº número: ", i+1);
            vetNum2[i] = scan.nextInt();
        }
        scan.close();
        System.out.println("--------------------------------");

        System.out.print("A: ");
        imprimiVetor(vetNum1);

        System.out.print("B: ");
        imprimiVetor(vetNum2);
        
        System.out.print("C: ");
        vetSoma = somarVetores(vetNum1, vetNum2);
        imprimiVetor(vetSoma);

        System.out.print("D: ");
        for (int i = 0; i < vetNum1.length; i++) {
            System.out.printf("%d %d ", vetNum1[i], vetNum2[i]);
        }
    }

    public static int[] somarVetores(int[] vetnum1, int[] vetnum2){
        int[] vetSoma = new int[vetnum1.length];
        for(int i = 0; i < vetnum1.length; i++) {
            vetSoma[i] = vetnum1[i] + vetnum2[i];
        }
        return vetSoma;
    }

    public static void imprimiVetor(int[] vetNumero){
        for(int i = 0; i < vetNumero.length; i++) {
            System.out.print(vetNumero[i] + " ");
        }
        System.out.println();
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