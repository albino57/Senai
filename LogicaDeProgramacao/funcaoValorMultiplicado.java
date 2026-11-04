import java.util.Scanner;

public class funcaoValorMultiplicado {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um Nº: ");
        int num = scan.nextInt();

        System.out.printf("O valor multiplicado por 10 é: %d", multiplicar(num));
        scan.close();
    }

    public static int multiplicar(int num){
        return num * 10;
    }

}
