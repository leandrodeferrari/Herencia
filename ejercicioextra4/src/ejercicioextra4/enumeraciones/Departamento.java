package ejercicioextra4.enumeraciones;

public enum Departamento {
    EXACTAS("Exactas"), DERECHO("Derecho"), MEDICINA("Medicína"), ECONOMICAS("Económicas");
    
    private final String nombreDepartamento;

    private Departamento(String nombreDepartamento) {
        this.nombreDepartamento = nombreDepartamento;
    }

    public String getNombreDepartamento() {
        return nombreDepartamento;
    }
    
}
