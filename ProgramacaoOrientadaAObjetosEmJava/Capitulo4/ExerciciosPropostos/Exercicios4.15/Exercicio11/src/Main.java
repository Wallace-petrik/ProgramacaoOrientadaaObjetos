public class Main {
    public static void main(String[] args) {
        Calcular calulo = new Calcular(0,1,2,3);

        calulo.x =  ((calulo.calcularSomaDeYeZDivididoPorY()+calulo.calcularRaizQuadradaDaDivisaoDoNumeroDoisPorZ())/calulo.triplicaValorDeA());

        System.out.printf("Valor de X: %.2f",calulo.x);
    }
}