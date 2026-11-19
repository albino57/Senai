package trabalhos;
import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean keepLoop = true;
        byte option;
        float saldo = 1000.0f;

        do{
            menu();
            option = scan.nextByte();

            switch (option) {
                case 1:
                    System.out.printf("\n-Seu saldo é: %.2f", saldo);
                    System.out.print("\n\n");
                    break;
                
                case 2:
                    System.out.printf("\n-Digite o valor do deposito: ");
                    float deposito = scan.nextFloat();

                    while(deposito <= 0.0){
                        System.out.printf("\n-O valor do deposito precisa ser > 0: ");
                        deposito = scan.nextFloat();
                    }

                    saldo += deposito;
                    System.out.print("\n\n");
                    break;
            
                case 3:
                    System.out.printf("\n-Digite o valor do saque (saldo: %.2f): ", saldo);
                    float saque = scan.nextFloat();

                    while (saque <= 0 || saque >= saldo) {
                        System.out.printf("\n-Você deve digitar um valor > 0 e < que seu saldo (saldo: %.2f): ", saldo);
                        saque = scan.nextFloat();
                    }

                    saldo -= saque;
                    System.out.print("\n\n");
                    break;

                case 0:
                    keepLoop = false;
                    break;
                default:
                    System.out.print("\nOpção inválida!");
                    System.out.print("\n\n");
                    break;
            }
        }while(keepLoop);
        System.out.print("\nObrigado por usar o Caixa Senai. Até mais!");
        scan.close();
    }

    public static void menu(){
        System.out.println("======= Caixa Senai Eletrônico =======");
        System.out.println("1 - Consultar saldo");
        System.out.println("2 - Depositar");
        System.out.println("3 - Sacar");
        System.out.println("0 - Sair");
        System.out.print("Type in: ");
    }
}
