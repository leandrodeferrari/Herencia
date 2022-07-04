package ejercicioextra3.entidades;

public class ExtraHotelero extends Alojamiento {

    protected boolean esPrivado;
    protected double cantidadDeMetrosCuadrados;

    public ExtraHotelero() {
    }
    
    public ExtraHotelero(boolean esPrivado, double cantidadDeMetrosCuadrados, Alojamiento alojamiento) {
        super(alojamiento);
        this.esPrivado = esPrivado;
        this.cantidadDeMetrosCuadrados = cantidadDeMetrosCuadrados;
    }
    
    public ExtraHotelero(ExtraHotelero extraHotelero){
        this.nombre = extraHotelero.getNombre();
        this.direccion = extraHotelero.getDireccion();
        this.localidad = extraHotelero.getLocalidad();
        this.nombreGerente = extraHotelero.getNombreGerente();
        this.esPrivado = extraHotelero.isEsPrivado();
        this.cantidadDeMetrosCuadrados = extraHotelero.getCantidadDeMetrosCuadrados();
    }
    
    public ExtraHotelero(boolean esPrivado, double cantidadDeMetrosCuadrados, String nombre, String direccion, String localidad, String nombreGerente) {
        super(nombre, direccion, localidad, nombreGerente);
        this.esPrivado = esPrivado;
        this.cantidadDeMetrosCuadrados = cantidadDeMetrosCuadrados;
    }

    public boolean isEsPrivado() {
        return esPrivado;
    }

    public void setEsPrivado(boolean esPrivado) {
        this.esPrivado = esPrivado;
    }

    public double getCantidadDeMetrosCuadrados() {
        return cantidadDeMetrosCuadrados;
    }

    public void setCantidadDeMetrosCuadrados(double cantidadDeMetrosCuadrados) {
        this.cantidadDeMetrosCuadrados = cantidadDeMetrosCuadrados;
    }

    @Override
    public String toString() {
        return ", esPrivado=" + esPrivado + ", cantidadDeMetrosCuadrados=" + cantidadDeMetrosCuadrados + super.toString();
    }
    
}
