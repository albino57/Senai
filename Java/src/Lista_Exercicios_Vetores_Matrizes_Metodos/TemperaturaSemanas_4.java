/* 4. Temperaturas da semana
* Leia a temperatura de cada dia da semana (Domingo a Sábado). Mostre a média, os dias acima
* da média e o dia mais quente.
* Entrada: 22,5 25 27,5 21 19,5 24 28

* Média da semana: 23,9 °C
* Dias acima da média:
* Segunda (25,0 °C)
* Terça (27,5 °C)
* Sexta (24,0 °C)
* Sábado (28,0 °C)
* Dia mais quente: Sábado (28,0 °C)
*/
package Lista_Exercicios_Vetores_Matrizes_Metodos;

import java.util.Scanner;

public class TemperaturaSemanas_4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String [] dia = {"Domingo", "Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sábado"};
        double[] temperatura = new double[7];
        double media = 0;
        int maisQuente = 0;

        for (int i = 0; i < temperatura.length; i++) {
            System.out.printf("Digite a temperatura da(o) %s: ", dia[i]);
            temperatura[i] = scan.nextDouble();
            media += temperatura[i];
        }
        scan.close();

        imprimirTemperatura(dia, temperatura, media, maisQuente);
    }

    //Método para descobrir o índice da maior temperatura;
    public static int maiorTemperatura(double temperatura[]){
        int maisQuente = 0;
        for (int i = 0; i < temperatura.length; i++) {
            for (int j = 0; j < temperatura.length; j++) {
                if(temperatura[i] < temperatura[j]){
                    maisQuente = j;
                }
            }
        }
        return maisQuente;
    }

    public static void imprimirTemperatura(String dia[], double temperatura[], double media, int maisQuente){
        double mediaProcessada = media / dia.length;
        // ↓ Chama o método maiorTemperatura para pegar o índice da maior temperatura.
        int diaMaisQuente = maiorTemperatura(temperatura);

        System.out.printf("\nTemperatura média da semana: %.1f", mediaProcessada);
        System.out.print("\n---------------------------------");
        System.out.print("\nDias acima da média: ");
        for (int i = 0; i < dia.length; i++) {
            if(temperatura[i] > mediaProcessada){
                System.out.printf("\n%s (%.1f °C)", dia[i], temperatura[i]);
            }
        }
        System.out.print("\n---------------------------------");
        // ↓ Aqui usa o índice da maior temperatura.
        System.out.printf("\nDia mais quente: %s (%.1f °C)", dia[diaMaisQuente], temperatura[diaMaisQuente]);
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