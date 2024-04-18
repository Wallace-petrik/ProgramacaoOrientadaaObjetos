public class Cilindro {
    protected Circulo base;
    protected double altura;

    public double calculeVolume(){
        Interface minhaInterface = new Interface();
        base = new Circulo();

        base.recebaValorRaio(minhaInterface.pegaValorRaio());
        this.altura = minhaInterface.getAltura();

        double volume = base.fornecaArea() *  altura;

        return volume;
    }
}
