public class Contador {
    private int ocorrencias;

    public  Contador(){
        ocorrencias = 0;
    }

    public void contar() {
        this.ocorrencias++;
    }
    public void contar(boolean valor){
        if(valor){
            this.ocorrencias++;
        }
    }

    public  int getOcorrencias(){
        return this.ocorrencias;
    }

    public void resetar(){
        this.ocorrencias = 0;
    }

    public static void main(String[] args) {
        Contador contador = new Contador();
        contador.contar(true);
        contador.contar(false);
        System.out.println("Ocorrências registradas: "+contador.getOcorrencias());
    }

}
