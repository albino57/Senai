public class SalarioVetor {
    public static void main(String[] args){
        final int qtd = 5;
        double[] salario = {1500.56, 2567.43, 1906.43, 3546.00, 3000.00};

        for(int i = 0; i < qtd; i++){
            if(salario[i] >= 2000.00){
                salario[i] *= 1.1;
            }
        }

        System.out.print("\nSalários ajustados: ");
        for(int i = 0; i < qtd; i++){
            System.out.printf(" R$:%.2f", salario[i]);
        }
    }
}