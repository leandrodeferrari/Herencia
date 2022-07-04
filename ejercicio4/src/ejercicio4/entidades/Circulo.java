package ejercicio4.entidades;

import ejercicio4.interfaces.CalculosFormas;

public class Circulo implements CalculosFormas{

    private final double PI_CIRCULO;
    private double diametro;
    private double radio;

    public Circulo() {
        this.PI_CIRCULO = Math.PI;
    }

    public Circulo(double diametro, double radio) {
        this();
        this.diametro = diametro;
        this.radio = radio;
    }

    public double getPI_CIRCULO(){
        return PI_CIRCULO;
    }
    
    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Circulo{" + "PI_CIRCULO=" + PI_CIRCULO + ", diametro=" + diametro + ", radio=" + radio + '}';
    }

    @Override
    public double calcularPerimetro() {
        
        return this.PI_CIRCULO * this.diametro;
        
    }

    @Override
    public double calcularArea() {
        
        return this.PI_CIRCULO * (Math.pow(radio, 2));
        
    }
    
}
