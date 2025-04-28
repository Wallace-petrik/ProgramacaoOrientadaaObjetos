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


    public void deposito(float valorDeposito){

        if(valorDeposito>0){
            this.saldo = valorDeposito;
            System.out.println("Deposito realizado com sucesso !!!");
        }else{
            System.out.println("O deposito não pode ser realziado !!!");
        }
    }


}
