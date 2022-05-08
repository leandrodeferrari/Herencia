package ejercicioextra3.entidades;

public class Alojamiento {

    protected String nombre;
    protected String direccion;
    protected String localidad;
    protected String nombreGerente;

    public Alojamiento() {
    }

    public Alojamiento(Alojamiento alojamiento) {
        this.nombre = alojamiento.getNombre();
        this.direccion = alojamiento.getDireccion();
        this.localidad = alojamiento.getLocalidad();
        this.nombreGerente = alojamiento.getNombreGerente();
    }

    public Alojamiento(String nombre, String direccion, String localidad, String nombreGerente) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.localidad = localidad;
        this.nombreGerente = nombreGerente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getNombreGerente() {
        return nombreGerente;
    }

    public void setNombreGerente(String nombreGerente) {
        this.nombreGerente = nombreGerente;
    }

    @Override
    public String toString() {
        return ", nombre=" + nombre + ", direccion=" + direccion + ", localidad=" + localidad + ", nombreGerente=" + nombreGerente;
    }

}
