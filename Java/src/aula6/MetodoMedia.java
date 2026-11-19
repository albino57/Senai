package aula6;

import java.util.Scanner;
public class MetodoMedia{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite a média do aluno: ");
        double media = scan.nextDouble();
        scan.close();

        System.out.println("Situação do aluno: " + verificarSituacao(media));

    }

    static String verificarSituacao(double media){
        if(media >= 7) return "Aprovado";
        else if(media >= 5) return "Recuperação";
        else return "Reprovado";
    }
}