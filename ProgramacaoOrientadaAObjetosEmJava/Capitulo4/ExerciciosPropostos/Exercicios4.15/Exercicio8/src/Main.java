public class Main {
    public static void main(String[] args) {
        Pessoa umaPessoa = new Pessoa("Wallace",'M',30);
        Pessoa outraPessoa = umaPessoa.clone();

        System.out.println("Nome original: "+umaPessoa.informarNome());
        umaPessoa.receberValorNome("Petrik");
        System.out.println("Pessoa com nome redefinido: "+umaPessoa.informarNome());
        System.out.println("Nome clone: " +outraPessoa.informarNome());
    }
}