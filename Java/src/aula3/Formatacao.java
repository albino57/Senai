package aula3;

public class Formatacao {
    public static void main(String[] args) {
        String nome = "Ana";
        int idade = 20;
        double altura = 1.54;
        String email = "ana@gmail.com";
        System.out.printf("Nome: %s\nIdade: %d anos\nAltura: %.2f\nE-mail: %s", nome, idade, altura, email);
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