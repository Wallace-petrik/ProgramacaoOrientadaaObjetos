public class Main {
    public static void main(String[] args) {
        Ponto umPonto = new Ponto(5,8);
        System.out.printf("A distancia até a origin é igual %.2f ", umPonto.fornecaDistanciaAteOrigin());
        System.out.printf("\nInformar Abcissa: %.2f",umPonto.informarAbcissa());
        umPonto.deslocarHorizontamente(2);
        System.out.printf("\nInformar Abcissa: %.2f",umPonto.informarAbcissa());
        System.out.printf("A distancia até a origin é igual %.2f ", umPonto.fornecaDistanciaAteOrigin());
    }
}