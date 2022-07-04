
package ejercicioextra3.servicios;

import ejercicioextra3.entidades.Alojamiento;
import ejercicioextra3.entidades.ExtraHotelero;


public class ExtraHoteleroServicio extends AlojamientoServicio {

    @Override
    public ExtraHotelero crearAlojamiento(){
        
        boolean esPrivadoElAlojamiento;
        double cantidadDeMetrosCuadradosDelAlojamiento;
        
        Alojamiento alojamiento = super.crearAlojamiento();
        
        esPrivadoElAlojamiento = elegirSiEsPrivadoElAlojamiento();
        
        System.out.println("Ingrese la cantidad de metros cuadrados del alojamiento");
        cantidadDeMetrosCuadradosDelAlojamiento = leer.nextDouble();
        
        return new ExtraHotelero(esPrivadoElAlojamiento, cantidadDeMetrosCuadradosDelAlojamiento, alojamiento);
        
    }
    
    private boolean elegirSiEsPrivadoElAlojamiento(){
        
        int opcion;
        
        System.out.println("¿Es privado?");
        System.out.println("(Si elige una opción inválida, se elegirá la opción 2)");
        System.out.println("1. SI");
        System.out.println("2. NO");
        opcion = leer.nextInt();
        
        return opcion == 1;
        
    }
    
}


