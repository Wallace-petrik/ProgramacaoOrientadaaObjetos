import java.util.Scanner;

public class Esfera {
    private float volume;
    private float pi;
    private float raio;

    public Esfera() {
       volume = 0;
       pi = 3.1415f;
       raio = 0;
    }

    public void getRaio() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o valor do raio: ");
        raio = teclado.nextFloat();
    }

    public void setVolume() {
        volume = (4*pi*(raio*raio*raio))/3;
        System.out.println("O  volume da esfera é "+volume);
    }
}
