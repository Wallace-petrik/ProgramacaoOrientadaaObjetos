import java.util.Scanner;
public class Interface {

    private int valorInt;
    private double valorDouble;
    private char valorChar;

    public Interface() {
        this.valorInt = 0;
        this.valorDouble = 0.0d;
        this.valorChar = '\u0000';
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

    public void lerCaracter(){

        System.out.println("Digite um caracter: ");
        valorChar = teclado.nextLine().charAt(0);

    }

    public void escrverChar(){

        System.out.println("Char: "+valorChar);

    }

}
