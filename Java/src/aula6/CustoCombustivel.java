package aula6;
import java.util.Scanner;

public class CustoCombustivel  {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite a distância percorrida em km------: ");
        double distancia = scan.nextDouble();
        System.out.print("Digite o preço do litro de combustível R$: ");
        double precoLitro = scan.nextDouble();
        System.out.print("Digite o consumo médio do veículo (km/l)-: ");
        double consumo = scan.nextDouble();
        scan.close();

        double custo = calcularCusto(distancia, precoLitro, consumo);
        System.out.printf("\nO custo total para percorrer %.2f km é R$ %.2f", distancia, custo);

    }

    static double calcularCusto(double distancia, double  precoLitro, double consumo){
        double litros = distancia / consumo;
        return litros * precoLitro;
    }
}