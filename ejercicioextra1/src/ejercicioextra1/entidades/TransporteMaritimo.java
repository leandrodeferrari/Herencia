package ejercicioextra1.entidades;

public class TransporteMaritimo {

    protected Integer matricula;
    protected double esloraEnMetros;
    protected int anioDeFabricacion;

    public TransporteMaritimo() {
    }

    public TransporteMaritimo(Integer matricula, double esloraEnMetros, int anioDeFabricacion) {
        this.matricula = matricula;
        this.esloraEnMetros = esloraEnMetros;
        this.anioDeFabricacion = anioDeFabricacion;
    }

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    public double getEsloraEnMetros() {
        return esloraEnMetros;
    }

    public void setEsloraEnMetros(double esloraEnMetros) {
        this.esloraEnMetros = esloraEnMetros;
    }

    public int getAnioDeFabricacion() {
        return anioDeFabricacion;
    }

    public void setAnioDeFabricacion(int anioDeFabricacion) {
        this.anioDeFabricacion = anioDeFabricacion;
    }

    @Override
    public String toString() {
        return "matricula=" + matricula + ", esloraEnMetros=" + esloraEnMetros + ", anioDeFabricacion=" + anioDeFabricacion;
    }
   
}
