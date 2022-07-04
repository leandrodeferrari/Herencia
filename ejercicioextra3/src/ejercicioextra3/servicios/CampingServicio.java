package ejercicioextra3.servicios;

import ejercicioextra3.entidades.Camping;
import ejercicioextra3.entidades.ExtraHotelero;

public class CampingServicio extends ExtraHoteleroServicio {

    @Override
    public Camping crearAlojamiento(){
        
        ExtraHotelero extraHotelero = super.crearAlojamiento();
        
        int capacidadMaximaDeCarpasEnElCamping, cantidadDeBaniosDisponiblesEnElCamping;
        boolean tieneRestauranteElCamping;
        
        System.out.println("Ingrese la capacidad máxima de carpas del camping");
        capacidadMaximaDeCarpasEnElCamping = leer.nextInt();
        
        System.out.println("Ingrese la cantidad de baños dispoibles del camping");
        cantidadDeBaniosDisponiblesEnElCamping = leer.nextInt();
        
        tieneRestauranteElCamping = elegirSiTieneRestauranteElCamping();
        
        return new Camping(capacidadMaximaDeCarpasEnElCamping, cantidadDeBaniosDisponiblesEnElCamping, tieneRestauranteElCamping, extraHotelero);
        
    }
    
    private boolean elegirSiTieneRestauranteElCamping(){
        
        int opcion;
        
        System.out.println("¿Tiene restaurante?");
        System.out.println("Si ingresa una opción erronea, se elegirá la opción 2");
        System.out.println("1. SI");
        System.out.println("2. NO");
        opcion = leer.nextInt();
        
        return opcion == 1;
        
    }
    
}
