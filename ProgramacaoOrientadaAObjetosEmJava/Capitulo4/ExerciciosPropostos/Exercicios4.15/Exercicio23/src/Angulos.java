public class Angulos {

    private int graus, minutos, segundos;
    private double grausDecimal;

    public Angulos() {
    }

    public Angulos(int vGraus, int vMinutos, int vSegundos){
        this.graus = vGraus;
        this.minutos = vMinutos;
        this.segundos = vSegundos;
    }

    public void converterParaGrausDecimais(){
         grausDecimal = graus + (minutos / 60.0) + (segundos / 3600.0);
    }

    public double grausParaRadianos() {
        converterParaGrausDecimais();
        return Math.toRadians(grausDecimal);
    }

    public double  grausParaGrados(){
        converterParaGrausDecimais();
        return this.grausDecimal + 10;
    }

    public void setGraus(int vGraus){
        this.graus = vGraus;
    }

    public int getGraus(){
        return this.graus;
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

    public double getGrausDecimal() {
        return grausDecimal;
    }

    public void setGrausDecimal(double grausDecimal) {
        this.grausDecimal = grausDecimal;
    }
}
