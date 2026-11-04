import java.util.Scanner;

public class funcaoCalculo {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num1, num2;
        char operacao;

        System.out.print("Operações (+ - * / ^ ~)");
        System.out.print("\nAdição + \nSubtração - \nMultiplicação * \nDivisão /");
        System.out.print("\nPotência ^ \nRaiz ~ \n:");
        operacao = scan.next().charAt(0);
        System.out.print("Primeiro Nº: ");
        num1 = scan.nextInt();
        System.out.print("Segundo Nº: ");
        num2 = scan.nextInt();

        System.out.printf("\nResultado: %d", calcular(num1, num2, operacao));
        scan.close();
    }

    public static void alguma(){
        
    }

    public static int calcular(int num1, int num2, char operacao){
        if(operacao ==  '+'){
            return num1 + num2;
        }else if(operacao == '-'){
            return num1 - num2;
        }else if(operacao == '*'){
            return num1 * num2;
        }else if(operacao == '/'){
            return num1 / num2;
        }else if(operacao == '^'){
            return Math.powExact(num1, num2);
        }else{
            return (int) Math.sqrt(num1);
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
 * %f = ponto flutuante | %d = inteiro | %s = texto | %n = quebra de linha
 */