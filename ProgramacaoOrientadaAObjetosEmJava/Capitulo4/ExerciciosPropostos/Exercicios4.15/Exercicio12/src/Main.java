public class Main {
    public static void main(String[] args) {

        Ponto pontoA = new Ponto(11,2);
        Ponto pontoB = new Ponto();
        pontoB.redefina_se(13,3);
        System.out.println("Valor do coeficiente agular: "+pontoA.calcularCoeficienteAngular(pontoB));

    }
}