package ejercicioextra4.entidades;

import ejercicioextra4.enumeraciones.EstadoCivil;

public class Empleado extends Persona {

    protected int anioDeIncorporacionEnLaFacultad;
    protected int numeroDeDespachoAsignado;

    public Empleado() {
    }

    public Empleado(int anioDeIncorporacionEnLaFacultad, int numeroDeDespachoAsignado, String nombre, String apellido, Integer numeroDeIdentificacion, EstadoCivil estadoCivil) {
        super(nombre, apellido, numeroDeIdentificacion, estadoCivil);
        this.anioDeIncorporacionEnLaFacultad = anioDeIncorporacionEnLaFacultad;
        this.numeroDeDespachoAsignado = numeroDeDespachoAsignado;
    }

    public int getAnioDeIncorporacionEnLaFacultad() {
        return anioDeIncorporacionEnLaFacultad;
    }

    public void setAnioDeIncorporacionEnLaFacultad(int anioDeIncorporacionEnLaFacultad) {
        this.anioDeIncorporacionEnLaFacultad = anioDeIncorporacionEnLaFacultad;
    }

    public int getNumeroDeDespachoAsignado() {
        return numeroDeDespachoAsignado;
    }

    public void setNumeroDeDespachoAsignado(int numeroDeDespachoAsignado) {
        this.numeroDeDespachoAsignado = numeroDeDespachoAsignado;
    }

    @Override
    public String toString() {
        return ", añoDeIncorporacionEnLaFacultad=" + anioDeIncorporacionEnLaFacultad + ", numeroDeDespachoAsignado=" + numeroDeDespachoAsignado + super.toString() + '}';
    }
    
    protected void cambiarDespachoAsignado(Empleado empleado){
        
        int nuevoDespacho;
        
        System.out.println("Ingrese su nuevo despacho");
        nuevoDespacho = leer.nextInt();
        
        this.numeroDeDespachoAsignado = nuevoDespacho;
        
    }
    
}
