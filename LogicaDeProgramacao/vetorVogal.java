import java.util.Locale;

public class vetorVogal {
    public static void main(String[] args){
        Locale.setDefault(Locale.of("pt","BR"));

        final int qtd = 5;
        //char[] vogal = new char[qtd];
        char[] vogal = {'A','E','I','O','U'};

        System.out.print("\nVogais:");
        for(int i=0; i < qtd; i++){
            System.out.printf(" %c", vogal[i]);
        }


    }
}
