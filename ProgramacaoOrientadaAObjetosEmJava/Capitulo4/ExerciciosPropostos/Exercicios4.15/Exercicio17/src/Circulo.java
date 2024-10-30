public class Circulo {

    protected  double raio;

    public Circulo() {

        this.raio = 0;

    }

    public double fornecaArea(){

        double area ;
        area = (Math.PI * Math.pow(raio,2));
        return area;

    }

    public void receberValorRaio (double valorRaio){

        this.raio = valorRaio;

    }

    public double calcularAreaDoSetorCircularS(int anguloSetor){

        double areaDoSetor;
        areaDoSetor = (Math.PI * Math.pow(raio,2) * anguloSetor)/360;
        return  areaDoSetor;

    }

}
