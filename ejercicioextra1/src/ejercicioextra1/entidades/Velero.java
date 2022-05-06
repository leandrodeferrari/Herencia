package ejercicioextra1.entidades;

public class Velero extends TransporteMaritimo {

    private int numeroDeMastiles;

    public Velero() {
    }

    public Velero(int numeroDeMastiles, Integer matricula, double esloraEnMetros, int anioDeFabricacion) {
        super(matricula, esloraEnMetros, anioDeFabricacion);
        this.numeroDeMastiles = numeroDeMastiles;
    }

    public int getNumeroDeMastiles() {
        return numeroDeMastiles;
    }

    public void setNumeroDeMastiles(int numeroDeMastiles) {
        this.numeroDeMastiles = numeroDeMastiles;
    }

    @Override
    public String toString() {
        return "Velero{" + "numeroDeMastiles=" + numeroDeMastiles + ", " + super.toString() + '}';
    }

}
