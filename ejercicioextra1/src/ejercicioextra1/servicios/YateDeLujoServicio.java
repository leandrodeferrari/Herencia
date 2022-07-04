package ejercicioextra1.servicios;

import ejercicioextra1.entidades.BarcoMotorizado;
import ejercicioextra1.entidades.YateDeLujo;

public class YateDeLujoServicio extends BarcoMotorizadoServicio {

    @Override
    public YateDeLujo crearTransporte(){
        
       int numeroDeCamarotes;
        
       BarcoMotorizado transporte = super.crearTransporte();
        
        System.out.println("Ingrese el número de camarotes de su transporte"); 
        numeroDeCamarotes = leer.nextInt();
        
        YateDeLujo yateDeLujo = new YateDeLujo(numeroDeCamarotes, transporte.getPotenciaEnCv(), transporte.getMatricula(), transporte.getEsloraEnMetros(), transporte.getAnioDeFabricacion());
        
        return yateDeLujo;
        
    }
    
}
