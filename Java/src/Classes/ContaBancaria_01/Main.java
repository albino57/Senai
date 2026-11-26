package Classes.ContaBancaria_01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("- - - C r i a r   C o n t a   B a n c á r i a - - -");
        System.out.print("\nDigite o nome---: ");
        String nome = scan.nextLine();

        System.out.print("Digite a agência: ");
        short agencia = scan.nextShort();

        System.out.print("Digite a Conta--: ");
        short contaNumero = scan.nextShort();
        scan.close();

        ContaBancaria conta1 = new ContaBancaria(nome, agencia, contaNumero);
        conta1.setSaldo(500);

        System.out.println("----------------------------------");
        System.out.println("Nome----------: " + conta1.getTitular());
        System.out.println("Agência-------: " + conta1.getAgencia());
        System.out.println("Número--------: " + conta1.getNumero());
        System.out.println("Saldo Bancário: " + conta1.getSaldo());
    }
}
