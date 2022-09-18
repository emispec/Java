package emi.poo22;

public class Main {
    public static void main(String[] args) {

        Auto autoDeLio = new Auto(100);
        System.out.println("estado actual: " + autoDeLio.getEstadoActual());
        autoDeLio.acelerar();
        autoDeLio.contacto();
        autoDeLio.acelerar();


    }
}