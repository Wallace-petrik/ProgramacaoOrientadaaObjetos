import java.util.Scanner;

public class Interface {
    public Interface(){

    }

    public double pegaValorRaio(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o valor do Raio da base do Cilindro: ");
        double raio = teclado.nextDouble();
        return raio;
    }
    public double getAltura(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o valor da altura do cilindro: ");
        double altura = teclado.nextDouble();
        return altura;
    }
    public void mostrarVolume(double volume){
        System.out.println("Volume: "+volume);
    }
}
