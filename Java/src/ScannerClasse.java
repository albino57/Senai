package src;

import java.util.Scanner;

public class ScannerClasse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scan.nextLine();

        System.out.print("Digite sua idade: ");
        int numero = scan.nextInt();

        System.out.print("Digite sua altura: ");
        double altura = scan.nextDouble();

        System.out.println("\n-------------------------------");
        System.out.printf("%s-%d-%.2f",nome, numero, altura);
        System.out.println("\n-------------------------------");
    }
}
/*
 * java.lang.Math
 * Math.sqrt(numero) | Math.pow(numero, potencia) | Math.abs(numero)
 * ------------------------------------------------------------------------
 * String > scan.next(); Lê uma palavra/letra
 * String > scan.nextLine(); Lê uma frase inteira e para só com ENTER
 * int scan.nextInt(); Lê inteiro
 * double scan.nextDouble(); Lê double
 * char scan.next().charAt(0); Lê o primeiro caracter
 * ------------------------------------------------------------------------
 * Locale.setDefault(Locale.US); | Locale.setDefault(Locale.of("pt","BR"));
 * ------------------------------------------------------------------------
 * %f = float, double | %d = byte, short, int, long | %s = String/boolean | %b =
 * boolean | %c = char | %n = quebra de linha
 */