package Classes.ContaBancaria_01;

public class ContaBancaria {
    
    private double saldo;
    private String titular;
    private short agencia;
    private short numero;

    public ContaBancaria(String titular, short agencia, short numero) {
        this.saldo = 0.0;
        this.titular = titular;
        this.agencia = agencia;
        this.numero = numero;
    }

    // G E T
    public double getSaldo() { return saldo; }
    public String getTitular() { return titular; }
    public short getAgencia() { return agencia; }
    public short getNumero() { return numero; }

    // S E T
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
