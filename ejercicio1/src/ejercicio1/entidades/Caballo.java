package ejercicio1.entidades;

import java.util.Scanner;

public class Caballo extends Animal {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Caballo() {
    }

    public Caballo(String nombre, String alimento, int edad, String raza) {
        super(nombre, alimento, edad, raza);
    }

    public void crearCaballo(Caballo caballo) {

        System.out.println("Ingese el nombre del caballo");
        caballo.setNombre(leer.next());
        System.out.println("Ingrese el alimento que come el caballo");
        caballo.setAlimento(leer.next());
        System.out.println("Ingrese la edad de su caballo");
        caballo.setEdad(leer.nextInt());
        System.out.println("Ingrese la raza de su caballo");
        caballo.setRaza(leer.next());

    }

    @Override
    public void alimentarse(String alimento) {

        System.out.println("El caballo " + this.nombre + " se alimenta de " + this.alimento);

    }

}
