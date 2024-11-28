public class FormaGeometrica {

    private int catetoOposto;
    private int catetoAdjacente;
    private double hipotenusa;
    private double perimetro;
    private double areaDoTriangulo;

    public FormaGeometrica(int vCatetoOposto, int vCatetoAdjacente){
        this.catetoOposto = vCatetoOposto;
        this.catetoAdjacente = vCatetoAdjacente;
        calcularHipotenusa();
        calcularPerimetro();
        calcularAreaDoTriangulo();
    }

    public void calcularHipotenusa(){
        hipotenusa = Math.sqrt(Math.pow(catetoOposto,2)+Math.pow(catetoAdjacente,2));
    }

    public void calcularPerimetro(){
        perimetro = hipotenusa + catetoOposto + catetoAdjacente;
    }

    public void informarTipoDeTriangulo(){
        if(catetoOposto==catetoAdjacente){
            System.out.println("O triangulo é isósceles");
        }else System.out.println("O triangulo não é isósceles");
    }

    public void calcularAreaDoTriangulo(){
        areaDoTriangulo = (catetoOposto+catetoAdjacente)/2;
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

    public double getPerimetro() {
        return perimetro;
    }

    public double getAreaDoTriangulo() {
        return areaDoTriangulo;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    public void setAreaDoTriangulo(double areaDoTriangulo) {
        this.areaDoTriangulo = areaDoTriangulo;
    }
}
