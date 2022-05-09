
package ejercicioextra3.servicios;

import ejercicioextra3.entidades.Hotel4Estrellas;
import ejercicioextra3.entidades.Hotel5Estrellas;
import ejercicioextra3.enumeraciones.Gimnasio;
import ejercicioextra3.interfaces.*;


public class ServicioHotel5Estrellas extends ServicioHotel4Estrellas implements ValorAgregadoDeLasLimosinas, ValorAgregadoDelGimnasio, ValorAgregadoDelRestaurante, IHabitacion {

    int cantidadDeLimosinasDeHotel, cantidadDeHabitaciones;
    double precioDeHabitaciones;
    Gimnasio tipoDeGimnasio;
    
    @Override
    public Hotel5Estrellas crearAlojamiento(){
        
        int cantidadDeSalonesDeConferenciaDeHotel, cantidadDeSuitesDeHotel;
        Hotel4Estrellas hotel4Estrellas = super.crearAlojamiento();
        
        cantidadDeHabitaciones = hotel4Estrellas.getCantidadDeHabitaciones();
        
        System.out.println("Ingrese la cantidad de salones de conferencia de su hotel");
        cantidadDeSalonesDeConferenciaDeHotel = leer.nextInt();
        
        System.out.println("Ingrese la cantidad de suites de su hotel");
        cantidadDeSuitesDeHotel = leer.nextInt();
        
        System.out.println("Ingrese la cantidad de limosinas de su hotel");
        cantidadDeLimosinasDeHotel = leer.nextInt();
        
        tipoDeGimnasio = hotel4Estrellas.getTipoDeGimnasio();
        
        precioDeHabitaciones = calcularPrecioFinalDeHabitacion();
        hotel4Estrellas.setPrecioDeHabitaciones(precioDeHabitaciones);
        
        return new Hotel5Estrellas(cantidadDeSalonesDeConferenciaDeHotel, cantidadDeSuitesDeHotel, cantidadDeLimosinasDeHotel, hotel4Estrellas);
        
    }

    @Override
    public double calcularValorAgregadoDeLasLimosinas() {
        return cantidadDeLimosinasDeHotel * 15;
    }

    @Override
    public double calcularValorAgregadoDelGimnasio() {
        if(tipoDeGimnasio.equals(Gimnasio.A)){
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
        return 50 + cantidadDeHabitaciones + calcularValorAgregadoDelRestaurante() + calcularValorAgregadoDelGimnasio() + calcularValorAgregadoDeLasLimosinas();
    }
    
}
