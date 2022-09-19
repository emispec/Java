package emi.poo22;

public class ConexionBDSingleton {

    private static ConexionBDSingleton instancia;

    private ConexionBDSingleton() {

    }

    public static ConexionBDSingleton getInstance() {
        // lo mismo que hacer un check null: instancia == null
        if ( !(instancia instanceof ConexionBDSingleton)) {
            instancia = new ConexionBDSingleton();
        }
        return instancia;
    }

}
