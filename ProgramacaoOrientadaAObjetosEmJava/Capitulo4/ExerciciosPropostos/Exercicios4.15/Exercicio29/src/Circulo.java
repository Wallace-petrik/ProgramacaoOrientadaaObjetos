public class Circulo {
    protected  double raio;

    public Circulo(){
        raio = 0d;
    }
    public double fornecaArea(){
        double area;
        area = Math.PI*Math.pow(raio,2);
        return area;
    }
    public void receverValorRaio(double vRaio){
        raio = vRaio;
    }
}
