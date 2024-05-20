package persona;

import armas.Arma;

public class Policia extends Persona {

    private int legajo;
    private Arma arma;

    public Policia(String nombre, String apellido, int legajo, Arma arma) {
        super(nombre, apellido);
        this.legajo = legajo;
        this.arma = arma;
    }

    public Arma getArma() {
        return arma;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    @Override
    public String toString() {
        return "Policia{" +
                "legajo=" + legajo +
                '}';
    }
}
