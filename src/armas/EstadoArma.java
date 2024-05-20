package armas;

public enum EstadoArma {
    NUEVA("NUEVA"),
    MANTENIMIENTO("EN MANTENIMIENTO"),
    USO("EN USO");

    private String estadoArma;

    private EstadoArma(String estadoArma) {
        this.estadoArma = estadoArma;
    }

    public String getEstadoArma() {
        return estadoArma;
    }
}
