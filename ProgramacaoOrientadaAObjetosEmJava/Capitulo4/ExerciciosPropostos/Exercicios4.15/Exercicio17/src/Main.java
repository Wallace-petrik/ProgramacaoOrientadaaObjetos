public class Main {
    public static void main(String[] args) {

        Circulo umCirculo = new Circulo();
        umCirculo.receberValorRaio(4);
        System.out.println("Valor da área do setor:"+umCirculo.calcularAreaDoSetorCircularS(40));
    }
}
