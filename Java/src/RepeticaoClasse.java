package src;
public class RepeticaoClasse {
    public static void main(String[] args) {
        int cont=0;

        System.out.print("Contando:");

        while (cont < 10) {
            System.out.printf(" %d", ++cont);
        }
        
        System.out.println("\nFim do programa!");
    }
}
