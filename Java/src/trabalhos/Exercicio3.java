package trabalhos;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int resultado=0;

        System.out.print("Digite a base de um Nº: ");
        int base = sc.nextInt();
        resultado = base;
        System.out.print("Digite expoente de um Nº: ");
        int expoente = sc.nextInt();

        for (int i = 0; i < expoente-1; i++) {
            System.out.printf("\n%d^%d", base, i+1);
            resultado *= base;
        }
        System.out.printf("\n%d^%d = %d", base, expoente, resultado);
        sc.close();
    }
}
