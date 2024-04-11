public class Circulo {
    protected double raio;
    protected double pi = 3.1414;
    public Circulo() {
        raio = 0.0;
    }
    public void recevaValorRaio(double vRaio){
        raio = vRaio;
    }

    public double fornecePerimetro(){

         double perimetro;
         perimetro = 2*pi*raio;
         return perimetro;
    }
}