package ejercicioextra1.servicios;

import ejercicioextra1.entidades.TransporteMaritimo;
import ejercicioextra1.entidades.Velero;

public class VeleroServicio extends TransporteMaritimoServicio {

    @Override
    public Velero crearTransporte() {

        int numeroDeMastiles;

        TransporteMaritimo transporte = super.crearTransporte();

        System.out.println("Ingrese el número de mástiles que posee su transporte");
        numeroDeMastiles = leer.nextInt();

        Velero velero = new Velero(numeroDeMastiles, transporte.getMatricula(), transporte.getEsloraEnMetros(), transporte.getAnioDeFabricacion());

        return velero;

    }

}
