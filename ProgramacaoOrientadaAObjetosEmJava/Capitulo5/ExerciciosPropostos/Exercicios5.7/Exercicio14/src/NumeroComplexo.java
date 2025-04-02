public class NumeroComplexo {

    /*
    Um número complexo é dado por Z = a+ bi e é identificado com o
    ponto do plano que tem coordenadas (a,b). O número complexo tem
    uma  parte real a e uma parte imaginária b  em que a parte imaginária
    corresponde à raiz de um número negativo.. Se Z = a temos um
    número real e se Z = bi temos um número imaginário.
    */

    private double parteReal;
    private double parteImaginaria;

    public double getParteImaginaria() {
        return parteImaginaria;
    }

    public double getParteReal() {
        return parteReal;
    }

    public void setParteImaginaria(double parteImaginaria) {
        this.parteImaginaria = parteImaginaria;
    }

    public void setParteReal(double parteReal) {
        this.parteReal = parteReal;
    }
}
