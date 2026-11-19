package aula5;
public class MatrizMaiorMenor {
    public static void main(String[] args) {
        int[][] matriz = {{7,3,14},{22,34,4},{32,44,2},{444,56,33}};
        
        MaiorMenorMatriz(matriz);
    }

    static void MaiorMenorMatriz(int matriz[][]){
        int maior=0, menor=100000;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if(matriz[i][j] > maior) maior = matriz[i][j];
                if(matriz[i][j] < menor) menor = matriz[i][j];
            }
        }
        System.out.printf("\nMaior valor da Matriz: %d", maior);
        System.out.printf("\nMenor valor da Matriz: %d", menor);
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