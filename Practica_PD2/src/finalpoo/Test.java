package finalpoo;

public class Test {
    public static void main(String[] args) {

        PropiedadFactory pf = PropiedadFactory.getInstance();

        Municipio mu = new Municipio();

        Propiedad casa1 = pf.construir("casa");
        Propiedad casa2 = pf.construir("casa2");
        Propiedad barrio1 = pf.construir("barrio cerrado");

        mu.agregarPropiedades(casa1);
        mu.agregarPropiedades(casa2);
        mu.agregarPropiedades(barrio1);

        mu.mostrarPropiedad();

    }
}