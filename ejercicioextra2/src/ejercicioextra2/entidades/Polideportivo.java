package ejercicioextra2.entidades;

import ejercicioextra2.enumeraciones.TipoDeInstalacion;

public class Polideportivo extends Edificio {

    private String nombreDelPolideportivo;
    private TipoDeInstalacion tipoDeInstalacion;

    public Polideportivo() {
    }

    public Polideportivo(String nombreDelPolideportivo, TipoDeInstalacion tipoDeInstalacion, double ancho, double alto, double largo) {
        super(ancho, alto, largo);
        this.nombreDelPolideportivo = nombreDelPolideportivo;
        this.tipoDeInstalacion = tipoDeInstalacion;
    }

    public String getNombreDelPolideportivo() {
        return nombreDelPolideportivo;
    }

    public void setNombreDelPolideportivo(String nombreDelPolideportivo) {
        this.nombreDelPolideportivo = nombreDelPolideportivo;
    }

    public TipoDeInstalacion getTipoDeInstalacion() {
        return tipoDeInstalacion;
    }

    public void setTipoDeInstalacion(TipoDeInstalacion tipoDeInstalacion) {
        this.tipoDeInstalacion = tipoDeInstalacion;
    }

    @Override
    public String toString() {
        return "Polideportivo{" + "nombreDelPolideportivo=" + nombreDelPolideportivo + ", tipoDeInstalacion=" + tipoDeInstalacion + super.toString() + '}';
    }

    @Override
    public double calcularSuperficie() {
        
        return this.largo* this.ancho;
        
    }

    @Override
    public double calcularVolumen() {
        
        return this.alto * this.ancho * this.largo;
        
    }

}
