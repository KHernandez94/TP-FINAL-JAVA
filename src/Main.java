import armas.*;

public class Main {

    public static void main(String[] args) {

        ArmaCorta arma1 = new ArmaCorta(2,205,"test 1", 33, EstadoArma.NUEVA.getEstadoArma(), true);
        ArmaCorta arma2 = new ArmaCorta(7,190,"patito", 47, EstadoArma.USO.getEstadoArma(), false);
        ArmaLarga armaLarga3 = new ArmaLarga(8,1,"SER2", 39,EstadoArma.USO.getEstadoArma(), true,"SIN ANTENCEDENTES", NivelArma.NIVEL_CUATRO.getNivelArma());
        ArmaLarga armaLarga4 = new ArmaLarga(8,1,"SER2", 39,EstadoArma.USO.getEstadoArma(), true,"SIN ANTENCEDENTES", NivelArma.NIVEL_DOS.getNivelArma());


        System.out.println("El arma1 está en condiciones de uso?"+ arma1.enCondicion());
        System.out.println("El arma2 está en condiciones de uso?"+ arma2.enCondicion());
        System.out.println("El arma larga 3 está en condiciones de uso?"+ armaLarga3.enCondicion());
        System.out.println("El arma larga 3 es mayor a la 4?: "+ ((armaLarga3.compareTo(armaLarga4) > 0) ? true : false));
        System.out.println("El armalarga 4 está en condiciones de uso?"+ armaLarga4.enCondicion());
        System.out.println("Arma 2 puede disparar mas de 200mts? " + arma2.efectividadMts());


    }

}
