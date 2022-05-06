package ejercicioextra2.servicios;

import ejercicioextra2.entidades.Edificio;
import ejercicioextra2.entidades.Polideportivo;
import ejercicioextra2.enumeraciones.TipoDeInstalacion;
import java.util.List;
import java.util.Scanner;

public class ServicioPolideportivo {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Polideportivo crearPolideportivo() {

        double ancho, largo, alto;
        String nombreDelPolideportivo;
        TipoDeInstalacion tipoDeInstalacion;

        System.out.println("Ingrese el ancho de su polideportivo");
        ancho = leer.nextDouble();

        System.out.println("Ingrese el largo de su polideportivo");
        largo = leer.nextDouble();

        System.out.println("Ingrese el alto de su polideportivo");
        alto = leer.nextDouble();

        System.out.println("Ingrese el nombre del polideportivo");
        nombreDelPolideportivo = leer.next();
        
        tipoDeInstalacion = elegirTipoDeInstalacion();
        
        return new Polideportivo(nombreDelPolideportivo, tipoDeInstalacion, ancho, alto, largo);

    }

    private TipoDeInstalacion elegirTipoDeInstalacion() {

        int opcion;

        System.out.println("Ingrese el tipo de instalación:");
        System.out.println("(Si ingresa una opción incorrecta, se elegirá la opción 2, por defecto)");
        System.out.println("1. Techado");
        System.out.println("2. Abierto");
        opcion = leer.nextInt();

        if (opcion != 1) {

            return TipoDeInstalacion.values()[1];

        } else {

            return TipoDeInstalacion.values()[0];

        }

    }
    
}
