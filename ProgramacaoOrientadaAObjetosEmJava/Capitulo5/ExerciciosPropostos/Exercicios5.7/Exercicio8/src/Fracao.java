public class Fracao {

    protected int numerador;
    protected int denominador;

    public Fracao(int vNumerador, int vDenominador){
        this.numerador = vNumerador;
        this.denominador = vDenominador;
    }

    private int mdc(int n, int m){
        while (n != m){
            if(n > m){
                n = n - m;
            }else{
                m = m - n;
            }
        }
        return n;
    }

    public int getDenominador() {
        return denominador;
    }

    public int getNumerador() {
        return numerador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public void reduzaSe(){
        int maximo = this.mdc(Math.abs(numerador),Math.abs(denominador));
        numerador = numerador/maximo;
        denominador = denominador/maximo;
    }
    public double fornecaQuociente(){
        return (double) numerador/denominador;
    }
    public Fracao fornecaSuaSomaCom(Fracao outro){
        int den = denominador*outro.getDenominador();
        int num = outro.denominador*numerador + denominador * outro.numerador;
        Fracao f = new Fracao(num,den);
        f.reduzaSe();
        return  f;
    }
    public Fracao fornecaCopia(){
        return new Fracao(numerador,denominador);
    }
}
