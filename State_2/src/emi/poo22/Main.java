package emi.poo22;

public class Main {
    public static void main(String[] args) {

        //crear una factory de articulos: batidora, plancha, secarropas, refrigerador

        ArticuloFactory af = ArticuloFactory.getInstance();
        Articulo batidora = af.producir("batidora");

        batidora.valorPresupuesto(100.0);
        batidora.cambiarEstado();
        batidora.sumarRepuesto(20.0);
        batidora.cambiarEstado();
        batidora.cambiarDireccion("España 2020");
        batidora.cambiarEstado();

    }
}