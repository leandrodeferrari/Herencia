
package ejercicioextra4.entidades;

import java.util.Set;


public class Facultad {

    private Set<Empleado> listaDeEmpleados;
    private Set<Estudiante> listaDeEstudiantes;

    public Facultad() {
    }

    public Facultad(Set<Empleado> listaDeEmpleados, Set<Estudiante> listaDeEstudiantes) {
        this.listaDeEmpleados = listaDeEmpleados;
        this.listaDeEstudiantes = listaDeEstudiantes;
    }

    public Set<Empleado> getListaDeEmpleados() {
        return listaDeEmpleados;
    }

    public void setListaDeEmpleados(Set<Empleado> listaDeEmpleados) {
        this.listaDeEmpleados = listaDeEmpleados;
    }

    public Set<Estudiante> getListaDeEstudiantes() {
        return listaDeEstudiantes;
    }

    public void setListaDeEstudiantes(Set<Estudiante> listaDeEstudiantes) {
        this.listaDeEstudiantes = listaDeEstudiantes;
    }

    @Override
    public String toString() {
        return "Facultad{" + "listaDeEmpleados=" + listaDeEmpleados.toString() + ", listaDeEstudiantes=" + listaDeEstudiantes.toString() + '}';
    }
    
}
