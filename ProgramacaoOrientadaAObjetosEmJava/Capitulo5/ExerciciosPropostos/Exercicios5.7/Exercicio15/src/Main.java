public class Main {
    public static void main(String[] args) {
        ContaBancaria minhaConta = new ContaBancaria("wallace",1,0);
        do {
            minhaConta.deposito();
            minhaConta.saque();
            System.out.println("Saldo: "+minhaConta.getSaldo());
        }while (true);

    }
}
