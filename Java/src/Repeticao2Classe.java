package src;

public class Repeticao2Classe {
    public static void main(String[] args) {
        int cont=0;

        System.out.print("Contador:");
        do{
            System.out.printf(" %d", ++cont);
        }while(cont < 10);

        System.out.print("\nContador:");
        for (int i = cont; i > 0 ; i--) {
            System.out.printf(" %d", i);
        }

        System.out.println("\nFim do Programa!");
    }
}
