public class Main {
    public static void main(String[] args) {

        Interface umaInterface = new Interface();
        Pessoa umaPessoa;

        double soma = 0,percentualH = 0;
        int cont = 0;
        int contM = 0;
        char resp;

        do{

            umaPessoa = umaInterface.peguePessoa();
            soma += umaPessoa.getIdade();
            if(umaPessoa.sexo=='m'||umaPessoa.sexo == 'M'){
                if(umaPessoa.idade >= 70){
                    contM++;
                }
            }
            cont++;
            resp = umaInterface.temMais();
        }while (resp == 's' || resp == 'S');

        percentualH = ((double) contM * 100) / cont;

        double meida = soma/cont;
        umaInterface.mostrarMedia(meida);
        System.out.println("Percentual de homens com mais de 70: "+percentualH);
    }
}