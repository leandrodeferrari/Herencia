package ejercicioextra3.entidades;

import ejercicioextra3.enumeraciones.Gimnasio;

public class Hotel4Estrellas extends Hotel {

    protected Gimnasio tipoDeGimnasio;
    protected String nombreDelRestaurante;
    protected int capacidadDelRestaurante;

    public Hotel4Estrellas() {
    }

    public Hotel4Estrellas(Hotel4Estrellas hotel4Estrellas) {
        this.nombre = hotel4Estrellas.getNombre();
        this.direccion = hotel4Estrellas.getDireccion();
        this.localidad = hotel4Estrellas.getLocalidad();
        this.nombreGerente = hotel4Estrellas.getNombreGerente();
        this.cantidadDeHabitaciones = hotel4Estrellas.getCantidadDeHabitaciones();
        this.numeroDeCamas = hotel4Estrellas.getNumeroDeCamas();
        this.cantidadDePisos = hotel4Estrellas.getCantidadDePisos();
        this.precioDeHabitaciones = hotel4Estrellas.getPrecioDeHabitaciones();
        this.tipoDeGimnasio = hotel4Estrellas.getTipoDeGimnasio();
        this.nombreDelRestaurante = hotel4Estrellas.getNombreDelRestaurante();
        this.capacidadDelRestaurante = hotel4Estrellas.getCapacidadDelRestaurante();
    }
    
    public Hotel4Estrellas(Gimnasio tipoDeGimnasio, String nombreDelRestaurante, int capacidadDelRestaurante, Hotel hotel) {
        super(hotel);
        this.tipoDeGimnasio = tipoDeGimnasio;
        this.nombreDelRestaurante = nombreDelRestaurante;
        this.capacidadDelRestaurante = capacidadDelRestaurante;
    }
    
    public Hotel4Estrellas(Gimnasio tipoDeGimnasio, String nombreDelRestaurante, int capacidadDelRestaurante, int cantidadDeHabitaciones, int numeroDeCamas, int cantidadDePisos, double precioDeHabitaciones, String nombre, String direccion, String localidad, String nombreGerente) {
        super(cantidadDeHabitaciones, numeroDeCamas, cantidadDePisos, precioDeHabitaciones, nombre, direccion, localidad, nombreGerente);
        this.tipoDeGimnasio = tipoDeGimnasio;
        this.nombreDelRestaurante = nombreDelRestaurante;
        this.capacidadDelRestaurante = capacidadDelRestaurante;
    }

    public Gimnasio getTipoDeGimnasio() {
        return tipoDeGimnasio;
    }

    public void setTipoDeGimnasio(Gimnasio tipoDeGimnasio) {
        this.tipoDeGimnasio = tipoDeGimnasio;
    }

    public String getNombreDelRestaurante() {
        return nombreDelRestaurante;
    }

    public void setNombreDelRestaurante(String nombreDelRestaurante) {
        this.nombreDelRestaurante = nombreDelRestaurante;
    }

    public int getCapacidadDelRestaurante() {
        return capacidadDelRestaurante;
    }

    public void setCapacidadDelRestaurante(int capacidadDelRestaurante) {
        this.capacidadDelRestaurante = capacidadDelRestaurante;
    }

    @Override
    public String toString() {
        return "Hotel4Estrellas{" + "tipoDeGimnasio=" + tipoDeGimnasio + ", nombreDelRestaurante=" + nombreDelRestaurante + ", capacidadDelRestaurante=" + capacidadDelRestaurante + super.toString() + '}';
    }
    
}
