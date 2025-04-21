import java.util.Scanner;

public class ContaBancaria {

    private String nome;
    private int id;
    private double saldo;
    private double limiteSaldoNegativo;

    public ContaBancaria(String vNome, int vId, double vSaldo, double vLimiteSaldoNegativo){
        this.nome = vNome;
        this.id = vId;
        this.saldo = vSaldo;
        this.limiteSaldoNegativo = vLimiteSaldoNegativo;
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

    public void deposito(){
        double valorDoDeposito;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o valor do deposisto: ");
        valorDoDeposito = teclado.nextDouble();

        if(valorDoDeposito>0){
            this.saldo+=valorDoDeposito;
            System.out.println("Deposito realizado com sucesso!!!");
        }else{
            System.out.println("Valor do deposito invalidop!!!");
        }
    }

}
