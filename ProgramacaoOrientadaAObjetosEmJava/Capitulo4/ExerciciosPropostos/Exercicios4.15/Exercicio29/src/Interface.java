import javax.swing.*;

public class Interface {
    protected double altura, raio;

    public Interface(){
        altura = 0;
        raio = 0;
    }

    public double getAltura() {
        return altura;
    }

    public double getRaio() {
        return raio;
    }

    public double setAltura() {
        String vAltura;
        vAltura = JOptionPane.showInputDialog(null,"Entre com o valor da altura: ","Altura",JOptionPane.INFORMATION_MESSAGE);
        this.altura = Double.parseDouble(vAltura);
        return altura;
    }

    public double setRaio() {
        String vRaio;
        vRaio = JOptionPane.showInputDialog(null,"Entre com o valor do Raio:","Raio",JOptionPane.INFORMATION_MESSAGE);
        this.raio = Double.parseDouble(vRaio);
        return raio;
    }

    public void informarVolume(double vVolume){

        JOptionPane.showMessageDialog(null,"Volume do cilindro : "+vVolume,"Volume",JOptionPane.INFORMATION_MESSAGE);

    }
}
