package ejercicio2.entidades;

import ejercicio2.enumeraciones.Color;
import ejercicio2.enumeraciones.Letra;
import ejercicio2.servicios.ServicioElectrodomestico;

public class Lavadora extends Electrodomestico {

    private double carga;

    // No funciona lo que puse adentro del constructor vacio.
    
    public Lavadora() {
        ServicioElectrodomestico servicio = new ServicioElectrodomestico();
        servicio.crearElectrodomestico();
    }

    public Lavadora(double precio, double carga, Color color, Letra consumoEnergetico, double pesoEnKg) {
        super(precio, color, consumoEnergetico, pesoEnKg);
        this.carga = carga;
    }

    public double getCarga() {
        return carga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }

    @Override
    public String toString() {
        return "Lavaropa{" + "carga=" + carga + ", " + super.toString() + '}';
    }

}
