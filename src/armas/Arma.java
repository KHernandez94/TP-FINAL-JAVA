package armas;


public abstract class Arma {

    private int cantMuniciones;
    private double alcance;
    private String marca;
    private int calibre;
    private String estado;

    public Arma(int cantMuniciones, double alcance, String marca, int calibre, String estadoArma) {
        this.cantMuniciones = cantMuniciones;
        this.alcance = alcance;
        this.marca = marca;
        this.calibre = calibre;
        this.estado = estadoArma;
    }

    public int getCantMuniciones() {
        return cantMuniciones;
    }

    public void setCantMuniciones(int cantMuniciones) {
        this.cantMuniciones = cantMuniciones;
    }

    public double getAlcance() {
        return alcance;
    }

    public void setAlcance(double alcance) {
        this.alcance = alcance;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCalibre() {
        return calibre;
    }

    public void setCalibre(int calibre) {
        this.calibre = calibre;
    }

    public String getEstadoArma() {
        return estado;
    }

    public void setEstadoArma(String estadoArma) {
        this.estado = estadoArma;
    }

    public boolean enCondicion() {
        return this.estado.equals(EstadoArma.USO.getEstadoArma()) && this.calibre >= 9;
    }
}
