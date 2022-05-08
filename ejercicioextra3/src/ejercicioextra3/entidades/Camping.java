
package ejercicioextra3.entidades;


public class Camping extends ExtraHotelero {

    private int capacidadMaximaDeCarpas;
    private int cantidadDeBaniosDisponibles;
    private boolean tieneRestaurante;

    public Camping() {
    }

    public Camping(int capacidadMaximaDeCarpas, int cantidadDeBaniosDisponibles, boolean tieneRestaurante, ExtraHotelero extraHotelero) {
        super(extraHotelero);
        this.capacidadMaximaDeCarpas = capacidadMaximaDeCarpas;
        this.cantidadDeBaniosDisponibles = cantidadDeBaniosDisponibles;
        this.tieneRestaurante = tieneRestaurante;
    }
    
    public Camping(int capacidadMaximaDeCarpas, int cantidadDeBaniosDisponibles, boolean tieneRestaurante, boolean esPrivado, double cantidadDeMetrosCuadrados, String nombre, String direccion, String localidad, String nombreGerente) {
        super(esPrivado, cantidadDeMetrosCuadrados, nombre, direccion, localidad, nombreGerente);
        this.capacidadMaximaDeCarpas = capacidadMaximaDeCarpas;
        this.cantidadDeBaniosDisponibles = cantidadDeBaniosDisponibles;
        this.tieneRestaurante = tieneRestaurante;
    }

    public int getCapacidadMaximaDeCarpas() {
        return capacidadMaximaDeCarpas;
    }

    public void setCapacidadMaximaDeCarpas(int capacidadMaximaDeCarpas) {
        this.capacidadMaximaDeCarpas = capacidadMaximaDeCarpas;
    }

    public int getCantidadDeBaniosDisponibles() {
        return cantidadDeBaniosDisponibles;
    }

    public void setCantidadDeBaniosDisponibles(int cantidadDeBaniosDisponibles) {
        this.cantidadDeBaniosDisponibles = cantidadDeBaniosDisponibles;
    }

    public boolean isTieneRestaurante() {
        return tieneRestaurante;
    }

    public void setTieneRestaurante(boolean tieneRestaurante) {
        this.tieneRestaurante = tieneRestaurante;
    }

    @Override
    public String toString() {
        return "Camping{" + "capacidadMaximaDeCarpas=" + capacidadMaximaDeCarpas + ", cantidadDeBaniosDisponibles=" + cantidadDeBaniosDisponibles + ", tieneRestaurante=" + tieneRestaurante + super.toString() + '}';
    }
    
}
