
package ejercicioextra3.entidades;

import ejercicioextra3.enumeraciones.Gimnasio;


public class Hotel5Estrellas extends Hotel4Estrellas {

    private int cantidadDeSalonesDeConferencia;
    private int cantidadDeSuites;
    private int cantidadDeLimosinas;

    public Hotel5Estrellas() {
    }

    public Hotel5Estrellas(int cantidadDeSalonesDeConferencia, int cantidadDeSuites, int cantidadDeLimosinas, Hotel4Estrellas hotel4Estrellas) {
        super(hotel4Estrellas);
        this.cantidadDeSalonesDeConferencia = cantidadDeSalonesDeConferencia;
        this.cantidadDeSuites = cantidadDeSuites;
        this.cantidadDeLimosinas = cantidadDeLimosinas;
    }
    
    public Hotel5Estrellas(int cantidadDeSalonesDeConferencia, int cantidadDeSuites, int cantidadDeLimosinas, Gimnasio tipoDeGimnasio, String nombreDelRestaurante, int capacidadDelRestaurante, int cantidadDeHabitaciones, int numeroDeCamas, int cantidadDePisos, double precioDeHabitaciones, String nombre, String direccion, String localidad, String nombreGerente) {
        super(tipoDeGimnasio, nombreDelRestaurante, capacidadDelRestaurante, cantidadDeHabitaciones, numeroDeCamas, cantidadDePisos, precioDeHabitaciones, nombre, direccion, localidad, nombreGerente);
        this.cantidadDeSalonesDeConferencia = cantidadDeSalonesDeConferencia;
        this.cantidadDeSuites = cantidadDeSuites;
        this.cantidadDeLimosinas = cantidadDeLimosinas;
    }

    public int getCantidadDeSalonesDeConferencia() {
        return cantidadDeSalonesDeConferencia;
    }

    public void setCantidadDeSalonesDeConferencia(int cantidadDeSalonesDeConferencia) {
        this.cantidadDeSalonesDeConferencia = cantidadDeSalonesDeConferencia;
    }

    public int getCantidadDeSuites() {
        return cantidadDeSuites;
    }

    public void setCantidadDeSuites(int cantidadDeSuites) {
        this.cantidadDeSuites = cantidadDeSuites;
    }

    public int getCantidadDeLimosinas() {
        return cantidadDeLimosinas;
    }

    public void setCantidadDeLimosinas(int cantidadDeLimosinas) {
        this.cantidadDeLimosinas = cantidadDeLimosinas;
    }

    @Override
    public String toString() {
        return "Hotel5Estrellas{" + "cantidadDeSalonesDeConferencia=" + cantidadDeSalonesDeConferencia + ", cantidadDeSuites=" + cantidadDeSuites + ", cantidadDeLimosinas=" + cantidadDeLimosinas + ", tipoDeGimnasio=" + this.tipoDeGimnasio + ", nombreDelRestaurante=" + this.nombreDelRestaurante + ", capacidadDelRestaurante=" + this.capacidadDelRestaurante + ", cantidadDeHabitaciones=" + this.cantidadDeHabitaciones + ", numeroDeCamas=" + this.numeroDeCamas + ", cantidadDePisos=" + this.cantidadDePisos + ", precioDeHabitaciones=" + this.precioDeHabitaciones + ", nombre=" + this.nombre + ", direccion=" + this.direccion + ", localidad=" + this.localidad + ", nombreGerente=" + this.nombreGerente + '}';
    }
    
}
