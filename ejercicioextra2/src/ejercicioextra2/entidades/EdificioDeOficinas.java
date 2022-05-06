package ejercicioextra2.entidades;

public class EdificioDeOficinas extends Edificio {

    private int numeroDeOficinas;
    private int cantidadDePersonasPorOficina;
    private int numeroDePisos;

    public EdificioDeOficinas() {
    }

    public EdificioDeOficinas(int numeroDeOficinas, int cantidadDePersonasPorOficina, int numeroDePisos, double ancho, double alto, double largo) {
        super(ancho, alto, largo);
        this.numeroDeOficinas = numeroDeOficinas;
        this.cantidadDePersonasPorOficina = cantidadDePersonasPorOficina;
        this.numeroDePisos = numeroDePisos;
    }

    public int getNumeroDeOficinas() {
        return numeroDeOficinas;
    }

    public void setNumeroDeOficinas(int numeroDeOficinas) {
        this.numeroDeOficinas = numeroDeOficinas;
    }

    public int getCantidadDePersonasPorOficina() {
        return cantidadDePersonasPorOficina;
    }

    public void setCantidadDePersonasPorOficina(int cantidadDePersonasPorOficina) {
        this.cantidadDePersonasPorOficina = cantidadDePersonasPorOficina;
    }

    public int getNumeroDePisos() {
        return numeroDePisos;
    }

    @Override
    public String toString() {
        return "EdificioDeOficinas{" + "numeroDeOficinas=" + numeroDeOficinas + ", cantidadDePersonasPorOficina=" + cantidadDePersonasPorOficina + ", numeroDePisos=" + numeroDePisos + super.toString() + '}';
    }

    @Override
    public double calcularSuperficie() {
        
        return this.largo* this.ancho;
        
    }

    @Override
    public double calcularVolumen() {
         
        return this.alto * this.ancho * this.largo;
        
    }

}
