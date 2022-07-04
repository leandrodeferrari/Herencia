package ejercicioextra2.servicios;

import ejercicioextra2.entidades.EdificioDeOficinas;
import java.util.Scanner;

public class EdificioDeOficinasServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public EdificioDeOficinas crearEdificioDeOficinas() {

        double ancho, largo, alto;
        int numeroDeOficinas, numeroDePisos, cantidadDePersonasPorOficina;

        System.out.println("Ingrese el ancho de su edificio");
        ancho = leer.nextDouble();

        System.out.println("Ingrese el largo de su edificio");
        largo = leer.nextDouble();

        System.out.println("Ingrese el alto de su edificio");
        alto = leer.nextDouble();

        System.out.println("Ingrese el número de oficinas del edificio");
        numeroDeOficinas = leer.nextInt();
        
        numeroDePisos = numeroDeOficinas;
        
        System.out.println("Ingrese la cantidad de personas que pueden ingresar, por oficina");
        cantidadDePersonasPorOficina = leer.nextInt();
        
        return new EdificioDeOficinas(numeroDeOficinas, cantidadDePersonasPorOficina, numeroDePisos, ancho, alto, largo);
        
    }

    public int cantidadPersonas(EdificioDeOficinas edificioDeOficinas){
        
        return edificioDeOficinas.getCantidadDePersonasPorOficina() * edificioDeOficinas.getNumeroDeOficinas();   
        
    }
    
}
