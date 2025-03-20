public class Pessoa {
    protected String nome;
    protected int idade;
    protected char sexo;

    public Pessoa(){
    }
    public Pessoa(String vNome, char vSexo, int vIdade){
        this.nome = vNome;
        this.sexo = vSexo;
        this.idade = vIdade;
    }

    public String getNome() {
        return nome;
    }

    public char getSexo() {
        return sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void facaAiniversario(){
        this.idade++;
    }

    public float pesoIdeal(float vAltura){
        float peso = 0;

        if(sexo=='m'||sexo=='M'){
            peso = 72.7f * vAltura - 58;
        }else if (sexo=='f'||sexo=='F'){
            peso = 62.1f * vAltura - 44.7f;
        }
        return peso;
    }

}
