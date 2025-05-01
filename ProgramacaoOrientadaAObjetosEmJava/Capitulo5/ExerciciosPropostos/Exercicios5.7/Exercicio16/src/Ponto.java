public class Ponto {
    protected double x;
    protected double y;

    public Ponto (){
        this.x = 0;
        this.y = 0;
    }

    public Ponto(double vX, double vY){
        this.x = vX;
        this.y = vY;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void redefinaSe(double vX,double vY){
        this.x = vX;
        this.y = vY;
    }

    public double fornecaDistanciaAte(Ponto outroPonto){
        double outroX, outroY, distancia;
        outroX = outroPonto.getX();
        outroY = outroPonto.getY();
        distancia = Math.sqrt((x-outroX)*(x-outroX) + (y-outroY)*(y-outroY));
        return distancia;
    }
}
