public class Main {
    public static void main(String[] args) {
        Circulo c = new Circulo();
        Interface i = new Interface();

        double valorRaio, valorArea;

        valorRaio = i.pegueValorRaio();
        c.recevaValorRaio(valorRaio);
        valorArea = c.fornecaArea();
        i.mostrarArea(valorArea);
    }
}
