package aula4;

import java.util.Scanner;

public class Vetor3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = {20,40,60,10,30,50,100};
        int numero=1;

        do{
            boolean achei = false;
            System.out.print("Digite o Nº: ");
            numero = sc.nextInt();

            for (int i = 0; i < numeros.length; i++) {
                if(numero == numeros[i]){
                    achei = true;
                    break;
                }
            }
            if(numero == 0){
                System.out.println("Encerrando o programa!");
                
            }else if(achei){
                System.out.println("Encontrado um nº no vetor!");
            }else{
                System.out.println("Não encontrado algum nº no vetor!");
            }
        }while(numero != 0);
        sc.close();
    }
}
