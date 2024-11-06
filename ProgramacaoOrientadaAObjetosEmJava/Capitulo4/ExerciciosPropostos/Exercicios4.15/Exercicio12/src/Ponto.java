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

    public double fornecaDistanciaAteOrigin (){
        double distancia;
        distancia = Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
        return distancia;
    }

    public void deslocarHorizontamente(double valorDeDeslocamento){
        this.x+= valorDeDeslocamento;
    }

    public double calcularCoeficienteAngular (Ponto outroPonto){
        double coeficienteAngular = 0;

        coeficienteAngular = (outroPonto.y-y)/(outroPonto.x-x);

        return coeficienteAngular;
    }

    public void novaLocalizacaoComMetodoPolares(double distancia, double angulo) {
        this.x = distancia * Math.cos(angulo);
        this.y = distancia * Math.sin(angulo);
    }
    public  void reposicionarPonto(int angulo){
        double anguloRadianos = Math.toRadians(angulo);
        double xRotacionado  = x * Math.cos(anguloRadianos) - y * Math.sin(anguloRadianos);
        double YRotacionado  = x * Math.sin(anguloRadianos) + y * Math.cos(anguloRadianos);
        this.x = xRotacionado;
        this.y = YRotacionado;
    }
}
