
package ejercicioextra3.entidades;


public class Hotel extends Alojamiento {

    protected int cantidadDeHabitaciones;
    protected int numeroDeCamas;
    protected int cantidadDePisos;
    protected double precioDeHabitaciones;

    public Hotel() {
    }

    public Hotel(Hotel hotel) {
        this.nombre = hotel.getNombre();
        this.direccion = hotel.getDireccion();
        this.localidad = hotel.getLocalidad();
        this.nombreGerente = hotel.getNombreGerente();
        this.cantidadDeHabitaciones = hotel.getCantidadDeHabitaciones();
        this.numeroDeCamas = hotel.getNumeroDeCamas();
        this.cantidadDePisos = hotel.getCantidadDePisos();
        this.precioDeHabitaciones = hotel.getPrecioDeHabitaciones();
    }
    
    public Hotel(int cantidadDeHabitaciones, int numeroDeCamas, int cantidadDePisos, double precioDeHabitaciones, Alojamiento alojamiento) {
        super(alojamiento);
        this.cantidadDeHabitaciones = cantidadDeHabitaciones;
        this.numeroDeCamas = numeroDeCamas;
        this.cantidadDePisos = cantidadDePisos;
        this.precioDeHabitaciones = precioDeHabitaciones;
    }
    
    public Hotel(int cantidadDeHabitaciones, int numeroDeCamas, int cantidadDePisos, double precioDeHabitaciones, String nombre, String direccion, String localidad, String nombreGerente) {
        super(nombre, direccion, localidad, nombreGerente);
        this.cantidadDeHabitaciones = cantidadDeHabitaciones;
        this.numeroDeCamas = numeroDeCamas;
        this.cantidadDePisos = cantidadDePisos;
        this.precioDeHabitaciones = precioDeHabitaciones;
    }

    public int getCantidadDeHabitaciones() {
        return cantidadDeHabitaciones;
    }

    public void setCantidadDeHabitaciones(int cantidadDeHabitaciones) {
        this.cantidadDeHabitaciones = cantidadDeHabitaciones;
    }

    public int getNumeroDeCamas() {
        return numeroDeCamas;
    }

    public void setNumeroDeCamas(int numeroDeCamas) {
        this.numeroDeCamas = numeroDeCamas;
    }

    public int getCantidadDePisos() {
        return cantidadDePisos;
    }

    public void setCantidadDePisos(int cantidadDePisos) {
        this.cantidadDePisos = cantidadDePisos;
    }

    public double getPrecioDeHabitaciones() {
        return precioDeHabitaciones;
    }

    public void setPrecioDeHabitaciones(double precioDeHabitaciones) {
        this.precioDeHabitaciones = precioDeHabitaciones;
    }

    @Override
    public String toString() {
        return ", cantidadDeHabitaciones=" + cantidadDeHabitaciones + ", numeroDeCamas=" + numeroDeCamas + ", cantidadDePisos=" + cantidadDePisos + ", precioDeHabitaciones=" + precioDeHabitaciones +  super.toString();
    }
    
    
    
}
