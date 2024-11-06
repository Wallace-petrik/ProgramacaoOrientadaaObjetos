public class Main {
    public static void main(String[] args) {

        Ponto pontoA = new Ponto(3,4);
        pontoA.reposicionarPonto(90);
        System.out.format(" X = %f\n Y = %f",pontoA.x,pontoA.y);

    }
}