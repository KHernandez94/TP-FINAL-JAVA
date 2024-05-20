package armas;

public enum NivelArma {
    NIVEL_UNO(1),
    NIVEL_DOS(2),
    NIVEL_TRES(3),
    NIVEL_CUATRO(4),
    NIVEL_CINCO(5);


    private int nivelArma;

    private NivelArma(int nivelArma) {
        this.nivelArma = nivelArma;
    }

    public int getNivelArma() {
        return nivelArma;
    }
}
