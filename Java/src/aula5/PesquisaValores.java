package aula5;

import java.util.Scanner;

public class PesquisaValores {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int tam=10;
        int[] vetor = new int[tam];

        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("Digite o %dº Nº: ", i+1);
            vetor[i] = scan.nextInt();
        }
        scan.close();
        
        System.out.println();
        mostrarVetor(vetor, tam);
        ParImparVetor(vetor, tam);
        System.out.printf("\nSoma do Vetor---: %d", soma(vetor, tam));
        
    }

    public static void ParImparVetor(int vetor[], int tam){
        int par=0, impar=0;
        for (int i = 0; i < tam; i++) {
            if((vetor[i] % 2) == 0) par++;
            else impar++;
        }
        System.out.printf("\nQTD Nº Pares----: %d", par);
        System.out.printf("\nQTD Nº Impares--: %d", impar);
    }

    public static void mostrarVetor(int vetor[], int tam){
        System.out.print("Números do Vetor:");
        for (int i = 0; i < tam; i++) {
            System.out.printf(" %d", vetor[i]);
        }
    }

    public static int soma(int vetor[], int tam){
        int somar=0;
        for (int i = 0; i < tam; i++) {
            somar += vetor[i];
        }
        return somar;
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