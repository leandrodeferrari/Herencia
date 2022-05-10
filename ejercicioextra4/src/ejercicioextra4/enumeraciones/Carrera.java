package ejercicioextra4.enumeraciones;

public enum Carrera {
    
    CIENCIASMATEMATICAS("Ciencias Matemáticas"), ABOGACIA("Abogacía"), 
    ENFERMERIA("Enfermería"), ADMINISTRACION("Administración"); 
    
    private final String nombreCarrera;

    private Carrera(String nombreCarrera) {
        this.nombreCarrera = nombreCarrera;
    }

    public String getNombreCarrera() {
        return nombreCarrera;
    }
    
}
