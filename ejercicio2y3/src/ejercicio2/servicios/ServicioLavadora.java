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
        
        lavadora.setprecio(calcularPrecioFinal(lavadora.getConsumoEnergetico().getLetra(), lavadora.getPesoEnKg(), carga));
        
        System.out.println(lavadora);
        
        return lavadora;
        
    }
    
    public double calcularPrecioFinal(char consumoEnergetico, double peso, double carga){
        
        double precioFinal;
        
        precioFinal = super.calcularPrecioFinal(consumoEnergetico, peso);
        
        if(carga>30){
            
            precioFinal+= 500;
            
        }
        
        return precioFinal;
        
    }
    
}
