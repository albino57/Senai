/* 17. Métodos com vetor.
* Leia 6 inteiros. Crie os métodos lerVetor, mostrar, somar, media, maior e contar(v, valor). O
* main() não tem nenhum for: só chama os métodos.
*
* Entrada: 4 7 2 7 9 1
*
* Saída: 
* Vetor: 4 7 2 7 9 1
* Soma: 30
* Média: 5,00
* Maior: 9
* Contar qual valor? 7
* O valor 7 aparece 2 vez(es).
*/
package Lista_Exercicios_Vetores_Matrizes_Metodos;

import java.util.Scanner;

public class MetodosComVetor_17 {
    public static void main(String[] args) {
        leitura();
    }

    public static void leitura(){
        Scanner scan = new Scanner(System.in);
        //float[] vetor = {4, 7, 2, 7, 9, 1};
        float[] vetor = new float[6];

        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("Digite o %dº número: ", i+1);
            vetor[i] = scan.nextFloat();
        }

        System.out.print("Contar qual valor?: ");
        float valor = scan.nextFloat();
        scan.close();
        //float valor = 7;
        
        imprimirVetor(vetor, valor);
    }

    public static void imprimirVetor(float[] vetor, float valor){
        System.out.print("Vetor: ");

        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("%.0f ", vetor[i]);
        }
        soma(vetor, valor); //chama a próxima função.
    }

    public static void soma(float[] vetor, float valor){
        float soma = 0;

        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i];
        }
        System.out.printf("\nSoma-: %.0f", soma);
        media(vetor, soma, valor); //chama a próxima funcao de novo hehe.

    }

    public static void media(float[] vetor, float soma, float valor){
        System.out.printf("\nMedia: %.2f", soma/vetor.length);
        maior(vetor, valor);
    }

    public static void maior(float[] vetor, float valor){
        float maior = 0f;

        for (int i = 0; i < vetor.length; i++) {
            if(maior < vetor[i]){
                maior = vetor[i];
            }
        }
        System.out.printf("\nMaior: %.0f", maior);
        contarValor(vetor, valor);
    }

    public static void contarValor(float[] vetor, float valor){
        short vezesRepetidas = 0;

        for (int i = 0; i < vetor.length; i++) {
            if(valor == vetor[i]){
                vezesRepetidas++;
            }
        }
        
        if(vezesRepetidas > 1) System.out.printf("\nO valor %.0f aparece %d vezes.", valor, vezesRepetidas);
        if(vezesRepetidas == 1) System.out.printf("\nO valor %.0f aparece %d vez.", valor, vezesRepetidas);
        if(vezesRepetidas < 1) System.out.printf("\nO valor %.0f não se repete.", valor);
    }
}
