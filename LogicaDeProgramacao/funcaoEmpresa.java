import java.util.Scanner;

public class funcaoEmpresa {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        entrada_dados(scan);
        scan.close();
    }

    public static void entrada_dados(Scanner scan){
        String empresa;
        short ano;

        System.out.print("Digite o ano do Curso: ");
        ano = scan.nextShort();

        System.out.print("\nDigite o nome da Empresa: ");
        empresa = scan.next();
        
        mensagem(empresa, ano);
    }

    public static void mensagem(String empresa, short ano){
        System.out.println("****************");
        System.out.printf("***%s-%d***\n", empresa, ano);
        System.out.println("****************");
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