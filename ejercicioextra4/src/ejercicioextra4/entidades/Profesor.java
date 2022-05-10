
package ejercicioextra4.entidades;

import ejercicioextra4.enumeraciones.Departamento;
import ejercicioextra4.enumeraciones.EstadoCivil;


public class Profesor extends Empleado {

    private Departamento departamentoPerteneciente;

    public Profesor() {
    }

    public Profesor(Departamento departamentoPerteneciente, int anioDeIncorporacionEnLaFacultad, int numeroDeDespachoAsignado, String nombre, String apellido, Integer numeroDeIdentificacion, EstadoCivil estadoCivil) {
        super(anioDeIncorporacionEnLaFacultad, numeroDeDespachoAsignado, nombre, apellido, numeroDeIdentificacion, estadoCivil);
        this.departamentoPerteneciente = departamentoPerteneciente;
    }

    public Departamento getDepartamentoPerteneciente() {
        return departamentoPerteneciente;
    }

    public void setDepartamentoPerteneciente(Departamento departamentoPerteneciente) {
        this.departamentoPerteneciente = departamentoPerteneciente;
    }

    
    
    @Override
    public String toString() {
        return "Profesor{" + "departamentoPerteneciente=" + departamentoPerteneciente + super.toString() + '}';
    }
    
    public void cambiarDepartamento(Profesor profesor){
        
        Departamento nuevoDepartamento;
        int opcion;
        
        System.out.println("Ingrese su nuevo departamento");
        System.out.println("Si ingresa una opción incorrecta, no se cambiará su departamento");
        System.out.println("1. Exactas");
        System.out.println("2. Derecho");
        System.out.println("3. Medicina");
        System.out.println("4. Económicas");
        opcion = leer.nextInt();
        
        if(opcion >= 1 && opcion <= 4){
            
            nuevoDepartamento = Departamento.values()[opcion-1];
            this.departamentoPerteneciente = nuevoDepartamento;
            
        }
        
    }
    
}
