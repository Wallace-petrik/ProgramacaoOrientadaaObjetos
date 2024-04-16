public class Retangulo {
    private float area;
    private float perimetro;
    private float base;
    private float altura;
    public Retangulo() {
        area = 0;
        perimetro = 0;
        base = 0;
        altura = 0;
    }

    public void getBase(float base) {
        this.base = base;
    }

    public void getAltura(float altura){
        this.altura = altura;
    }

    public float setArea() {
        this.area = base*altura;
        return area;
    }

    public float setPerimetro() {
        this.perimetro = 2 * (base + altura);
        return perimetro;
    }


}
