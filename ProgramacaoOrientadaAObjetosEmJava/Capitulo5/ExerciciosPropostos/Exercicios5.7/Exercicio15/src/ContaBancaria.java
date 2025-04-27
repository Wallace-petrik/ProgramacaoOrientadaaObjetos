import java.util.Scanner;

public class ContaBancaria {

    private String nome;
    private int id;
    private double saldo;
    private double limiteSaldoNegativo;

    public ContaBancaria(String vNome, int vId, double vSaldo){
        this.nome = vNome;
        this.id = vId;
        this.saldo = vSaldo;
        this.limiteSaldoNegativo = 50;
    }

    public ContaBancaria(int vId, String vNome){
        this.id = vId;
        this.nome = vNome;
    }

    public String getNome() {
        return nome;
    }

    public int getId() {
        return id;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getLimiteSaldoNegativo() {
        return limiteSaldoNegativo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setLimiteSaldoNegativo(double limiteSaldoNegativo) {
        this.limiteSaldoNegativo = limiteSaldoNegativo;
    }

    public void saque(){

    }
}
