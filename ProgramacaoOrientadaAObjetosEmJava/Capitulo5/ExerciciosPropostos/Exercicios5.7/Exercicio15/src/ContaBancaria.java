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

}
