public class Main {
    public static void main(String[] args) {
        Disciplina matematica = new Disciplina("Wallace",7d,8d,9d);
        matematica.calcularMedia();
        System.out.printf("A média do aluno %s é igual a %.2f",matematica.getNomeDoAluno(),matematica.getMedia());
    }
}
