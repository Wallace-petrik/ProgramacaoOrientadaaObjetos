import java.util.Scanner;
public class Interface {

    protected int valor;

    public Interface() {
        this.valor = 0;
    }

    public void lerInt (){

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um número inteiro");
        valor = teclado.nextInt();

    }

    public void escreverInt(){
        System.out.printf("Int: "+valor);
    }
}
