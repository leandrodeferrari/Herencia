package ejercicioextra1.servicios;

import ejercicioextra1.entidades.TransporteMaritimo;
import java.util.Scanner;

public class ServicioTransporteMaritimo {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    protected TransporteMaritimo crearTransporte() {

        Integer matricula;
        double esloraEnMetros;
        int anioDeFabricacion;

        System.out.println("Ingrese la matrícula de su transporte");
        matricula = leer.nextInt();

        System.out.println("Ingrese la longitud de su eslora, en metros");
        esloraEnMetros = leer.nextDouble();

        System.out.println("Ingrese el año de fabricación de su transporte");
        anioDeFabricacion = leer.nextInt();

        TransporteMaritimo transporte = new TransporteMaritimo(matricula, esloraEnMetros, anioDeFabricacion);

        return transporte;

    }

}
