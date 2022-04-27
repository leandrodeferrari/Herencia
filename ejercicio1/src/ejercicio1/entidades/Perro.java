package ejercicio1.entidades;

import java.util.Scanner;

public class Perro extends Animal {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Perro() {
    }

    public Perro(String nombre, String alimento, int edad, String raza) {
        super(nombre, alimento, edad, raza);
    }

    public void crearPerro(Perro perro) {

        System.out.println("Ingese el nombre del perro");
        perro.setNombre(leer.next());
        System.out.println("Ingrese el alimento que come el perro");
        perro.setAlimento(leer.next());
        System.out.println("Ingrese la edad de su perro");
        perro.setEdad(leer.nextInt());
        System.out.println("Ingrese la raza de su perro");
        perro.setRaza(leer.next());

    }

    @Override
    public void alimentarse(String alimento) {

        System.out.println("El perro " + this.nombre + " se alimenta de " + this.alimento);

    }

}
