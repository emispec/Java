package emi.poo22;// Patron composite: EJ Hamburgueseria
// producto solo y producto combo.

public class Main {
    public static void main(String[] args) {

        Combo c1 = new Combo("combo 1", 0.2);
        ProductoSimple hamburguesa = new ProductoSimple("Hamburguesa",100.0);
        ProductoSimple papas = new ProductoSimple("papas fritas",80.0);

        c1.agregarProducto(hamburguesa);
        c1.agregarProducto(papas);

        System.out.println("El valor de los productos por separados es: "+ (hamburguesa.obtenerPrecio() + papas.obtenerPrecio()));

        System.out.println("El valor de los productos en combo es: "+ c1.obtenerPrecio());

    }
}