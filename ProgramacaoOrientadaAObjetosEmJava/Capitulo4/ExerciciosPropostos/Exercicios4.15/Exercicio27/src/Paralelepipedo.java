public class Paralelepipedo {

    protected int arestaA;
    protected int arestaB;
    protected int arestaC;

    public Paralelepipedo(int vArestaA,int vArestaB, int vArestaC){
        this.arestaA = vArestaA;
        this.arestaB = vArestaB;
        this.arestaC = vArestaC;
    }

    public Paralelepipedo(){
        arestaA = 0;
        arestaB = 0;
        arestaC = 0;
    }

    public int getArestaA() {
        return arestaA;
    }
    public int getArestaB(){
        return arestaB;
    }
    public int getArestaC(){
        return arestaC;
    }
    public void setArestaA(int vArestaA) {
        this.arestaA = vArestaA;
    }
    public void setArestaB(int vArestaB) {
        this.arestaB = vArestaB;
    }
    public void setArestaC(int vArestaC) {
        this.arestaC = vArestaC;
    }

    public double informarValorAreaExterna(){
        double area = 0;
        area = 2*(arestaA*arestaB+arestaA*arestaC+arestaB*arestaC);
        return area;
    }

    public double informarValorDiagonal(){
        double diagonal = 0;
        diagonal = Math.sqrt(Math.pow(arestaA,2)+Math.pow(arestaB,2)+Math.pow(arestaC,2));
        return diagonal;
    }

    public double informarValorVolume(){
        double volume = 0;
        volume = arestaA*arestaB*arestaC;
        return volume;
    }
}
