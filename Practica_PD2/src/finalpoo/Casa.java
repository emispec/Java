package finalpoo;

public class Casa extends Propiedad{
    private Double montoBaseImpuesto;


    public Casa(String calle, String numeroDePuerta, Double montoBaseImpuesto) {
        super(calle, numeroDePuerta);
        this.montoBaseImpuesto = montoBaseImpuesto;
    }


    @Override
    public Double calcularImpuesto() {
        Double acc = montoBaseImpuesto;
        if (super.getCalle().equals("Av. San Martin")) {
            acc = this.montoBaseImpuesto + (this.montoBaseImpuesto * 0.1);
        }
        return acc;

    }
}
