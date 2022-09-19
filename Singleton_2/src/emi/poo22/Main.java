package emi.poo22;

public class Main {
    public static void main(String[] args) {

        ConexionBDSingleton con = null;

        for(int i = 0; i < 10; i++) {
            con = ConexionBDSingleton.getInstance();
            System.out.println("con =" + con);
        }
        ConexionBDSingleton con2 = ConexionBDSingleton.getInstance();
        ConexionBDSingleton con3 = ConexionBDSingleton.getInstance();

        //comparamos si se trata de la misma instancia
        boolean b1 = (con == con2);
        System.out.println("b1 = " + b1);
    }
}