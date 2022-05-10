package ejercicioextra4.enumeraciones;

public enum EstadoCivil {
    
    CASADO("Casado/a"), SEPARADO("Separado/a"), VIUDO("Viudo/a"), SOLTERO("Soltero/a");
    
    private final String estado;

    private EstadoCivil(String estado) {
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }
    
}
