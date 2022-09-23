package finalpoo;

public abstract class Propiedad {
    private String calle;
    private String numeroDePuerta;


    public Propiedad(String calle, String numeroDePuerta) {
        this.calle = calle;
        this.numeroDePuerta = numeroDePuerta;
    }

    public String getCalle() {
        return calle;
    }

    public String getNumeroDePuerta() {
        return numeroDePuerta;
    }

    public abstract Double calcularImpuesto();

}