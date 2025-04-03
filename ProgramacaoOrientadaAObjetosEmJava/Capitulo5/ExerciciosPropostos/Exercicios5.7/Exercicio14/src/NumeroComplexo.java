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

    public NumeroComplexo(double parteReal, double parteImaginaria) {
        this.parteReal = parteReal;
        this.parteImaginaria = parteImaginaria;
    }

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

    public double calcularModulo(){
        return Math.sqrt(Math.pow(parteReal,2)+Math.pow(parteImaginaria,2));
    }

    public NumeroComplexo somaNumeroComplexo(NumeroComplexo outroNumero){
        double somaReal;
        double somaImaginario;

        somaReal = this.parteReal+outroNumero.getParteReal();
        somaImaginario = this.parteImaginaria+outroNumero.getParteImaginaria();

        return  new NumeroComplexo(somaReal,somaImaginario);

    }

}
