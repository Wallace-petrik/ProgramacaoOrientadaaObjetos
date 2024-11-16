import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Temperatura temperatura = new Temperatura();

        System.out.println("Digite a temperatura em Celsisus: ");
        temperatura.setTemperaturaEmCelsisus(teclado.nextInt());

        temperatura.converterCelsiusParaFahrenheit();
        System.out.println("A temperatura em Fahrenheut é "+ temperatura.getTemperaturaEmFahrenheit() );

    }
}