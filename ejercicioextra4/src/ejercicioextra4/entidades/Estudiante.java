package ejercicioextra4.entidades;

import ejercicioextra4.enumeraciones.Carrera;
import ejercicioextra4.enumeraciones.EstadoCivil;

public class Estudiante extends Persona {

    private Carrera carreraAsignada;

    public Estudiante() {
    }

    public Estudiante(Carrera carreraAsignada, String nombre, String apellido, Integer numeroDeIdentificacion, EstadoCivil estadoCivil) {
        super(nombre, apellido, numeroDeIdentificacion, estadoCivil);
        this.carreraAsignada = carreraAsignada;
    }

    public Carrera getCarreraAsignada() {
        return carreraAsignada;
    }

    public void setCarreraAsignada(Carrera carreraAsignada) {
        this.carreraAsignada = carreraAsignada;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "carreraAsignada=" + carreraAsignada + super.toString() + '}';
    }

    public void cambiarCarrera(Estudiante estudiante) {

        int opcion;
        Carrera nuevaCarrera;

        System.out.println("Ingrese la nueva carrera:");
        System.out.println("Si ingresa una opción incorrecta, no se cambiará su carrera");
        System.out.println("1. Ciencias Matemáticas");
        System.out.println("2. Abogacía");
        System.out.println("3. Enfermería");
        System.out.println("4. Administración");
        opcion = leer.nextInt();

        if (opcion >= 1 && opcion <= 4) {

            nuevaCarrera = Carrera.values()[opcion - 1];
            this.carreraAsignada = nuevaCarrera;

        }

    }

}
