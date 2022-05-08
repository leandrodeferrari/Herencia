
package ejercicioextra3.entidades;


public class Residencia extends ExtraHotelero {

    private int cantidadDeHabitaciones;
    private boolean tieneDescuentoGremial;
    private boolean tieneCampoDeportivo;

    public Residencia() {
    }

    public Residencia(int cantidadDeHabitaciones, boolean tieneDescuentoGremial, boolean tieneCampoDeportivo, ExtraHotelero extraHotelero) {
        super(extraHotelero);
        this.cantidadDeHabitaciones = cantidadDeHabitaciones;
        this.tieneDescuentoGremial = tieneDescuentoGremial;
        this.tieneCampoDeportivo = tieneCampoDeportivo;
    }
    
    public Residencia(int cantidadDeHabitaciones, boolean tieneDescuentoGremial, boolean tieneCampoDeportivo, boolean esPrivado, double cantidadDeMetrosCuadrados, String nombre, String direccion, String localidad, String nombreGerente) {
        super(esPrivado, cantidadDeMetrosCuadrados, nombre, direccion, localidad, nombreGerente);
        this.cantidadDeHabitaciones = cantidadDeHabitaciones;
        this.tieneDescuentoGremial = tieneDescuentoGremial;
        this.tieneCampoDeportivo = tieneCampoDeportivo;
    }

    public int getCantidadDeHabitaciones() {
        return cantidadDeHabitaciones;
    }

    public void setCantidadDeHabitaciones(int cantidadDeHabitaciones) {
        this.cantidadDeHabitaciones = cantidadDeHabitaciones;
    }

    public boolean isTieneDescuentoGremial() {
        return tieneDescuentoGremial;
    }

    public void setTieneDescuentoGremial(boolean tieneDescuentoGremial) {
        this.tieneDescuentoGremial = tieneDescuentoGremial;
    }

    public boolean isTieneCampoDeportivo() {
        return tieneCampoDeportivo;
    }

    public void setTieneCampoDeportivo(boolean tieneCampoDeportivo) {
        this.tieneCampoDeportivo = tieneCampoDeportivo;
    }

    @Override
    public String toString() {
        return "Residencia{" + "cantidadDeHabitaciones=" + cantidadDeHabitaciones + ", tieneDescuentoGremial=" + tieneDescuentoGremial + ", tieneCampoDeportivo=" + tieneCampoDeportivo + super.toString() + '}';
    }
    
}
