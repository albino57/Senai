package src;
public class inferencia {
    public static void main(String[] args) {
        //inferência de variável
       var nome = "Rafael";
       var idade = 20;
       var achei = true;
       System.out.println("Nome: " + nome);
       System.out.println("idade: " + idade);
       System.out.println("achou? " + achei);
       System.out.printf("achou?", achei ? "Sim" : "Não");
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