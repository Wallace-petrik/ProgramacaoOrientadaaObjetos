public class Main {
    public static void main(String[] args) {
        double valorRaio;
        double valorArea;
        double valorPerimetro;

        Circulo c = new Circulo();
        Interface i =new Interface();

        valorRaio = i.pegueValor();
        c.recevaValorRaio(valorRaio);
        valorPerimetro = c.fornecePerimetro();
        i.mostarPerimetro(valorPerimetro);
    }
}
