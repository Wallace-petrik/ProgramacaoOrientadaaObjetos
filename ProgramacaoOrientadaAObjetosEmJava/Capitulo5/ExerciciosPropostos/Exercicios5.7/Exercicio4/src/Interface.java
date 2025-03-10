import javax.swing.*;

public class Interface {

    public Pessoa peguePessoa (){
        String nome = JOptionPane.showInputDialog(null,"Digite o nome","nome",JOptionPane.INFORMATION_MESSAGE);
        String idade = JOptionPane.showInputDialog(null,"Digite a idade","Idade",JOptionPane.INFORMATION_MESSAGE);
        String sexo = JOptionPane.showInputDialog(null,"Digite o sexo","Sexo",JOptionPane.INFORMATION_MESSAGE);

        int vIdade = Integer.parseInt(idade);
        char vSexo = sexo.charAt(0);

        return new Pessoa();
    }


    public void mostrarMedia(double media ){
        System.out.println("Idade média das pessoas: "+media);
    }

}
