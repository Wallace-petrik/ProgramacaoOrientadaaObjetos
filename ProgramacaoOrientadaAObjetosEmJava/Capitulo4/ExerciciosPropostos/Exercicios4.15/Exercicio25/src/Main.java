public class Main {
    public static void main(String[] args) {
        ProgressaoAritmetica  minhaProgrecao = new ProgressaoAritmetica(2,5,3);
        System.out.println("Valor do soma: "+minhaProgrecao.calcularSomadosNPrimeirostermos());
        minhaProgrecao.calcularN_Termo(2);
        System.out.println("Valor do n-termo: "+minhaProgrecao.getN_esimoTermo());
    }
}