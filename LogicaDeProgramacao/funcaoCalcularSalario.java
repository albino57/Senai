import java.util.Scanner;

public class funcaoCalcularSalario {
    static Scanner scan = new Scanner(System.in);
    static double salarioBruto, vendasValor, comissao = 20.0;
    static String nomeVendedor;
    public static void main(String[] args){
        
        entradaDados();
    }


    public static void entradaDados(){
        System.out.print("Digite o nome do vendedor: ");
        nomeVendedor = scan.next();

        System.out.print("Digite o Salário: ");
        salarioBruto = scan.nextDouble();

        System.out.print("Digite o valor das vendas TOTAL: ");
        vendasValor = scan.nextDouble();

        calcular(nomeVendedor, salarioBruto, vendasValor, comissao);
    }


    public static void calcular(String nome, double salario, double vendas, double comissao){
        double salarioLiquido = (vendas * (comissao/100)) + salario;
        double comissaoValor = vendas * (comissao/100);

        System.out.printf("\n-------Vendedor: %s", nome);
        System.out.printf("\n--------Salário: %.2f", salario);
        System.out.printf("\n---------Vendas: %.2f", vendas);
        System.out.printf("\n--Comissão %.1f%%: %.2f", comissao, comissaoValor);
        System.out.printf("\nSalário Líquido: %.2f", salarioLiquido);
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