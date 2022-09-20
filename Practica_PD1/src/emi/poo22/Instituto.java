package emi.poo22;

import java.util.ArrayList;

public class Instituto {
    //composite
    private ArrayList<OfertaAcademica> cursos;

    public Instituto() {
        this.cursos = new ArrayList<>();
    }

    public void generarInforme(){

        for(OfertaAcademica oa: this.cursos){

            System.out.println("Nombre: " + oa.getNombre());
            System.out.println("Costo: " + oa.obtenerCosto());
        }
    }
    public void agregarOfertasVigentes(OfertaAcademica oa){
        this.cursos.add(oa);
    }
}
