/* 4 alunos e 3 disciplinas (Lógica, Banco de Dados e Redes). Nomes em um vetor, notas em uma
* matriz 4×3. Mostre a média e a situação de cada aluno (Aprovado ≥ 7, Recuperação ≥ 5,
* Reprovado), a média de cada disciplina e o aluno com a maior média.
* 
* Entrada:
* Ana      8  7,5    9
* Bruno    5    6  4,5
* Carla  9,5    8   10
* Diego    3  4,5    6
* 
* Saída:
* Ana: 8,17 - Aprovado
* Bruno: 5,17 - Recuperação
* Carla: 9,17 - Aprovado
* Diego: 4,50 - Reprovado
*
* Lógica: 6,38
* Banco de Dados: 6,50
* Redes: 7,38
* Maior média: Carla (9,17)
*/

package Lista_Exercicios_Vetores_Matrizes_Metodos;

public class BoletimTurma_13 {
    public static void main(String[] args) {
        String[] materias = {"Lógica", "Banco de Dados", "Redes"};
        String[] nomes = {"Ana", "Bruno", "Carla", "Diego"};
        double[][] notas = {
            {  8, 7.5, 9},
            {  5, 6, 4.5},
            {9.5, 8, 10 },
            {  3, 4.5, 6}};
        
        calcularMedia(notas, nomes);
        System.out.print("\n-----------------------------");
        mediaMaterias(notas, materias);
        maiorNota(notas, nomes);
    }

    public static void maiorNota(double[][] notas, String[] nomes){
        double[] maiorNota = new double[notas.length];
        double maiorMedia = 0;
        String nomeAluno = "";


        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[0].length; j++) {
                maiorNota[i] += notas[i][j]; 
            }
            maiorNota[i] /= notas[0].length;
        }

        for (int i = 0; i < maiorNota.length; i++) {
            if(maiorMedia < maiorNota[i]){
                maiorMedia = maiorNota[i];
                nomeAluno = nomes[i];
            }
        }
        
        System.out.printf("\nMaior média: %s (%.2f)", nomeAluno, maiorMedia);
    }

    public static void mediaMaterias(double[][] notas, String[] materias){
        double somaMateria = 0;
        //Esse é o for das rodadas. Como se fosse uma régua na vertical.
        for(int x = 0; x < notas[0].length; x++){
            for (int i = 0; i < notas.length; i++) {
                for (int j = 0; j < notas[0].length; j++) {
                    if(x == j){
                        somaMateria += notas[i][j];
                    }
                }
            }
            somaMateria = somaMateria/notas.length;
            System.out.printf("\n%s: %.2f", materias[x], somaMateria);
            somaMateria = 0;
        }
    }

    public static void calcularMedia(double[][] notas, String[] nomes) {
        double somaMedia = 0;
        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[0].length; j++) {
                somaMedia += notas[i][j];
            }

            somaMedia = somaMedia/notas[0].length;
            System.out.printf("\n%s: %.2f - ", nomes[i], somaMedia);

            if(somaMedia >= 7){
                System.out.print("Aprovado");
            }else if(somaMedia >= 5){
                System.out.print("Recuperação");
            }else{
                System.out.print("Reprovado");
            }
            somaMedia = 0;
        }
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