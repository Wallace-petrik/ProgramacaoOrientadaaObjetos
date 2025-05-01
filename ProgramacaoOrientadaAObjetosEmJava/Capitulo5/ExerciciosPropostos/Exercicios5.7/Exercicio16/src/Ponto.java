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


}
