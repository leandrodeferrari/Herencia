package ejercicioextra1.entidades;

public class YateDeLujo extends BarcoMotorizado {

    private int numeroDeCamarotes;

    public YateDeLujo() {
    }

    public YateDeLujo(int numeroDeCamarotes, double potenciaEnCv, Integer matricula, double esloraEnMetros, int anioDeFabricacion) {
        super(potenciaEnCv, matricula, esloraEnMetros, anioDeFabricacion);
        this.numeroDeCamarotes = numeroDeCamarotes;
    }

    public int getNumeroDeCamarotes() {
        return numeroDeCamarotes;
    }

    public void setNumeroDeCamarotes(int numeroDeCamarotes) {
        this.numeroDeCamarotes = numeroDeCamarotes;
    }

    @Override
    public String toString() {
        return "YateDeLujo{" + "numeroDeCamarotes=" + numeroDeCamarotes + ", potenciaEnCv=" + this.potenciaEnCv + ", matricula=" + this.matricula + ", esloraEnMetros=" + this.esloraEnMetros + ", anioDeFabricacion=" + this.anioDeFabricacion + '}';
    }

}
