public class Calcular {

    protected double a;
    protected double x;
    protected double y;
    protected double z;

    public Calcular( double vX, double vA, double vY, double vz){
        this.a = vA;
        this.x = vX;
        this.y = vY;
        this.z = vz;
    }

    public double calcularRaizQuadradaDaDivisaoDoNumeroDoisPorZ(){

        return Math.sqrt(2/z);
    }

    public double calcularSomaDeYeZDivididoPorY(){

        return  (Math.pow(y+(2*z),2)/2*y);
    }

    public double triplicaValorDeA(){
        return 3*a;
    }
}
