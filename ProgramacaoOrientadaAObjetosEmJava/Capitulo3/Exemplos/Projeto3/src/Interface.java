import javax.swing.*;

public class Interface {
   public Interface(){

   }
   public double pegueValorRaio(){

       String valorLido;
       double valor;

       valorLido = JOptionPane.showInputDialog("Digite o raio");
       valor = Double.parseDouble(valorLido);
       return valor;
   }

   public void mostrarArea(double area){
       System.out.println("Valor da area: " + String.format("%.2f",area));
   }
}
