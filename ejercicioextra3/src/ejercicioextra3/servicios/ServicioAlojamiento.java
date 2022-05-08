package ejercicioextra3.servicios;

import ejercicioextra3.entidades.Alojamiento;
import java.util.Scanner;

public class ServicioAlojamiento {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Alojamiento crearAlojamiento() {

        String nombreAlojamiento, direccionAlojamiento, localidadAlojamiento, nombreDeGerenteDeAlojamiento;
        
        System.out.println("Ingrese el nombre del alojamiento");
        nombreAlojamiento = leer.next();
        
        System.out.println("Ingrese la dirección del alojamiento");
        direccionAlojamiento = leer.next();
        
        System.out.println("Ingrese la localidad del alojamiento");
        localidadAlojamiento = leer.next();
        
        System.out.println("Ingrese el nombre del gerente del alojamiento");
        nombreDeGerenteDeAlojamiento = leer.next();
        
        return new Alojamiento(nombreAlojamiento, direccionAlojamiento, localidadAlojamiento, nombreAlojamiento);
        
    }

}
