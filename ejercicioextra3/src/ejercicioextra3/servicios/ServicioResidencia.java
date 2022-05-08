package ejercicioextra3.servicios;

import ejercicioextra3.entidades.ExtraHotelero;
import ejercicioextra3.entidades.Residencia;

public class ServicioResidencia extends ServicioExtraHotelero {

    @Override
    public Residencia crearAlojamiento() {

        int cantidadDeHabitacionesEnResidencia;
        boolean tieneDescuentoGremialLaResidencia, tieneCampoDeportivoLaResidencia;

        ExtraHotelero extraHotelero = super.crearAlojamiento();

        System.out.println("Ingrese la cantidad de habitaciones, de la residencia");
        cantidadDeHabitacionesEnResidencia = leer.nextInt();

        tieneDescuentoGremialLaResidencia = elegirSiTieneDescuentoGremialLaResidencia();
        
        tieneCampoDeportivoLaResidencia = elegirSiTieneCampoDeportivoLaResidencia();
        
        return new Residencia(cantidadDeHabitacionesEnResidencia, tieneDescuentoGremialLaResidencia, tieneCampoDeportivoLaResidencia, extraHotelero);
        
    }

    private boolean elegirSiTieneDescuentoGremialLaResidencia() {

        int opcion;

        System.out.println("¿Tiene descuento gremial?");
        System.out.println("(Si elige una opción inválida, se elegirá la opción 2)");
        System.out.println("1. SI");
        System.out.println("2. NO");
        opcion = leer.nextInt();

        return opcion == 1;

    }

    private boolean elegirSiTieneCampoDeportivoLaResidencia() {

        int opcion;

        System.out.println("¿Tiene campo deportivo?");
        System.out.println("(Si elige una opción inválida, se elegirá la opción 2)");
        System.out.println("1. SI");
        System.out.println("2. NO");
        opcion = leer.nextInt();

        return opcion == 1;

    }
    
}
