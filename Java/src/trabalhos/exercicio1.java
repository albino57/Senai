package trabalhos;

import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite um Nº: ");
        short num = scan.nextShort();

        System.out.println("\n--------------");
        System.out.printf("\nNº digitado: %d", num);
        System.out.printf("\nNº antecessor: %d", num-1);
        System.out.printf("\nNº sucessor: %d", num+1);
        scan.close();
    }
}
