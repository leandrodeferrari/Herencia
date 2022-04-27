
package ejercicio1;

import ejercicio1.entidades.Caballo;
import ejercicio1.entidades.Gato;
import ejercicio1.entidades.Perro;

public class Ejercicio1 {

    public static void main(String[] args) {
        
        // 1. Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, Caballo.  
        // La clase Animal tendrá como atributos el nombre, alimento, edad y raza del Animal. 
        // Crear un método en la clase Animal a través del cual cada clase hija deberá mostrar 
        // luego un mensaje por pantalla informando de que se alimenta.
        
        Perro perro1 = new Perro();
        perro1.crearPerro(perro1);
        perro1.alimentarse(perro1.getAlimento());
        
        System.out.println("");
        
        Gato gato1 = new Gato();
        gato1.crearGato(gato1);
        gato1.alimentarse(gato1.getAlimento());
        
        System.out.println("");
        
        Caballo caballo1 = new Caballo();
        caballo1.crearCaballo(caballo1);
        caballo1.alimentarse(caballo1.getAlimento());
        
        System.out.println("");
        
    }

}
