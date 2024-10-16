import java.util.Scanner;
public class Interface {

    public Interface() {
    }

    Scanner teclado = new Scanner(System.in);

    public int lerInt (){

        int valorInt;
        System.out.printf("Digite um número inteiro");
        valorInt = teclado.nextInt();

        return  valorInt;
    }

}
