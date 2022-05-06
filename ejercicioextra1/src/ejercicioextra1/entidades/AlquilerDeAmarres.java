
package ejercicioextra1.entidades;

import java.util.Date;

public class AlquilerDeAmarres {

    private String nombreDelCliente;
    private Integer dniCliente;
    private Date fechaDeInicio;
    private Date fechaDeDevolucion;
    private String posicionDelAmarre;
    private TransporteMaritimo transporte;

    public AlquilerDeAmarres() {
    }

    public AlquilerDeAmarres(String nombreDelCliente, Integer dniCliente, Date fechaDeInicio, Date fechaDeDevolucion, String posicionDelAmarre, TransporteMaritimo transporte) {
        this.nombreDelCliente = nombreDelCliente;
        this.dniCliente = dniCliente;
        this.fechaDeInicio = fechaDeInicio;
        this.fechaDeDevolucion = fechaDeDevolucion;
        this.posicionDelAmarre = posicionDelAmarre;
        this.transporte = transporte;
    }

    public String getNombreDelCliente() {
        return nombreDelCliente;
    }

    public void setNombreDelCliente(String nombreDelCliente) {
        this.nombreDelCliente = nombreDelCliente;
    }

    public Integer getDniCliente() {
        return dniCliente;
    }

    public void setDniCliente(Integer dniCliente) {
        this.dniCliente = dniCliente;
    }

    public Date getFechaDeInicio() {
        return fechaDeInicio;
    }

    public void setFechaDeInicio(Date fechaDeInicio) {
        this.fechaDeInicio = fechaDeInicio;
    }

    public Date getFechaDeDevolucion() {
        return fechaDeDevolucion;
    }

    public void setFechaDeDevolucion(Date fechaDeDevolucion) {
        this.fechaDeDevolucion = fechaDeDevolucion;
    }

    public String getPosicionDelAmarre() {
        return posicionDelAmarre;
    }

    public void setPosicionDelAmarre(String posicionDelAmarre) {
        this.posicionDelAmarre = posicionDelAmarre;
    }

    public TransporteMaritimo getTransporte() {
        return transporte;
    }

    public void setTransporte(TransporteMaritimo transporte) {
        this.transporte = transporte;
    }

    @Override
    public String toString() {
        return "Alquiler{" + "nombreDelCliente=" + nombreDelCliente + ", dniCliente=" + dniCliente + ", fechaDeInicio=" + fechaDeInicio + ", fechaDeDevolucion=" + fechaDeDevolucion + ", posicionDelAmarre=" + posicionDelAmarre + ", transporte=" + transporte + '}';
    }
    
}
