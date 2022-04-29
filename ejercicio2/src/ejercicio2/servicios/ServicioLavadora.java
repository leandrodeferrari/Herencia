package ejercicio2.servicios;


import ejercicio2.entidades.Lavadora;
import java.util.Scanner;

public class ServicioLavadora {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Lavadora crearLavadora() {
        
        Lavadora lavadora = new Lavadora();
        
        System.out.println("Ingrese cuánta carga posee la lavadora");
        lavadora.setCarga(leer.nextDouble());
                
        System.out.println(lavadora);
        
        return lavadora;

    }

}
