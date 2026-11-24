/* 10. Controle de vendas
* Uma matriz 3×4 guarda as vendas de 3 funcionários (linhas) em 4 dias (colunas). Mostre o
* total de cada funcionário, o total geral e a maior venda.
* Entrada:
* 100  200  150   50
* 300  100  250  200
* 80  120  400  100
*
* Funcionário 1: 500
* Funcionário 2: 850
* Funcionário 3: 700
* Total geral: 2050
* Maior venda: 400
*/
package Lista_Exercicios_Vetores_Matrizes_Metodos;

public class ControleVendas_10 {
    public static void main(String[] args) {
        int[][] venda = {
            {200, 400, 450, 100 },
            {600, 200, 450, 400},
            {160, 240, 800, 200 }
        };
        int total = 0, maiorVenda = 0, funcionario_1 = 0, funcionario_2 = 0, funcionario_3 = 0;

        funcionario_1 = somarVenda(venda, 0);
        funcionario_2 = somarVenda(venda, 1);
        funcionario_3 = somarVenda(venda, 2);
        total = funcionario_1 + funcionario_2 + funcionario_3;
        maiorVenda = maiorVenda(venda);

        System.out.println("Funcionario 1: " + funcionario_1);
        System.out.println("Funcionario 2: " + funcionario_2);
        System.out.println("Funcionario 3: " + funcionario_3);
        System.out.println("Total geral--: " + total);
        System.out.println("Maior venda--: " + maiorVenda);
    }

    public static int somarVenda(int venda[][], int linha){
        int soma = 0;
        for (int i = 0; i < venda[0].length; i++) {
            soma += venda[linha][i];
        }
        return soma;
    }

    public static int maiorVenda(int venda[][]){
        int maior = 0;

        for (int i = 0; i < venda.length; i++) {
            for (int j = 0; j < venda[0].length; j++) {
                if(venda[i][j] > maior){
                    maior = venda[i][j];
                }
            }
        }
        return maior;
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