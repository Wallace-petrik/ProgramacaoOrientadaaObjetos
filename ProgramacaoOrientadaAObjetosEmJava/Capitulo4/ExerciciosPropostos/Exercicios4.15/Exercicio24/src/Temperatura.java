public class Temperatura {

    private float temperaturaEmFahrenheit;
    private float temperaturaEmCelsisus;

    public Temperatura(){

    }
    public Temperatura(float temperaturaEmCelsisus) {
        this.temperaturaEmCelsisus = temperaturaEmCelsisus;
    }

    public float getTemperaturaEmFahrenheit() {
        return temperaturaEmFahrenheit;
    }

    public float getTemperaturaEmCelsisus() {
        return temperaturaEmCelsisus;
    }

    public void setTemperaturaEmCelsisus(float temperaturaEmCelsisus) {
        this.temperaturaEmCelsisus = temperaturaEmCelsisus;
    }

    public void converterCelsiusParaFahrenheit(){
        temperaturaEmFahrenheit = ((9/5.0f)*temperaturaEmCelsisus)+32;
    }
}
