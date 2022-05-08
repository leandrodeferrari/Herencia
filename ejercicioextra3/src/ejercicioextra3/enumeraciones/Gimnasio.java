package ejercicioextra3.enumeraciones;

public enum Gimnasio {

    A('A'), B('B');
    
    private final char tipo; 

    private Gimnasio(char tipo) {
        this.tipo = tipo;
    }

    public char getTipo() {
        return tipo;
    }
    
}
