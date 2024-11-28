
public class Main {
    public static void main(String[] args) {
        FormaGeometrica trianguloRetangulo = new FormaGeometrica(4,4 );
        trianguloRetangulo.informarTipoDeTriangulo();
        System.out.println("Hipotenusa: "+trianguloRetangulo.getHipotenusa());
        System.out.println("Perímetro: "+trianguloRetangulo.getPerimetro());
        System.out.println("Área: "+trianguloRetangulo.getAreaDoTriangulo());
    }
}