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

    public float pesoIdeal(float vAltura, char sexo) {
        if (vAltura <= 0) {
            throw new IllegalArgumentException("Altura deve ser maior que zero.");
        }

        float peso = 0;

        char sexoLower = Character.toLowerCase(sexo);

        if (sexoLower == 'm') {
            peso = 72.7f * vAltura - 58;
        } else if (sexoLower == 'f') {
            peso = 62.1f * vAltura - 44.7f;
        } else {
            throw new IllegalArgumentException("Sexo inválido. Use 'm' para masculino ou 'f' para feminino.");
        }

        return peso;
    }


}
