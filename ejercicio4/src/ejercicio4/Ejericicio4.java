package ejercicio4;

import ejercicio4.entidades.Circulo;
import ejercicio4.entidades.Rectangulo;

public class Ejericicio4 {

    public static void main(String[] args) {

        // 4. Se plantea desarrollar un programa que nos permita calcular el área y el perímetro 
        // de formas geométricas, en este caso un circulo y un rectángulo. Ya que este calculo 
        // se va a repetir en las dos formas geométricas, vamos a crear una Interfaz, llamada 
        // calculosFormas que tendrá, los dos métodos para calcular el área, el perímetro y el 
        // valor de PI como constante.
        // Desarrollar el ejercicio para que las formas implementen los métodos de la interfaz 
        // y se calcule el área y el perímetro de los dos. En el main se crearán las formas 
        // y se mostrará el resultado final.
        // Area circulo: PI * radio ^ 2 / Perímetro circulo: PI * diámetro. 
        // Área rectángulo: base * altura / Perímetro rectángulo: (base + altura) * 2.
        
        Circulo circulo = new Circulo(3.5, 7);
        Rectangulo rectangulo = new Rectangulo(5, 2);
        
        double perimetroCirculo, perimetroRectangulo, areaCirculo, areaRectangulo;
        
        perimetroCirculo = circulo.calcularPerimetro();
        perimetroRectangulo = rectangulo.calcularPerimetro();
        
        areaCirculo = circulo.calcularArea();
        areaRectangulo = rectangulo.calcularArea();
        
        System.out.println("El perímetro del circulo es: " + perimetroCirculo);
        System.out.println("El perímetro del rectangulo es: " + perimetroRectangulo);
        
        System.out.println("El area del circulo es: " + circulo.calcularArea());
        System.out.println("El area del rectangulo es: " + rectangulo.calcularArea());
        
    }

}
