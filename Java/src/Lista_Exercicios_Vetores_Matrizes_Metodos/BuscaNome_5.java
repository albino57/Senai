/* 5. Busca de nomes
* Leia 6 nomes. Depois leia um nome para buscar e mostre todas as posições em que ele
* aparece, sem diferenciar maiúsculas de minúsculas.
*
* Entrada: Ana Bruno Carla ana Diego Elisa
*
* Buscar qual nome? Ana
* Encontrado na posição 1
* Encontrado na posição 4
* Ana aparece 2 vez(es).
* Buscar qual nome? Fábio
* Fábio não foi encontrado.
*/
package Lista_Exercicios_Vetores_Matrizes_Metodos;

import java.util.Scanner;

public class BuscaNome_5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] nomes = new String[6];
        String nomeBusca = "";
        short qtd=0;

        for (int i = 0; i < nomes.length; i++) {
            System.out.printf("Digite o %dº nome: ", i+1);
            nomes[i] = scan.nextLine().toUpperCase(); // método toUpperCase para transformar a String em caixa Alta.
        }
        
        System.out.print("\n---------------------------------");
        System.out.print("\nDigite o nome que deseja buscar: ");
        nomeBusca = scan.nextLine().toUpperCase();
        scan.close();

        for (int i = 0; i < nomes.length; i++) {
            if(nomeBusca.equals(nomes[i])){ // método equals para comparar Strings.
                qtd++;
            }
        }
        
        if(qtd == 0) System.out.printf("%s não foi encontrado.", nomeBusca);
        else System.out.printf("%s aparece %d vez(es).", nomeBusca, qtd);
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