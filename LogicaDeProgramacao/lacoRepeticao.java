import java.util.Locale;
import java.util.Scanner;

public class lacoRepeticao {
    public static void main(String[] args) {

        Locale.setDefault(Locale.of("pt","BR"));

        byte opcao = 0;
        char loop = 's';
        double num1 = 0.0, num2 = 0.0;

        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("\n===Calculadora===");
            System.out.println("1-Adição \n2-Subtração \n3-Multiplicação \n4-Divisão \n0-SAIR");
            System.out.print("Digite: ");
            opcao = scan.nextByte();

            switch (opcao) {
                case 1:
                    limparTela();
                    System.out.println("-- Adição + --");
                    System.out.print("Digite o 1º nº: ");
                    num1 = scan.nextDouble();

                    System.out.print("Digite o 2º nº: ");
                    num2 = scan.nextDouble();

                    limparTela();

                    System.out.printf("Resultado: %.2f + %.2f = %.2f", num1, num2, calcular(num1, num2, "Adicao"));
                break;
                case 2:
                    limparTela();
                    System.out.println("-- Subtração - --");
                    System.out.print("Digite o 1º nº: ");
                    num1 = scan.nextDouble();

                    System.out.print("Digite o 2º nº: ");
                    num2 = scan.nextDouble();

                    limparTela();

                    System.out.printf("Resultado: %.2f - %.2f = %.2f", num1, num2, calcular(num1, num2, "Subtracao"));
                break;
                case 3:
                    limparTela();
                    System.out.println("-- Multiplicação x --");
                    System.out.print("Digite o 1º nº: ");
                    num1 = scan.nextDouble();

                    System.out.print("Digite o 2º nº: ");
                    num2 = scan.nextDouble();

                    limparTela();

                    System.out.printf("Resultado: %.2f x %.2f = %.2f", num1, num2, calcular(num1, num2, "Multiplicacao"));
                break;
                case 4:
                    limparTela();
                    System.out.println("-- Multiplicação / --");
                    System.out.print("Digite o 1º nº: ");
                    num1 = scan.nextDouble();

                    System.out.print("Digite o 2º nº: ");
                    num2 = scan.nextDouble();

                    limparTela();

                    System.out.printf("Resultado: %.2f / %.2f = %.2f", num1, num2, calcular(num1, num2, "Divisao"));
                break;
                case 0:
                    limparTela();
                    System.out.println("Programa Finalizado!");
                    System.exit(0);
                break;
                default:
                    System.out.print("Opção inválida");
                    break;
            }

        } while (loop == 's');

        scan.close();
    }

//---------- ↓F U N Ç Õ E S ↓----------
    public static double calcular(double valor1, double valor2, String nomeFuncao){
        double resultado = 0.0;

        if(nomeFuncao == "Adicao"){
            resultado = valor1 + valor2;
        
        }else if(nomeFuncao == "Subtracao"){
            resultado = valor1 - valor2;

        }else if(nomeFuncao == "Multiplicacao"){
            resultado = valor1 * valor2;
            
        }else if(nomeFuncao == "Divisao"){
            resultado = valor1 / valor2;
            
        }else{
            System.out.println("Função não encontrada!");
        }
        
        return resultado;
    }


    public static void limparTela() {
        try {// Verifica qual OS está rodando
            if (System.getProperty("os.name").toLowerCase().contains("win")) {
                // Comando para Windows (cls)
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                // Comando para Linux e macOS (clear)
                new ProcessBuilder("clear").inheritIO().start().waitFor();
            }
        } catch (Exception e) {
            System.out.println("Não foi possível limpar a tela: " + e.getMessage());
        }
    }
//---------- ↑F U N Ç Õ E S ↑----------
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