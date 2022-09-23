package finalpoo;

import java.util.ArrayList;

public class BarrioCerrado extends Propiedad{
    private Integer factorMultiplicador;
    private ArrayList<Casa> casas;


    public BarrioCerrado(String calle, String numeroDePuerta, Integer factorMultiplicador) {
        super(calle, numeroDePuerta);
        this.factorMultiplicador = factorMultiplicador;
        this.casas = new ArrayList<>();
    }


    @Override
    public Double calcularImpuesto() {
        Double acc = 0.0;
        for(Casa c : this.casas){
            acc += c.calcularImpuesto() * this.factorMultiplicador;
        }
        return acc;
    }

    public void agregarCasa(Casa c){
        this.casas.add(c);
    }

}
