package emi.poo22;

public interface ArticuloState {

    void valorPresupuesto(Double presupuesto);
    void sumarRepuesto(Double costoAdicional);
    void cambiarDireccion(String direccion);
    void pasarSigPaso();

}
