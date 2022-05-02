package ejercicio2.servicios;


import ejercicio2.entidades.Electrodomestico;
import ejercicio2.entidades.Lavadora;

public class ServicioLavadora extends ServicioElectrodomestico{

    @Override
    public Lavadora crearElectrodomestico(){
        
        ServicioElectrodomestico servicioElectrodomestico = new ServicioElectrodomestico();
        Electrodomestico electrodomestico = servicioElectrodomestico.crearElectrodomestico();
        double carga;
        
        System.out.println("Ingrese cuánta carga posee la lavadora");
        carga = leer.nextDouble();
        
        Lavadora lavadora = new Lavadora(electrodomestico.getPrecio(), carga, electrodomestico.getColor(), electrodomestico.getConsumoEnergetico(), electrodomestico.getPesoEnKg());
        
        System.out.println(lavadora);
        
        return lavadora;
        
    }
    
}
