/* 8. Maior e menor da matriz
* Leia uma matriz 4×3 de inteiros. Mostre o maior e o menor elemento:
* Entrada:
* 5  -2   9
* 4   0  12
* 7   3   1
* 8   6  -5
*
* Maior: 12
* Menor: -5
*/

package Lista_Exercicios_Vetores_Matrizes_Metodos;

import java.util.Scanner;
public class MaiorMenorMatriz_8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        final int linha=4, coluna=3;
        int cont=1;
        int[][] matriz = new int[linha][coluna];
        //int[][] matriz = {{5, -2, 9}, {4, 0, 12}, {7, 3, 1}, {8, 6, -5}};
        
        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
            System.out.printf("Digite o %dº de %d valores da matriz: ", cont, linha*coluna);
                matriz[i][j] = scan.nextInt();
                cont++;
            }
        }
        scan.close();

        maiorMenor(matriz, linha, coluna);
    }

    public static void maiorMenor(int[][] matriz, int linha, int coluna) {
        int maior=0, menor=99999;

        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                if(matriz[i][j] < menor){
                    menor = matriz[i][j];
                }
                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                }
            }
        }

        System.out.print("----------------");
        System.out.printf("\nMaior: %d", maior);
        System.out.printf("\nMenor: %d", menor);
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