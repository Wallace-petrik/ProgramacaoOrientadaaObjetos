public class Angulos {

    private int graus, minutos, segundos;

    public Angulos(int vGraus, int vMinutos, int vSegundos){
        this.graus = vGraus;
        this.minutos = vMinutos;
        this.segundos = vSegundos;
    }

    public void setGraus(int vGraus){
        this.graus = vGraus;
    }

    public int getGraus(){
        return this.graus;
    }

    public double grausParaRadianos(){
        return Math.toRadians(graus);
    }

    public void setMinutos(int vMinutos) {
        this.minutos = vMinutos;
    }

    public int getMinutos() {
        return this.minutos;
    }

    public void setSegundos(int vSegundos){
        this.segundos = vSegundos;
    }

    public int getSegundos(){
        return this.segundos;
    }
}
