public class FormaGeometrica {

    private int catetoOposto;
    private int catetoAdjacente;
    private double hipotenusa;
    private double perimetro;

    public FormaGeometrica(){
    }

    public FormaGeometrica(int vCatetoOposto, int vCatetoAdjacente){
        this.catetoOposto = vCatetoOposto;
        this.catetoAdjacente = vCatetoAdjacente;
    }

    public double calcularHipotenusa(){
        hipotenusa = Math.pow(catetoOposto,2)+Math.pow(catetoAdjacente,2);
        return hipotenusa;
    }

    public double calcularPerimetro(){
        perimetro = calcularHipotenusa() + catetoOposto + catetoAdjacente;
        return perimetro;
    }


    public int getCatetoOposto() {
        return catetoOposto;
    }

    public int getCatetoAdjacente() {
        return catetoAdjacente;
    }

    public double getHipotenusa() {
        return hipotenusa;
    }

    public void setCatetoOposto(int catetoOposto) {
        this.catetoOposto = catetoOposto;
    }

    public void setCatetoAdjacente(int catetoAdjacente) {
        this.catetoAdjacente = catetoAdjacente;
    }

    public void setHipotenusa(double hipotenusa) {
        this.hipotenusa = hipotenusa;
    }
}
