/*7. Remover repetidos
* Leia 10 inteiros. Monte um novo vetor, do tamanho exato, sem os valores repetidos (na ordem
* em que apareceram). Mostre os dois vetores e quantos valores foram removidos.
* Entrada: 4 7 4 2 9 7 7 1 2 5

* Original:      4 7 4 2 9 7 7 1 2 5
* Sem repetidos: 4 7 2 9 1 5
* Valores removidos: 4
*/
package Lista_Exercicios_Vetores_Matrizes_Metodos;

import java.util.Scanner;

public class RemoverRepetidos_7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        byte tam = 10;
        int[] vetEntrada = new int[tam];

        for (int i = 0; i < vetEntrada.length; i++) {
            System.out.printf("Digite o %dº número: ", i + 1);
            vetEntrada[i] = scan.nextInt();
        }
        scan.close();

        System.out.print("\nOriginal----------: ");
        imprimiVetor(vetEntrada);

        System.out.print("Sem repetidos-----: ");
        removeRepetidos(vetEntrada);

    }

    // ↓ Métodos ↓
    public static void imprimiVetor(int vetor[]) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
    }

    public static void removeRepetidos(int[] vetEntrada) {
        int[] vetProcessado = new int[vetEntrada.length];
        
        //Aqui se copia o valor do vetor de entrada para o vetor processado
        for (int i = 0; i < vetProcessado.length; i++) {
            vetProcessado[i] = vetEntrada[i]; 
        }

        //Aqui verifica se há repetição , se sim, o valor é zerado
        for (int i = 0; i < vetEntrada.length; i++) {
            for (int j = i+1; j < vetEntrada.length; j++) {
                if (vetProcessado[i] == vetProcessado[j]){
                    vetProcessado[j] = 0;
                }
            }
        }
        
        //Aqui imprimi o vetor que não tenha o número 0 e faz a contagem de quantos números foram removidos
        int cont = 0;
        for (int i = 0; i < vetProcessado.length; i++) {
            if(vetProcessado[i] != 0){ 
                System.out.print(vetProcessado[i] + " ");
            }else{
                cont++;
            }
        }
        System.out.printf("\nValores removidos-: %d", cont);
    }
}