public class Pessoa {

    protected String nome;
    protected int idade;
    protected char sexo;

    public Pessoa(){
    }
    public Pessoa(String vMome,char vSexo,int idade){
        this.nome = vMome;
        this.sexo = vSexo;
        this.idade = idade;
    }

    public char getSexo() {
        return sexo;
    }

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    public void facaAniversario(){
         this.idade += 1;
    }

    public boolean verificarIdadesIguais(int vIdade){
        if (this.idade==vIdade){
            return true;
        }else{
            return false;
        }
    }
}
