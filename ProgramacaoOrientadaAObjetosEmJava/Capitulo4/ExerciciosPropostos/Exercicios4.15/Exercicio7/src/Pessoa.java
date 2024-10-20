import java.time.LocalDate;

public class Pessoa {

    protected String nome;
    protected int idade;
    protected char sexo;

    public Pessoa(){
    }

    public Pessoa(String vNome, char vSexo, int vIdade){
        this.idade = vIdade;
        this.sexo = vSexo;
        this.nome = vNome;
    }

    private String informarNome(){
        return nome;
    }

    public void receberValorNome(String vNome){
        this.nome = vNome;
    }

    public int informarIdade(){
        return idade;
    }

    public void receberValorIdade(int vIdade){
        this.idade = vIdade;
    }

    public char informaSexo(){
        return sexo;
    }

    public void receberValorSexo(String vSexo){
        this.nome = vSexo;
    }

    public void facaAniversario(){
        idade++;
    }

    public int informaAnoDeNascimento(int idade){
        LocalDate dataAtual = LocalDate.now();

        return dataAtual.getYear()-idade;
    }

}
