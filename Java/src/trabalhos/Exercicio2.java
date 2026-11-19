package trabalhos;

import javax.swing.JOptionPane;

public class Exercicio2 {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Digite seu nome");
        String email = JOptionPane.showInputDialog("Digite seu E-mail:");
        Double salario = Double.parseDouble(JOptionPane.showInputDialog("Digite seu salário: "));
        
        salario = salario * 1.1;

        String mensagem = String.format("Nome: %s\nE-mail: %s\nSalário: %.2f",nome, email, salario);

        JOptionPane.showMessageDialog(null, mensagem);
    }
}
