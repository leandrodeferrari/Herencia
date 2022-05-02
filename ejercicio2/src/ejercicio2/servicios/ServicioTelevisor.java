package ejercicio2.servicios;

import ejercicio2.entidades.Electrodomestico;
import ejercicio2.entidades.Televisor;

public class ServicioTelevisor extends ServicioElectrodomestico {

    @Override
    public Televisor crearElectrodomestico() {

        ServicioElectrodomestico servicioElectrodomestico = new ServicioElectrodomestico();
        Electrodomestico electrodomestico = servicioElectrodomestico.crearElectrodomestico();
        double resolucionDePulgadas;
        boolean tieneSintonizadorTdt;

        System.out.println("Ingrese cuánta resolución, en pulgadas, posee el televisor");
        resolucionDePulgadas = leer.nextDouble();

        tieneSintonizadorTdt = elegirSiTieneSintonizadorLaTelevesion();

        Televisor televisor = new Televisor(resolucionDePulgadas, tieneSintonizadorTdt, electrodomestico.getPrecio(), electrodomestico.getColor(), electrodomestico.getConsumoEnergetico(), electrodomestico.getPesoEnKg());

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
