package ejercicioextra1.entidades;

public class BarcoMotorizado extends TransporteMaritimo {

    protected double potenciaEnCv;

    public BarcoMotorizado() {
    }

    public BarcoMotorizado(double potenciaEnCv, Integer matricula, double esloraEnMetros, int anioDeFabricacion) {
        super(matricula, esloraEnMetros, anioDeFabricacion);
        this.potenciaEnCv = potenciaEnCv;
    }

    public double getPotenciaEnCv() {
        return potenciaEnCv;
    }

    public void setPotenciaEnCv(double potenciaEnCv) {
        this.potenciaEnCv = potenciaEnCv;
    }
    
    @Override
    public String toString() {
        return "BarcoMotorizado{" + "potenciaEnCv=" + potenciaEnCv + ", " + super.toString() + '}';
    }

}
