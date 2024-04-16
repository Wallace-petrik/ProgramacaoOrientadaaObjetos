import java.util.*;

public class Interface {
    public Interface() {

    }

    Scanner teclado = new Scanner(System.in);
    Retangulo meuRetangulo = new Retangulo();
    public void getBase(){
        System.out.println("Digite a base do retângulo");
        meuRetangulo.getBase(teclado.nextFloat());
    }

    public void getAltura(){
        System.out.println("Digite a altura do retângulo ");
        meuRetangulo.getAltura(teclado.nextFloat());
    }

    public void mostrarArea(){
        System.out.println("Area: "+meuRetangulo.setArea());
    }
    public void mostrarPerimetro(){
        System.out.println("Perimetro: "+meuRetangulo.setPerimetro());
    }
}
