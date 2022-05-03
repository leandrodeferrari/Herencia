package ejercicio2.servicios;

import ejercicio2.entidades.Electrodomestico;
import ejercicio2.enumeraciones.Color;
import ejercicio2.enumeraciones.Letra;
import java.util.Scanner;

public class ServicioElectrodomestico {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    private Letra elegirConsumoEnergetico() {

        int opcion;

        System.out.println("Elija el consumo energético de su electrodoméstico:");
        System.out.println("(Si elige un número sin opción, en su defecto se elegirá la opción 6)");
        System.out.println("1. A");
        System.out.println("2. B");
        System.out.println("3. C");
        System.out.println("4. D");
        System.out.println("5. E");
        System.out.println("6. F");
        opcion = leer.nextInt();

        if (opcion > 6 || opcion < 1) {

            opcion = 6;

        }

        return (Letra.values()[opcion - 1]);

    }

    private Color elegirColor() {

        int opcion;

        System.out.println("Elija el color de su electrodoméstico:");
        System.out.println("(Si elige un número sin opción, en su defecto se elegirá la opción 1)");
        System.out.println("1. BLANCO");
        System.out.println("2. NEGRO");
        System.out.println("3. ROJO");
        System.out.println("4. AZUL");
        System.out.println("5. GRIS");
        opcion = leer.nextInt();

        if (opcion > 5 || opcion < 1) {

            opcion = 1;

        }

        return (Color.values()[opcion - 1]);

    }

    protected Electrodomestico crearElectrodomestico() {

        Electrodomestico electrodomestico = new Electrodomestico();

        double precio, peso;
        Color color;
        Letra consumoEnergetico;

        color = elegirColor();
        electrodomestico.setColor(color);

        consumoEnergetico = elegirConsumoEnergetico();
        electrodomestico.setConsumoEnergetico(consumoEnergetico);

        System.out.println("Ingrese el peso de su electrodoméstico, en kg");
        peso = leer.nextDouble();
        electrodomestico.setPesoEnKg(peso);

        precio = calcularPrecioFinal(consumoEnergetico.getLetra(), peso);
        electrodomestico.setprecio(precio);

        return electrodomestico;
        
    }

    private double calcularPrecioFinal(char consumoEnergetico, double peso) {

        double precioBase = 1000, precioSegunConsumo, precioSegunPeso, precioFinal;

        precioSegunConsumo = calcularPrecioDelConsumoEnergetico(consumoEnergetico);

        precioSegunPeso = calcularPrecioSegunPeso(peso);

        precioFinal = precioBase + precioSegunConsumo + precioSegunPeso;

        return precioFinal;

    }

    private double calcularPrecioDelConsumoEnergetico(char consumoEnergetico) {

        double precioSegunConsumo;

        switch (consumoEnergetico) {

            case 'A':
                precioSegunConsumo = 1000;
                break;
            case 'B':
                precioSegunConsumo = 800;
                break;
            case 'C':
                precioSegunConsumo = 600;
                break;
            case 'D':
                precioSegunConsumo = 500;
                break;
            case 'E':
                precioSegunConsumo = 300;
                break;
            case 'F':
                precioSegunConsumo = 100;
                break;
            default:
                precioSegunConsumo = 0;

        }

        return precioSegunConsumo;

    }

    private double calcularPrecioSegunPeso(double peso) {

        double precioSegunPeso;

        if (peso >= 1 && peso <= 19) {

            precioSegunPeso = 100;

        } else if (peso >= 20 && peso <= 49) {

            precioSegunPeso = 500;

        } else if (peso >= 50 && peso <= 79) {

            precioSegunPeso = 800;

        } else if (peso >= 80) {

            precioSegunPeso = 1000;

        } else {

            precioSegunPeso = 0;

        }

        return precioSegunPeso;

    }
    
}
