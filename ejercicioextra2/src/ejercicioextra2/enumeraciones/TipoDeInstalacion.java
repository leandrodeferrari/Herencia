package ejercicioextra2.enumeraciones;

public enum TipoDeInstalacion {
    TECHADO("Techado"), ABIERTO("Abierto");
    
    private String tipo;

    private TipoDeInstalacion(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
}
