package ejercicioextra4.entidades;

import ejercicioextra4.enumeraciones.EstadoCivil;
import java.util.Scanner;

public class Persona {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    protected String nombre;
    protected String apellido;
    protected Integer numeroDeIdentificacion;
    protected EstadoCivil estadoCivil;

    public Persona() {
    }

    public Persona(String nombre, String apellido, Integer numeroDeIdentificacion, EstadoCivil estadoCivil) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroDeIdentificacion = numeroDeIdentificacion;
        this.estadoCivil = estadoCivil;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getNumeroDeIdentificacion() {
        return numeroDeIdentificacion;
    }

    public void setNumeroDeIdentificacion(Integer numeroDeIdentificacion) {
        this.numeroDeIdentificacion = numeroDeIdentificacion;
    }

    public EstadoCivil getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(EstadoCivil estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    
    @Override
    public String toString() {
        return ", nombre=" + nombre + ", apellido=" + apellido + ", numeroDeIdentificacion=" + numeroDeIdentificacion + ", estadoCivil=" + estadoCivil;
    }
    
    protected void cambiarEstadoCivil(Persona persona){
        
        EstadoCivil nuevoEstadoCivil;
        int opcion;
        
        System.out.println("Ingrese su nuevo estado civil");
        System.out.println("Si ingresa una opción incorrecta, no se cambiará su estado");
        System.out.println("1. Casado");
        System.out.println("2. Separado");
        System.out.println("3. Viudo");
        System.out.println("4. Soltero");
        opcion = leer.nextInt();
        
        if(opcion >= 1 && opcion <= 4){
            
            nuevoEstadoCivil = EstadoCivil.values()[opcion-1];
            this.estadoCivil = nuevoEstadoCivil;
            
        }
        
    }
    
}
