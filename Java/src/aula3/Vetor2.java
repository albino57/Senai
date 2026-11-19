package aula3;

import java.util.Scanner;

public class Vetor2 {
    public static void main(String[] args) {
        int[] numeros = new int[5];
        Scanner scan = new Scanner(System.in);
        for(int i = 0; i < numeros.length; i++){
            System.out.print("Digite um Nº:");
            numeros[i] = scan.nextInt();
        }
        scan.close();
        System.out.println("Nºs digitados: ");
        for (int i : numeros) {
            System.out.print(" " + i);
        }
    }
}
