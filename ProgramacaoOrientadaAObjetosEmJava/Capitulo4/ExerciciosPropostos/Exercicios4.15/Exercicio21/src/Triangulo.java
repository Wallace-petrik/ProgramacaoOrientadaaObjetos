public class Triangulo {

    private int pontoAx;
    private int pontoAy;
    private int pontoBx;
    private int pontoBy;
    private int pontoCx;
    private int pontoCy;

    private double distanciaEntreAB;
    private double distanciaEntreBC;
    private double distanciaEntreCA;

    private double perimetroDoTriangulo;

    public Triangulo() {
    }

    public Triangulo(int pontoAx, int pontoAy, int pontoBx, int pontoBy, int pontoCx, int pontoCy) {
        this.pontoAx = pontoAx;
        this.pontoAy = pontoAy;
        this.pontoBx = pontoBx;
        this.pontoBy = pontoBy;
        this.pontoCx = pontoCx;
        this.pontoCy = pontoCy;
    }

    public int getPontoAx() { return pontoAx; }
    public int getPontoAy() { return pontoAy; }
    public int getPontoBx() { return pontoBx; }
    public int getPontoBy() { return pontoBy; }
    public int getPontoCx() { return pontoCx; }
    public int getPontoCy() { return pontoCy; }

    public void setPontoAx(int pontoAx) { this.pontoAx = pontoAx; }
    public void setPontoAy(int pontoAy) { this.pontoAy = pontoAy; }
    public void setPontoBx(int pontoBx) { this.pontoBx = pontoBx; }
    public void setPontoBy(int pontoBy) { this.pontoBy = pontoBy; }
    public void setPontoCx(int pontoCx) { this.pontoCx = pontoCx; }
    public void setPontoCy(int pontoCy) { this.pontoCy = pontoCy; }

    public void calcularDistanciaEntrePontos() {
        distanciaEntreAB = Math.sqrt(Math.pow((pontoBx - pontoAx), 2) + Math.pow((pontoBy - pontoAy), 2));
        distanciaEntreBC = Math.sqrt(Math.pow((pontoCx - pontoBx), 2) + Math.pow((pontoCy - pontoBy), 2));
        distanciaEntreCA = Math.sqrt(Math.pow((pontoAx - pontoCx), 2) + Math.pow((pontoAy - pontoCy), 2));
        calcularPerimetroDoTriangulo();
    }

    private void calcularPerimetroDoTriangulo() {
        perimetroDoTriangulo = distanciaEntreAB + distanciaEntreBC + distanciaEntreCA;
    }

    public double getPerimetroDoTriangulo() {
        return perimetroDoTriangulo;
    }
}
