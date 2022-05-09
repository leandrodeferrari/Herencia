
package ejercicioextra3.entidades;

import ejercicioextra3.servicios.*;
import java.util.Scanner;

public class SistemaDeConsulta {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    private Alojamiento alojamientoElegido;

    public SistemaDeConsulta() {
    }

    public SistemaDeConsulta(Alojamiento alojamientoElegido) {
        this.alojamientoElegido = alojamientoElegido;
    }

    public Alojamiento getAlojamientoElegido() {
        return alojamientoElegido;
    }

    public void setAlojamientoElegido(Alojamiento alojamientoElegido) {
        this.alojamientoElegido = alojamientoElegido;
    }

    @Override
    public String toString() {
        return "SistemaDeConsulta{" + "leer=" + leer + ", alojamientoElegido=" + alojamientoElegido + '}';
    }
    
    public void ejecutarSistemaDeConsulta(){
        
        int opcion;
        
        System.out.println("Alojamientos disponibles:");
        System.out.println("1. Hotel");
        System.out.println("2. ExtraHotelero");
        opcion = leer.nextInt();
        
        if(opcion == 1){
            
            System.out.println("1. Hotel 5 estrellas");
            System.out.println("2. Hotel 4 estrellas");
            opcion = leer.nextInt();
            
            
        } else {
            
            System.out.println("1. Camping");
            System.out.println("2. Residencia");
            opcion = leer.nextInt();
            
            if(opcion==1){
                opcion = 3;
            } else {
                opcion = 4;
            }
            
        }
        
        switch(opcion){
            
            case 1:
                
                ServicioHotel5Estrellas servicioHotel5Estrellas = new ServicioHotel5Estrellas();
                this.alojamientoElegido = servicioHotel5Estrellas.crearAlojamiento();
                break;
            
            case 2:
                
                ServicioHotel4Estrellas servicioHotel4Estrellas = new ServicioHotel4Estrellas();
                this.alojamientoElegido = servicioHotel4Estrellas.crearAlojamiento();
                break;
                
            case 3:
                
                ServicioCamping servicioCamping = new ServicioCamping();
                this.alojamientoElegido = servicioCamping.crearAlojamiento();
                break;
                
            case 4:
                
                ServicioResidencia servicioResidencia = new ServicioResidencia();
                this.alojamientoElegido = servicioResidencia.crearAlojamiento();
                break;
                
        }
        
        System.out.println(this.alojamientoElegido);
        
    }
    
}
