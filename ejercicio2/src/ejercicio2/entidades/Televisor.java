package ejercicio2.entidades;

import ejercicio2.enumeraciones.Color;
import ejercicio2.enumeraciones.Letra;

public class Televisor extends Electrodomestico {

    private double resolucionEnPulgadas;
    private boolean tieneSintonizadorTdt;
    
    public Televisor() {
    }

    public Televisor(double resolucionEnPulgadas, boolean tieneSintonizadorTdt, double precio, Color color, Letra consumoEnergetico, double pesoEnKg) {
        super(precio, color, consumoEnergetico, pesoEnKg);
        this.resolucionEnPulgadas = resolucionEnPulgadas;
        this.tieneSintonizadorTdt = tieneSintonizadorTdt;
    }

    public double getResolucionEnPulgadas() {
        return resolucionEnPulgadas;
    }

    public void setResolucionEnPulgadas(double resolucionEnPulgadas) {
        this.resolucionEnPulgadas = resolucionEnPulgadas;
    }

    public boolean isTieneSintonizadorTdt() {
        return tieneSintonizadorTdt;
    }

    public void setTieneSintonizadorTdt(boolean tieneSintonizadorTdt) {
        this.tieneSintonizadorTdt = tieneSintonizadorTdt;
    }

    @Override
    public String toString() {
        return "Televisor{" + "resolucionEnPulgadas=" + resolucionEnPulgadas + ", tieneSintonizadorTdt=" + tieneSintonizadorTdt + ", " + super.toString() + '}';
    }

}
