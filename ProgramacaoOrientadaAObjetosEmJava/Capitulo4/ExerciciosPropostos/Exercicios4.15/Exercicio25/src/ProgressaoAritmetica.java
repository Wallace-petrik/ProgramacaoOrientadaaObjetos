public class ProgressaoAritmetica {
    
    private int primeiroTermo;
    private int n_esimoTermo;
    private int razao;
    private int posicaoDoUltimoTermo;

    public ProgressaoAritmetica(){
    }
    
    public ProgressaoAritmetica(int primeiroTermo, int posicaoDoUltimoTermo, int razao) {
        this.primeiroTermo = primeiroTermo;
        this.posicaoDoUltimoTermo = posicaoDoUltimoTermo;
        this.razao = razao;
    }

    private void calcularN_Termo(){
        n_esimoTermo = primeiroTermo + (posicaoDoUltimoTermo - 1) * razao;
    }

    public void calcularN_Termo(int posicaoTermo){
        n_esimoTermo = primeiroTermo + (posicaoTermo - 1) * razao;
    }

    public float calcularSomadosNPrimeirostermos(){
        calcularN_Termo();
        float soma;
        soma = (posicaoDoUltimoTermo/2.0f)*(primeiroTermo+n_esimoTermo);
        return soma;
    }
    
    public int getPrimeiroTermo() {
        return primeiroTermo;
    }

    public int getRazao() {
        return razao;
    }

    public int getPosicaoDoUltimoTermo() {
        return posicaoDoUltimoTermo;
    }

    public int getN_esimoTermo() {
        return n_esimoTermo;
    }

    public void setPrimeiroTermo(int primeiroTermo) {
        this.primeiroTermo = primeiroTermo;
    }

    public void setPosicaoDoUltimoTermo(int posicaoDoUltimoTermo) {
        this.posicaoDoUltimoTermo = posicaoDoUltimoTermo;
    }

    public void setRazao(int razao) {
        this.razao = razao;
    }

    public void setN_esimoTermo(int n_esimoTermo) {
        this.n_esimoTermo = n_esimoTermo;
    }
}
