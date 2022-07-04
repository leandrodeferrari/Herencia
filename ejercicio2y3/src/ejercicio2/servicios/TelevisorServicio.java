package ejercicio2.servicios;

import ejercicio2.entidades.Electrodomestico;
import ejercicio2.entidades.Televisor;

public class TelevisorServicio extends ElectrodomesticoServicio {

    @Override
    public Televisor crearElectrodomestico() {

        ElectrodomesticoServicio servicioElectrodomestico = new ElectrodomesticoServicio();
        Electrodomestico electrodomestico = servicioElectrodomestico.crearElectrodomestico();
        double resolucionDePulgadas;
        boolean tieneSintonizadorTdt;

        System.out.println("Ingrese cuánta resolución, en pulgadas, posee el televisor");
        resolucionDePulgadas = leer.nextDouble();

        tieneSintonizadorTdt = elegirSiTieneSintonizadorLaTelevesion();

        Televisor televisor = new Televisor(resolucionDePulgadas, tieneSintonizadorTdt, electrodomestico.getPrecio(), electrodomestico.getColor(), electrodomestico.getConsumoEnergetico(), electrodomestico.getPesoEnKg());
        
        televisor.setprecio(calcularPrecioFinal(televisor.getConsumoEnergetico().getLetra(), televisor.getPesoEnKg(), televisor.getResolucionEnPulgadas(), televisor.isTieneSintonizadorTdt()));
        
        System.out.println(televisor);

        return televisor;

    }

    public double calcularPrecioFinal(char ConsumoEnergetico, double peso, double resolucionEnPulgadas, boolean tieneSintonizadorTdt){
        
        double precioFinal;
        
        precioFinal = super.calcularPrecioFinal(ConsumoEnergetico, peso);
        
        if(resolucionEnPulgadas>40){
            
            precioFinal += precioFinal *0.3;
            
        }
        
        if(tieneSintonizadorTdt){
            
            precioFinal += 500;
            
        }
        
        
        return precioFinal;
        
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
