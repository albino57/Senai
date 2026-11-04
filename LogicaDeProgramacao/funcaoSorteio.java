import java.util.Random;
import java.util.Scanner;
public class funcaoSorteio {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random gerar = new Random();
        
        int numero = 0, numGerado;

        numGerado = gerar.nextInt(100);
        System.out.print("Digite um número entre 1 e 100: ");
        numero = scan.nextByte();

        System.out.printf("\nNúmero que você digitou: %d", numero);
        System.out.printf("\nNúmero que o PC sorteou: %d", numGerado);

        scan.close();
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
 * %f = ponto flutuante | %d = inteiro | %s = texto | %n = quebra de linha
 */