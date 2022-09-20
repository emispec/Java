package emi.poo22;

public class OfertaAcademicaFactory {
    private static OfertaAcademicaFactory oa = new OfertaAcademicaFactory();

    private OfertaAcademicaFactory(){
    }

    public static OfertaAcademicaFactory getInstance(){
        return oa;
    }

    public OfertaAcademica construir(String s){
        switch (s){
            case "frontend":
                Curso fe = new Curso("frontend",16,2,1000.0);
                return fe;
            case "backend":
                Curso be = new Curso("backend", 20, 2, 900.0);
                return be;
            case "fullstack":
                Programa fs = new Programa("fullstack",0.2);
                Curso fe1 = new Curso("frontend",16,2,1000.0);
                Curso be1 = new Curso("backend", 20, 2, 900.0);
                fs.agregarCurso(fe1);
                fs.agregarCurso(be1);
                return fs;
            default:
                System.out.println("Inexistente");
                return null;
        }

    }
}
