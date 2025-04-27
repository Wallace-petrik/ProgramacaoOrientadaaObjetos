import java.util.Scanner;

public class ContaBancaria {

    private String nome;
    private int id;
    private double saldo;
    private double chequeEspecial;

    public ContaBancaria(String vNome, int vId, double vSaldo){
        this.nome = vNome;
        this.id = vId;
        this.saldo = vSaldo;
        this.chequeEspecial = 50;
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

    public double getchequeEspecial() {
        return chequeEspecial;
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

    public void setchequeEspecial(double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }

    private float entradaDeDados(String tipoDeEntrada){
        float valor = 0;
        Scanner teclado = new Scanner(System.in);
        valor = teclado.nextFloat();
        return  valor;
    }

    private float chequeEspecial(float valores, int tipoDeOperacao){
        // 1 para deposito e 2 para saque.
        if(tipoDeOperacao==1){
            if(valores>=50){
                if(chequeEspecial!=50){
                    chequeEspecial += 50-chequeEspecial;
                }
            }else{

            }
        }else if (tipoDeOperacao==2){

        }
        return 0;
    }

    public void deposito(float valorDeposito){

    }

    public void saque(float valorSaque){

    }
}
