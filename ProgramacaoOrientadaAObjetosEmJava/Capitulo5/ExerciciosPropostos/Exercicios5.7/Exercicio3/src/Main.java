import javax.swing.*;

public class Main {
    public static void main(String[] args) {



        int cont = 0;
        int soma = 0;

        do {

            soma += 1;

        }while (cont <= 10);

        cont = 0;
        soma = 0;

        for (cont = 0; cont <= 10; cont++){
            soma += 1;
        }

        cont = 0;
        soma = 0;

        while (cont<=10){
            soma += 1;
            cont++;
        }
    }
}