package aula3;

public class Vetor {
    public static void main(String[] args) {
        String[] frutas = {"Laranjas", "Manga", "Carambola", "Morango"};

        for (int i = 0; i < frutas.length; i++) {
            System.out.printf(" %s",frutas[i]);
        }
        System.out.println("\n------------------------------");

        //For each
        for (String fruta : frutas) {
            System.out.printf(" %s",fruta);
        }
    }
}
