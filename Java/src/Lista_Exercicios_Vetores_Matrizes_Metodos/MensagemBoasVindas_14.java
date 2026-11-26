/* 14. Mensagem de boas-vindas
* Leia um nome no main() e crie o método static void apresentar(String nome), que mostra a
* mensagem.
*
* Saída: 
* Nome: Marina
* Olá, Marina! Seja bem-vindo(a).
*/
package Lista_Exercicios_Vetores_Matrizes_Metodos;

import java.util.Scanner;

public class MensagemBoasVindas_14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
            
        System.out.print("Digite seu nome: ");
        String nome = scan.nextLine();
        scan.close();

        apresentar(nome);
    }

    public static void apresentar(String nome){
       System.out.printf("Nome: %s", nome);
       System.out.printf("\nOlá, %s! Seja bem-vindo(a).", nome);
    }
}
