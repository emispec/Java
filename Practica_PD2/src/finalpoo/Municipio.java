package finalpoo;

import java.util.ArrayList;

public class Municipio {
    private ArrayList<Propiedad> propiedades;


    public Municipio() {
        this.propiedades = new ArrayList<>();
    }


    public ArrayList<Propiedad> getPropiedades() {
        return propiedades;
    }

    public void setPropiedades(ArrayList<Propiedad> propiedades) {
        this.propiedades = propiedades;
    }


    public void mostrarPropiedad(){
        for(Propiedad p : this.propiedades){
            System.out.println("Calle: " + p.getCalle());
            System.out.println("Numero de calle: " + p.getNumeroDePuerta());
            System.out.println("Impuesto a pagar: " + p.calcularImpuesto());
        }

    }

    public void agregarPropiedades(Propiedad p){
        this.propiedades.add(p);
    }
}

