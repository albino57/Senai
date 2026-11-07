public class vetorLocadoraCarros {
    public static void main(String[] args){
        final int tam = 3;
        String[][] carros = {{"Palio", "ABC123", "Sim"},
                             {" Gol ", "JCV234", "Sim"},
                             {" Uno ", "CAR456", "Não"}};

        exibirDados(tam, carros);
    }

    public static void exibirDados(int tam, String carros[][]){
        System.out.println("| Carro | Placa  | Alugado");
        for(int i=0; i<tam; i++){
            for(int x=0; x<tam; x++){
                System.out.printf("| %s ", carros[i][x]);
            }
            System.out.println();
        }
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