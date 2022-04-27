package ejercicio1.entidades;

import java.util.Scanner;

public class Gato extends Animal {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Gato() {
    }

    public Gato(String nombre, String alimento, int edad, String raza) {
        super(nombre, alimento, edad, raza);
    }

    public void crearGato(Gato gato) {

        System.out.println("Ingese el nombre del gato");
        gato.setNombre(leer.next());
        System.out.println("Ingrese el alimento que come el gato");
        gato.setAlimento(leer.next());
        System.out.println("Ingrese la edad de su gato");
        gato.setEdad(leer.nextInt());
        System.out.println("Ingrese la raza de su gato");
        gato.setRaza(leer.next());

    }

    @Override
    public void alimentarse(String alimento) {

        System.out.println("El gato " + this.nombre + " se alienta de " + this.alimento);

    }

}
