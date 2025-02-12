public class Cilindro {
    protected Circulo base;
    protected double altura;

    public Cilindro(){
        altura = 0;
        base = new Circulo();
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double volumeDoCilindro(double vRaio){
        double volume;
        base.receverValorRaio(vRaio);
        volume = base.fornecaArea()*altura;
        return volume;
    }

}
