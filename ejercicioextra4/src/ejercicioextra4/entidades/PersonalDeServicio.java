
package ejercicioextra4.entidades;

import ejercicioextra4.enumeraciones.EstadoCivil;
import ejercicioextra4.enumeraciones.Seccion;


public class PersonalDeServicio extends Empleado {

    private Seccion seccionAsignada;

    public PersonalDeServicio() {
    }

    public PersonalDeServicio(Seccion seccionAsignada, int anioDeIncorporacionEnLaFacultad, int numeroDeDespachoAsignado, String nombre, String apellido, Integer numeroDeIdentificacion, EstadoCivil estadoCivil) {
        super(anioDeIncorporacionEnLaFacultad, numeroDeDespachoAsignado, nombre, apellido, numeroDeIdentificacion, estadoCivil);
        this.seccionAsignada = seccionAsignada;
    }

    public Seccion getSeccionAsignada() {
        return seccionAsignada;
    }

    public void setSeccionAsignada(Seccion seccionAsignada) {
        this.seccionAsignada = seccionAsignada;
    }

    @Override
    public String toString() {
        return "PersonalDeServicio{" + "seccionAsignada=" + seccionAsignada + super.toString() + '}';
    }
    
    public void cambiarSeccion(PersonalDeServicio personal){
        
        Seccion nuevaSeccion;
        int opcion;
        
        System.out.println("Ingrese su nueva sección");
        System.out.println("Si ingresa una opción incorrecta, no se cambiará su sección");
        System.out.println("1. Biblioteca");
        System.out.println("2. Decanato");
        System.out.println("3. Secretaría");
        System.out.println("4. Patio");
        System.out.println("5. Comedor");
        opcion = leer.nextInt();
        
        if(opcion >= 1 && opcion <= 5){
            
            nuevaSeccion = Seccion.values()[opcion-1];
            this.seccionAsignada = nuevaSeccion;
            
        }
        
    }
    
}
