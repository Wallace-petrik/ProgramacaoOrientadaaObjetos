import javax.swing.*;

public class Interface {

    public Interface(){

    }
    public double pegueValorLido(String texto){
        String valorLido;
        valorLido = JOptionPane.showInputDialog(texto);
        double valor = Double.parseDouble(valorLido);
        return valor;
    }
    public void mostarValores(String texto){
        JOptionPane.showMessageDialog(null,texto,"Resultados",JOptionPane.INFORMATION_MESSAGE);
    }
}
