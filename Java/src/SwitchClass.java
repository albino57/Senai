package src;

public class SwitchClass {
    public static void main(String[] args) {
        int avaliacao = 5;
        switch (avaliacao) {
            case 5:
                System.out.println("Ótimo");
                break;

            case 4:
                System.out.println("Bom");
                break;
        
            case 3:
                System.out.println("Regular");
                break;
            
            case 2:
                System.out.println("Ruim");
                break;

            case 1:
                System.out.println("Péssimo");
                break;
            default:
                System.out.println("Default");
                break;
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
 * %f = float, double | %d = byte, short, int, long | %s = String/boolean | %b = boolean | %c = char | %n = quebra de linha
 */