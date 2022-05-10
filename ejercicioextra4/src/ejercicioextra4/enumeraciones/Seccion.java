package ejercicioextra4.enumeraciones;

public enum Seccion {
    BIBLIOTECA("Biblioteca"), DECANATO("Decanato"), SECRETARIA("Secretaría"), 
    PATIO("Patio"), COMEDOR("Comedor");
    
    private final String nombreSeccion;

    private Seccion(String nombreSeccion) {
        this.nombreSeccion = nombreSeccion;
    }

    public String getNombreSeccion() {
        return nombreSeccion;
    }
    
}
