import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Pessoa umaPessoa = new Pessoa();
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite sua idade: ");
        umaPessoa.receberValorIdade(teclado.nextInt());
        System.out.println("Provával ano de nascimento: "+umaPessoa.informaAnoDeNascimento(umaPessoa.idade));
    }
}