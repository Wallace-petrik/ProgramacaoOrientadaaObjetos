public class Disciplina {

    private String nomeDoAluno;
    private double media;
    private double n1, n2, n3;

    private static final int PESO_N1 = 1;
    private static final int PESO_N2 = 2;
    private static final int PESO_N3 = 3;
    private static final int SOMA_PESOS = PESO_N1 + PESO_N2 + PESO_N3;

    public Disciplina() {
    }

    public Disciplina(String nome, Double nota1, Double nota2, Double nota3) {
        this.nomeDoAluno = nome;
        this.n1 = (nota1 >= 0 && nota1 <= 10) ? nota1 : 0;
        this.n2 = (nota2 >= 0 && nota2 <= 10) ? nota2 : 0;
        this.n3 = (nota3 >= 0 && nota3 <= 10) ? nota3 : 0;
    }

    public void calcularMedia() {
        media = (n1 * PESO_N1 + n2 * PESO_N2 + n3 * PESO_N3) / SOMA_PESOS;
    }

    public String getNomeDoAluno() {
        return nomeDoAluno;
    }

    public void setNomeDoAluno(String nomeDoAluno) {
        this.nomeDoAluno = nomeDoAluno;
    }

    public double getMedia() {
        return media;
    }
}

