public class Main {
    public static void main(String[] args) {
        Triangulo umTriangulo =  new Triangulo(2,3,5,1,7,9);
        umTriangulo.calcularDistanciaEntrePontos();
        System.out.printf("O perímetro do triangulo é = %.2f",umTriangulo.getPerimetroDoTriangulo());
    }
}
