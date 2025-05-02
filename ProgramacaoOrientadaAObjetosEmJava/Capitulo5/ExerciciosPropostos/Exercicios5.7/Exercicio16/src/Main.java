public class Main {
    public static void main(String[] args) {
        Ponto umPonto = new Ponto(-1,-1);
        if(umPonto.quadrante() != 0){
            System.out.printf("O ponto está no %d° quadrante !!!",umPonto.quadrante());
        }else{
            System.out.println("O ponto está em cima dos eixos !!!");
        }
    }
}
