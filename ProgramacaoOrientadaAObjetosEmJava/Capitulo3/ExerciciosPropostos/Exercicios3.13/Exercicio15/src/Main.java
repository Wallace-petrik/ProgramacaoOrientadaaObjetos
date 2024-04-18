public class Main {
    public static void main(String[] args) {
        Interface i = new Interface();
        Cilindro meuCilindro = new Cilindro();

        i.mostrarVolume(meuCilindro.calculeVolume());
    }
}
