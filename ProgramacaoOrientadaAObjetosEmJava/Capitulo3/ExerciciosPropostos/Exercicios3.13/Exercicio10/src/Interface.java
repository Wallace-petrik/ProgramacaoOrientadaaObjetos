import javax.swing.*;

public class Interface {
    public Interface (){

    }
    public double pegueValor(){
        String valorLido;
        double valor;

        valorLido = JOptionPane.showInputDialog("Digite o raio: ");
        valor = Double.parseDouble(valorLido);
        return valor;
    }
    public void mostarPerimetro(Double perimetro){
        JOptionPane. showMessageDialog(null,"Perímetro = "+perimetro);
    }
}
