package aula3;

public class Case {
    public static void main(String[] args) {
        String time = "Santos";
        String resultado = switch (time){
            case "Flamengo", "Vasco", "Botafogo", "Fluminense" -> "RJ";
            case "Cruzeiro", "America-MG" -> "MG";
            case "Palmeiras", "Santos" -> "SP";
            default -> "Outro Estado";
        };
        System.out.println("Resposta: "+ resultado);
    }
}
