import java.util.Scanner;

public class MatrizBuscarNumero {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int linha=4, coluna=2;
        boolean thereIS;
        int[][] matriz = {{2,5},{3,9},{10,15},{50,24}};

        do{
            System.out.print("Digite o Nº para pesquisado: ");
            int num = scan.nextInt();
            thereIS = procurarNumero(num, linha, coluna, matriz);

        }while(thereIS);
        scan.close();
    }

    public static boolean procurarNumero(int num, int linha, int coluna, int matriz[][]){
        for(int i=0; i < linha; i++){
            for(int x=0; x < coluna; x++){
                if(num == matriz[i][x]){
                    System.out.printf("O Nº %d já existe na matriz. Digite outro número!\n\n", num);
                    return true;
                }
            }
        }
        System.out.printf("O Nº %d não existe na matriz!", num);
        return false;
    }
}

/*
 * java.lang.Math
 * Math.sqrt(numero) | Math.pow(numero, potencia) | Math.abs(numero)
 * ------------------------------------------------------------------------
 * String > scan.next(); Lê uma palavra/letra
 * String > scan.nextLine(); Lê uma frase inteira e para só com ENTER
 * int scan.nextInt(); Lê inteiro
 * double scan.nextDouble(); Lê double
 * char scan.next().charAt(0); Lê o primeiro caracter
 * ------------------------------------------------------------------------
 * Locale.setDefault(Locale.US); | Locale.setDefault(Locale.of("pt","BR"));
 * ------------------------------------------------------------------------
 * %f = float, double | %d = byte, short, int, long | %s = String | %c = char | %n = quebra de linha
 */