package ejercicioextra1.servicios;

import ejercicioextra1.interfaces.IMenu;
import ejercicioextra1.entidades.AlquilerDeAmarres;
import ejercicioextra1.entidades.BarcoMotorizado;
import ejercicioextra1.entidades.TransporteMaritimo;
import ejercicioextra1.entidades.Velero;
import ejercicioextra1.entidades.YateDeLujo;
import java.util.Date;
import java.util.Scanner;

public class ServicioAlquilerDeAmarres implements IMenu {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public AlquilerDeAmarres crearAlquiler() {

        String nombreDelCliente, posicionDelAmarre;
        Integer dniCliente;
        Date fechaDeInicio, fechaDeDevolucion;
        TransporteMaritimo transporte;
        int diaInicio, mesInicio, anioInicio;
        int diaDevolucion, mesDevolucion, anioDevolucion;
        int opcionDeTransporte;

        System.out.println("Ingrese su nombre");
        nombreDelCliente = leer.next();

        System.out.println("Ingrese su DNI");
        dniCliente = leer.nextInt();

        System.out.println("Ingrese la fecha de inicio del alquiler");
        System.out.println("Día:");
        diaInicio = leer.nextInt();
        System.out.println("Mes:");
        mesInicio = leer.nextInt();
        System.out.println("Año:");
        anioInicio = leer.nextInt();

        fechaDeInicio = new Date(anioInicio - 1900, mesInicio - 1, diaInicio);

        System.out.println("ingrese la fecha de la devolución de su alquiler");
        System.out.println("Día:");
        diaDevolucion = leer.nextInt();
        System.out.println("Mes:");
        mesDevolucion = leer.nextInt();
        System.out.println("Año:");
        anioDevolucion = leer.nextInt();

        fechaDeDevolucion = new Date(anioDevolucion - 1900, mesDevolucion - 1, diaDevolucion);

        System.out.println("Ingrese la posición del amarre");
        posicionDelAmarre = leer.next();

        opcionDeTransporte = crearMenuDeEleccionDeTransporte();

        transporte = crearTransporteDelAlquiler(opcionDeTransporte);

        AlquilerDeAmarres alquiler = new AlquilerDeAmarres(nombreDelCliente, dniCliente, fechaDeInicio, fechaDeDevolucion, posicionDelAmarre, transporte);

        return alquiler;

    }

    private TransporteMaritimo crearTransporteDelAlquiler(int opcion) {

        switch (opcion) {

            case 1:

                ServicioVelero servicioVelero = new ServicioVelero();
                Velero velero = servicioVelero.crearTransporte();
                return velero;

            case 2:

                ServicioBarcoMotorizado servicioBarcoMotorizado = new ServicioBarcoMotorizado();
                BarcoMotorizado barcoMotorizado = servicioBarcoMotorizado.crearTransporte();
                return barcoMotorizado;

            case 3:

                ServicioYateDeLujo servicioYateDeLujo = new ServicioYateDeLujo();
                YateDeLujo yateDeLujo = servicioYateDeLujo.crearTransporte();
                return yateDeLujo;

        }

        return null;

    }

    public double calcularAlquilerBase(double esloraEnMetros, int diasEntreFechas) {

        double precioBase;

        precioBase = diasEntreFechas * (esloraEnMetros * 10);

        return precioBase;

    }

    public int calculcarDiasEntreFechas(Date fechaDeInicio, Date fechaDeDevolucion) {

        return (int) ((fechaDeDevolucion.getTime() - fechaDeInicio.getTime()) / (1000 * 60 * 60 * 24));

    }

    public double calculcarPrecioAlquilerSegunTransporte(TransporteMaritimo transporte) {

        double precioSegunTransporte = 0;

        if (transporte instanceof YateDeLujo) {

            precioSegunTransporte = (((YateDeLujo) transporte).getPotenciaEnCv() * 10) + (((YateDeLujo) transporte).getNumeroDeCamarotes() * 10);

        } else if (transporte instanceof BarcoMotorizado) {

            precioSegunTransporte = ((BarcoMotorizado) transporte).getPotenciaEnCv() * 10;

        } else if (transporte instanceof Velero) {

            precioSegunTransporte = ((Velero) transporte).getNumeroDeMastiles() * 10;

        }

        return precioSegunTransporte;

    }

    @Override
    public void crearMenuAlquilerDeAmarres() {

        int diasEntreFechas;
        double precioBase, precioSegunTransporte, alquilerTotal;

        System.out.println("¡Bienvenido a Alquileres De Amarres!");

        AlquilerDeAmarres alquiler = crearAlquiler();

        diasEntreFechas = calculcarDiasEntreFechas(alquiler.getFechaDeInicio(), alquiler.getFechaDeDevolucion());

        precioBase = calcularAlquilerBase(alquiler.getTransporte().getEsloraEnMetros(), diasEntreFechas);

        precioSegunTransporte = calculcarPrecioAlquilerSegunTransporte(alquiler.getTransporte());
        
        alquilerTotal = precioBase + precioSegunTransporte;
        
        System.out.println("El precio final de su alquiler es: " + alquilerTotal);;
//        System.out.println(alquiler);
        
    }

    @Override
    public int crearMenuDeEleccionDeTransporte() {

        int opcion;

        System.out.println("Ingrese cúal transporte desea elegir:");
        System.out.println("Si elige una opcion que no aperzca en el menú, se eligirá la opción 3, por defecto");
        System.out.println("1. Velero");
        System.out.println("2. Barco motorizado");
        System.out.println("3. Yate de lujo");
        opcion = leer.nextInt();

        if (opcion < 1 || opcion > 3) {
            opcion = 3;
        }

        return opcion;

    }

}
