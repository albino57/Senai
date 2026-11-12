package src;

import javax.swing.JOptionPane;

public class EntradaClasse {
    public static void main(String[] args) {
        String num1 = JOptionPane.showInputDialog("Digite num1");
        String num2 = JOptionPane.showInputDialog("Digite num1");
        double nota1 = Double.parseDouble(num1);
        double nota2 = Double.parseDouble(num2);
        double media = ((nota1 + nota2) / 2);

        JOptionPane.showMessageDialog(null, media);
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