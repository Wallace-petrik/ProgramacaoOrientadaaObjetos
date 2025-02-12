public class Main {
    public static void main(String[] args) {
        Cilindro cilindro = new Cilindro();
        Interface minhaInterface = new Interface();

        cilindro.setAltura(minhaInterface.setAltura());

        minhaInterface.informarVolume(cilindro.volumeDoCilindro(minhaInterface.setRaio()));

    }
}
