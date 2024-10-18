import java.util.Scanner;
public class Interface {

    private int valorInt;
    private double valorDouble;

    public Interface() {
        this.valorInt = 0;
        this.valorDouble = 0.0d;
    }

    Scanner teclado = new Scanner(System.in);

    public void lerInt (){

        System.out.println("Digite um número inteiro:");
        valorInt = teclado.nextInt();

    }

    public void escreverInt(){

        System.out.println("Int: "+valorInt);

    }

    public void lerDouble(){

        System.out.println("Digite um número Double:");
        valorDouble = teclado.nextDouble();

    }

    public void escreverDouble(){

        System.out.println("Double: "+valorDouble);

    }
}
