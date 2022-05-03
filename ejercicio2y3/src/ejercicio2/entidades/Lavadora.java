package ejercicio2.entidades;

import ejercicio2.enumeraciones.Color;
import ejercicio2.enumeraciones.Letra;

public class Lavadora extends Electrodomestico {

    private double carga;
    
    public Lavadora() {
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
        return "Lavadora{" + "carga=" + carga + ", " + super.toString() + '}';
    }

}
