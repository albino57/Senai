/* 9. Soma por linha
* Uma matriz 3×2 guarda as notas de 3 alunos em 2 disciplinas. Mostre a soma das notas de
* cada aluno e o total geral.
* Entrada:
* 7  8
* 5  9
* 10  6
*
* Soma do aluno 1: 15
* Soma do aluno 2: 14
* Soma do aluno 3: 16
* Total geral: 45
*/

package Lista_Exercicios_Vetores_Matrizes_Metodos;

public class SomarLinha_9 {
    public static void main(String[] args) {
        int[][] notas = {{7, 8}, {5, 9}, {10, 6}};
        int somaAluno1 = 0, somaAluno2 = 0, somaAluno3 = 0, totalGeral = 0;

        somaAluno1 = somarNota(notas, 0);
        somaAluno2 = somarNota(notas, 1);
        somaAluno3 = somarNota(notas, 2);
        totalGeral = somaAluno1 + somaAluno2 + somaAluno3;

        System.out.printf("Soma do aluno 1: %d", somaAluno1);
        System.out.printf("\nSoma do aluno 2: %d", somaAluno2);
        System.out.printf("\nSoma do aluno 3: %d", somaAluno3);
        System.out.printf("\nTotal geral----: %d", totalGeral);
    }

    public static int somarNota(int nota[][], int linha){
        int soma = 0;
        for (int i = 0; i < nota[0].length; i++) {
            soma += nota[linha][i];
        }
        return soma;
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