package ejercicio2.servicios;

import ejercicio2.entidades.Televisor;
import java.util.Scanner;

public class ServicioTelevisor {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Televisor crearTelevisor() {

        Televisor televisor = new Televisor();

        System.out.println("Ingrese cuánta resolución, en pulgadas, posee el televisor");
        televisor.setResolucionEnPulgadas(leer.nextDouble());

        televisor.setTieneSintonizadorTdt(elegirSiTieneSintonizadorLaTelevesion());
        
        System.out.println(televisor);

        return televisor;

    }

    private boolean elegirSiTieneSintonizadorLaTelevesion() {

        int opcion;

        System.out.println("¿La televisión, tiene sintonizador TDT?");
        System.out.println("(Si ingresa una opción incorrecta, se eligirá la opción 2)");
        System.out.println("1. SI");
        System.out.println("2. NO");
        opcion = leer.nextInt();

        return opcion == 1;

    }

}
