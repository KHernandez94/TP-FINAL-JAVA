package armas;

public class ArmaLarga extends Arma implements Comparable<ArmaLarga>{

    private boolean tieneSello;
    private String justifUso;
    private int nivelArma;

    public ArmaLarga(int cantMuniciones, double alcance, String marca, int calibre, String estadoArma, boolean tieneSello, String justifUso, int nivelArma) {
        super(cantMuniciones, alcance, marca, calibre, estadoArma);
        this.tieneSello = tieneSello;
        this.justifUso = justifUso;
        this.nivelArma = nivelArma;
    }

    public boolean isTieneSello() {
        return tieneSello;
    }

    public void setTieneSello(boolean tieneSello) {
        this.tieneSello = tieneSello;
    }

    public String getJustifUso() {
        return justifUso;
    }

    public void setJustifUso(String justifUso) {
        this.justifUso = justifUso;
    }

    public int getNivelArma() {
        return nivelArma;
    }

    public void setNivelArma(int nivelArma) {
        this.nivelArma = nivelArma;
    }

    @Override
    public String toString() {
        return "ArmaLarga{" +
                "tieneSello=" + tieneSello +
                ", justifUso='" + justifUso + '\'' +
                ", nivelArma=" + nivelArma +
                '}';
    }

    @Override
    public int compareTo(ArmaLarga armaLarga) {
        return Integer.compare(this.getNivelArma(), armaLarga.getNivelArma());
    }
}
