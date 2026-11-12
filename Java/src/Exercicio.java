package src;

import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double nota1 = 0, nota2 = 0, media = 0;

        System.out.print("Digite a 1ª nota: ");
        nota1 = scan.nextDouble();
        System.out.print("Digite a 2ª nota: ");
        nota2 = scan.nextDouble();

        media = (nota1 + nota2) / 2;

        System.out.println("A média é: " + media);

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
 * %f = float, double | %d = byte, short, int, long | %s = String/boolean | %b = boolean | %c = char | %n = quebra de linha
 */