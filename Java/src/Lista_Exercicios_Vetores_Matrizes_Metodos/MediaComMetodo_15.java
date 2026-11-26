/* 15. Média com método
* Leia duas notas. Crie static double calcularMedia(double n1, double n2) e static String
* situacao(double media), que devolve "Aprovado" (média ≥ 7) ou "Em recuperação".
*
* Saída:
* Nota 1: 8,0
* Nota 2: 6,0
* Média: 7,00
* Situação: Aprovado
*/
package Lista_Exercicios_Vetores_Matrizes_Metodos;

import java.util.Scanner;

public class MediaComMetodo_15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        final byte tam = 2;
        float[] notas = new float[tam];
        float media = 0f;

        for (int i = 0; i < notas.length; i++) {
            System.out.printf("Digite a %dª nota: ", i+1);
            notas[i] = scan.nextByte();
        }
        scan.close();
        
        media = calcularMedia(notas);
        imprimirResultado(notas, media);
        
    }

    public static void imprimirResultado(float[] notas, float media){

        for (int i = 0; i < notas.length; i++) {
            System.out.printf("\nNota %d--: %.1f", i+1, notas[i]);    
        }
        System.out.printf("\nMédia---: %.2f", media);
        System.out.printf("\nSituação: %s", (media >= 7) ? "Aprovado" : "Em recuperação");
    }

    public static float calcularMedia(float[] notas){
        float media = 0f;

        for (int i = 0; i < notas.length; i++) {
            media += notas[i];
        }

        return media/notas.length;
    }
}
