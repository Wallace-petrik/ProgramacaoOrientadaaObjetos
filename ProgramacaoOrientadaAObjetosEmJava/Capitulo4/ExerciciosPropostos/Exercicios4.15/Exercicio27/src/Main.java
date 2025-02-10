public class Main {
    public static void main(String[] args) {

        Interface minhaInterface = new Interface();
        Paralelepipedo meuParalelepipedo = new Paralelepipedo(2,5,7);

        minhaInterface.mostarValores("Àrea: "+meuParalelepipedo.informarValorAreaExterna());
        minhaInterface.mostarValores("Diagonal: "+meuParalelepipedo.informarValorDiagonal());
        minhaInterface.mostarValores("Volume: "+meuParalelepipedo.informarValorVolume());
    }
}