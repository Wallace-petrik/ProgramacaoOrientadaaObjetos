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
}
