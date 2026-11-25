/* 12. Diagonais
* Leia uma matriz 4×4. Mostre-a como tabela e mostre a soma da diagonal principal e da
* secundária.
* Entrada: 1 a 16, em ordem:
*  1   2   3   4
*  5   6   7   8
*  9  10  11  12
* 13  14  15  16
*
* Saída:
* Soma da diagonal principal: 34
* Soma da diagonal secundária: 34
 */
package Lista_Exercicios_Vetores_Matrizes_Metodos;

import java.util.Scanner;

public class Diagonais_12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final int tam = 4;
        int[][] matriz = new int[tam][tam];
        //int[][] matriz = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.printf("Digite o valor da posição [%d][%d]: ", i, j);
                matriz[i][j] = scan.nextInt();
            }
        }
        
        mostrarMatriz(matriz);

        System.out.printf("Soma da diagonal principal: %d", somaDiagonal(matriz));
        System.out.printf("\nSoma da diagonal secundária: %d", somaDiagonalInvertida(matriz));
    }

    public static void mostrarMatriz(int[][] matriz){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.printf("%d ", matriz[i][j]);
            }
            System.out.println();
        }
    }

    public static int somaDiagonal(int[][] matriz){
        int soma = 0;

        //For que soma diagonal normal.
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if(j == i){
                    soma += matriz[i][j];
                }
            }
        }
        return soma;
    }

    public static int somaDiagonalInvertida(int[][] matriz){
        int soma = 0;

        //For que soma diagonal Invvertida.
        for (int i = matriz.length; i > 0; i--) {
            for (int j = matriz[0].length; j > 0; j--) {
                if(j == i){
                    soma += matriz[i-1][j-1];
                }
            }
        }
        return soma;
    }
}
