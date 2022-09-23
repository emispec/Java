package finalpoo;

public class PropiedadFactory {
    private static PropiedadFactory pf = new PropiedadFactory();

    private PropiedadFactory(){
    }

    public static PropiedadFactory getInstance(){
        return pf;
    }

    public static Propiedad construir(String tipo){
        switch (tipo){
            case "casa":
                Casa casa1 = new Casa("Av. San Martin", "130", 500.0);
                return casa1;
            case "casa2":
                Casa casa2 = new Casa("Mitre", "223", 700.0);
                return casa2;
            case "barrio cerrado":
                BarrioCerrado barrio1 = new BarrioCerrado("Gutierrez", "330", 2);
                Casa c1 = new Casa("Av. San Martin", "130", 500.0);
                Casa c2 = new Casa("Mitre", "223", 700.0);
                barrio1.agregarCasa(c1);
                barrio1.agregarCasa(c2);
                return barrio1;
            default:
                System.out.println("Tipo ingresado invalido");
                return null;
        }
    }
}