package armas;

public class ArmaCorta extends Arma {

    private boolean esAutomatica;

    public ArmaCorta(int cantMuniciones, double alcance, String marca, int calibre, String estadoArma, boolean esAutomatica) {
        super(cantMuniciones, alcance, marca, calibre, estadoArma);
        this.esAutomatica = esAutomatica;
    }

    public boolean isEsAutomatica() {
        return esAutomatica;
    }

    public void setEsAutomatica(boolean esAutomatica) {
        this.esAutomatica = esAutomatica;
    }

    public boolean efectividadMts() {
        return this.getAlcance() > 200;
    }
}
