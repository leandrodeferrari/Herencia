
package ejercicioextra3.servicios;

import ejercicioextra3.entidades.Hotel;
import ejercicioextra3.entidades.Hotel4Estrellas;
import ejercicioextra3.enumeraciones.Gimnasio;
import ejercicioextra3.interfaces.*;

public class ServicioHotel4Estrellas extends ServicioHotel implements ValorAgregadoDelGimnasio, ValorAgregadoDelRestaurante, IHabitacion {

    Gimnasio tipoGimnasio;
    int capacidadDelRestauranteDelHotel, cantidadDeHabitacionesDelHotel;
    double precioDeHabitacionesDelHotel;
    
    @Override
    public Hotel4Estrellas crearAlojamiento(){
        
        String nombreDelRestauranteDelHotel;
        
        Hotel hotel = super.crearAlojamiento();
        
        cantidadDeHabitacionesDelHotel = hotel.getCantidadDeHabitaciones();
        
        tipoGimnasio = elegirGimnasio();
        
        System.out.println("Ingrese el nombre del restaurante del hotel");
        nombreDelRestauranteDelHotel = leer.next();
        
        System.out.println("Ingrese la capacidad del restaurante del hotel");
        capacidadDelRestauranteDelHotel = leer.nextInt();
        
        precioDeHabitacionesDelHotel = calcularPrecioFinalDeHabitacion();
        hotel.setPrecioDeHabitaciones(precioDeHabitacionesDelHotel);
        
        return new Hotel4Estrellas(tipoGimnasio, nombreDelRestauranteDelHotel, capacidadDelRestauranteDelHotel, hotel);
        
    }
    
    private Gimnasio elegirGimnasio(){
        
        int opcion;
        
        System.out.println("Ingrese el tipo de gimnasio de su hotel");
        System.out.println("Si elige una opción erronea, se elegirá la opción 2");
        System.out.println("1. SI");
        System.out.println("2. NO");
        opcion = leer.nextInt();
        
        if(opcion == 1){
            
            return Gimnasio.A;
            
        } else {
            
            return Gimnasio.B;
            
        }
        
    }

    @Override
    public double calcularValorAgregadoDelGimnasio() {
        if(tipoGimnasio.equals(Gimnasio.A)){
            return 50;
        } else {
            return 30;
        }
    }

    @Override
    public double calcularValorAgregadoDelRestaurante() {
        if(capacidadDelRestauranteDelHotel<30){
            return 10;
        } else if(capacidadDelRestauranteDelHotel<=50){
            return 30;
        } else {
            return 50;
        }
    }

    @Override
    public double calcularPrecioFinalDeHabitacion() {
        return 50 + cantidadDeHabitacionesDelHotel + calcularValorAgregadoDelRestaurante() + calcularValorAgregadoDelGimnasio();
    }
    
}
