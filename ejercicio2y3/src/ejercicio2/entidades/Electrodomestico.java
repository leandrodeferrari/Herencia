package ejercicio2.entidades;

import ejercicio2.enumeraciones.Color;
import ejercicio2.enumeraciones.Letra;

public class Electrodomestico {

    protected double precio;
    protected Color color;
    protected Letra consumoEnergetico;
    protected double pesoEnKg;

    public Electrodomestico() {
    }

    public Electrodomestico(double precio, Color color, Letra consumoEnergetico, double pesoEnKg) {
        this.precio = precio;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.pesoEnKg = pesoEnKg;
    }

    public double getPrecio() {
        return precio;
    }

    public void setprecio(double precio){
        this.precio = precio;
    }
    
    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Letra getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(Letra consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public double getPesoEnKg() {
        return pesoEnKg;
    }

    public void setPesoEnKg(double pesoEnKg) {
        this.pesoEnKg = pesoEnKg;
    }

    @Override
    public String toString() {
        return "precio=" + precio + ", color=" + color + ", consumoEnergetico=" + consumoEnergetico + ", pesoEnKg=" + pesoEnKg;
    }

}
