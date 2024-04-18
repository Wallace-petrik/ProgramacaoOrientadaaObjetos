public class Circulo {
    protected double raio;
    public Circulo(){
        raio = 0;
    }

    public double fornecaArea(){
        double area;
        area = 3.1415*raio*raio;
        return area;
    }
    public void recebaValorRaio(double vRaio){
        raio = vRaio;
    }
}
