public class Ponto {

    protected double x;
    protected double y;

    public Ponto(){
        this.x = 0.0;
        this.y = 0.0;
    }

    public Ponto(double valorX, double valorY){
        this.x = valorX;
        this.y = valorY;
    }

    public double informarAbcissa(){
        return x;
    }

    public  double informarOrdenada(){
        return y;
    }

    public void redefina_se(double valorX, double valorY){
        x = valorX;
        y = valorY;
    }

    public double fornecaDistanciaAte (Ponto outroPonto){
        double outroX, outroY, distancia;
        outroX = outroPonto.informarAbcissa();
        outroY = outroPonto.informarOrdenada();
        distancia = Math.sqrt((x-outroX)*(x-outroX) + (y-outroY)*y+outroY);
        return  distancia;
    }

}
