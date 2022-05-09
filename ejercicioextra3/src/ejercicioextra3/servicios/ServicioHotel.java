
package ejercicioextra3.servicios;

import ejercicioextra3.entidades.Alojamiento;
import ejercicioextra3.entidades.Hotel;


public class ServicioHotel extends ServicioAlojamiento {

    @Override
    public Hotel crearAlojamiento(){
        
        int cantidadDeHabitacionesDelHotel, numeroDeCamasDelHotel, cantidadDePisosDelHotel, precioDeHabitacionesDelHotel; 
        
        Alojamiento alojamiento = super.crearAlojamiento();
        
        System.out.println("Ingrese la cantidad de habitaciones del hotel");
        cantidadDeHabitacionesDelHotel = leer.nextInt();
        
        System.out.println("Ingrese el número de camas del hotel");
        numeroDeCamasDelHotel = leer.nextInt();
        
        System.out.println("Ingrese la cantidad de pisos del hotel");
        cantidadDePisosDelHotel = leer.nextInt();
        
        return new Hotel(cantidadDeHabitacionesDelHotel, numeroDeCamasDelHotel, cantidadDePisosDelHotel, 0, alojamiento);
             
    }
    
    
    
}
