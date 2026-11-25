/* 11. Total de vendas por dia
* Com a mesma matriz do exercício 10, mostre o total vendido em cada dia e qual dia vendeu mais
* Dia 1: 480
* Dia 2: 420
* Dia 3: 800
* Dia 4: 350
* Maior total: Dia 3 (800)
*/
package Lista_Exercicios_Vetores_Matrizes_Metodos;

public class TotalVendasDia_11 {
    public static void main(String[] args) {
        int[][] venda = {
            {200, 400, 450, 100 },
            {600, 200, 450, 1400},
            {160, 240, 800, 200 },
            {890, 234, 2123, 256 }
        };
        
        mostrarMaisVendidoDia(venda);
    }

    public static void mostrarMaisVendidoDia(int[][] matriz){
        int[] maiorVenda = new int[matriz.length];
        int maiorDiaValor = 0, dia = 0;

        //Busca a mior venda por dia
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if(maiorVenda[i] < matriz[i][j]){
                    maiorVenda[i] = matriz[i][j];
                }
            }
            System.out.printf("\nDia %d: %d", i+1, maiorVenda[i]);
        }

        //Busca a maior venda de todos os dias
            for (int j = 0; j < maiorVenda.length; j++) {
                if(maiorDiaValor < maiorVenda[j]){
                    maiorDiaValor = maiorVenda[j];
                    dia = j;
                }
            }
        
        System.out.printf("\nMaior Total: Dia %d (%d)", dia+1 ,maiorDiaValor);
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