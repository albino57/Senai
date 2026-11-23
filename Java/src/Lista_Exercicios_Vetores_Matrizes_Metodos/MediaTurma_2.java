/* 2. Média da turma
* Leia as notas de 5 alunos em um vetor. Mostre a média da turma, quantos foram aprovados
* (nota ≥ 7) e quantos foram reprovados.
* Entrada: 8 6,5 7 9 5
*
* Saída: 
* Média da turma: 7,10
* Aprovados: 3
* Reprovados: 2
*/
package Lista_Exercicios_Vetores_Matrizes_Metodos;
import java.util.Scanner;
public class MediaTurma_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[] notas = new double[5];
        double media = 0;
        int aprovados = 0, reprovados = 0;

        for (int i = 0; i < notas.length; i++) {
            System.out.printf("Digite a nota do %dº aluno: ", i + 1);
            notas[i] = scan.nextDouble();
            media += notas[i];

            if(notas[i] >= 7) aprovados++;
            else reprovados++;
        }
        scan.close();

        System.out.printf("\n\nMédia da turma: %.2f", media / notas.length);
        System.out.printf("\nAprovados-----: %d", aprovados);
        System.out.printf("\nReprovados----: %d", reprovados);

    }
}

/*
 * ------------------------------------------------------------------------
 * String > scan.next(); Lê uma palavra/letra
 * String > scan.nextLine(); Lê uma frase inteira e para só com ENTER
 * char scan.next().charAt(0); Lê o primeiro caracter
 * ------------------------------------------------------------------------
 * Locale.setDefault(Locale.US); | Locale.setDefault(Locale.of("pt","BR"));
 * ------------------------------------------------------------------------
 * %f = float, double | %d = byte, short, int, long
 * %s = String/boolean | %b = boolean | %c = char | %n = quebra de linha
 */