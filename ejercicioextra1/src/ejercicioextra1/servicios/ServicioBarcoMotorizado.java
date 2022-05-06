
package ejercicioextra1.servicios;

import ejercicioextra1.entidades.BarcoMotorizado;
import ejercicioextra1.entidades.TransporteMaritimo;

public class ServicioBarcoMotorizado extends ServicioTransporteMaritimo {

    @Override
    public BarcoMotorizado crearTransporte() {
        
        double potenciaEnCv;
        
        TransporteMaritimo transporte = super.crearTransporte();
        
        System.out.println("Ingrse la potencia, en CV, de su transporte");
        potenciaEnCv = leer.nextDouble();
        
        BarcoMotorizado barcoMotorizado = new BarcoMotorizado(potenciaEnCv, transporte.getMatricula(), transporte.getEsloraEnMetros(), transporte.getAnioDeFabricacion());
        
        return barcoMotorizado;
        
    }
    
}
