import java.util.Scanner;

public class Main {

    char resp;

    public static void main(String[] args) {

    }

    Scanner teclado = new Scanner(System.in);

    public char temMais(){
       char vResp;

        do {
            System.out.println("Quer continuar S/sim e N/não: ");
            vResp = teclado.next().charAt(0);
            if(vResp=='S'||vResp=='s'||vResp=='n'||vResp=='N'){
                return vResp;
            }else{
                System.out.println("Opção invalida!!!");
            }
        }while (true);

    }

    public char getResp(){
        return resp;
    }
    public void setResp(char vResp){
        this.resp = vResp;
    }
}