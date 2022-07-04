package ejercicio2;

import ejercicio2.entidades.*;
import ejercicio2.servicios.*;
import java.util.*;

public class Ejercicio2 {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {

        // 2. Crear una superclase llamada Electrodoméstico con los siguientes atributos: 
        // precio, color, consumo energético (letras entre A y F) y peso. 
        //
        // Los constructores que se deben implementar son los siguientes:
        // 
        // a) Un constructor vacío. 
        // b) Un constructor con todos los atributos pasados por parámetro. 
        // 
        // Los métodos a implementar son:
        // 
        // a) Métodos getters y setters de todos los atributos. 
        // b) Método comprobarConsumoEnergetico(char letra): comprueba que la letra es 
        // correcta, si no es correcta usara la letra F por defecto. Este método se 
        // debe invocar al crear el objeto y no será visible.
        // c) Método comprobarColor(String color): comprueba que el color es correcto, 
        // y si no lo es, usa el color blanco por defecto. Los colores disponibles para 
        // los electrodomésticos son blanco, negro, rojo, azul y gris. No importa si el 
        // nombre está en mayúsculas o en minúsculas. Este método se invocará al crear 
        // el objeto y no será visible.
        // d) Metodo crearElectrodomestico(): le pide la información al usuario y llena 
        // el electrodoméstico, también llama los métodos para comprobar el color y el 
        // consumo. Al precio se le da un valor base de $1000.
        // e) Método precioFinal(): según el consumo energético y su tamaño, aumentará 
        // el valor del precio. Esta es la lista de precios: 
        // 
        // LETRA PRECIO            PESO                PRECIO    
        //   A   1000$       Entre 1 y 19 kg             100$
        //   B    800$       Entre 20 y 49 kg            500$
        //   C    600$       Entre 50 y 79 kg            800$
        //   D    500$       Mayor que 80 kg            1000$
        //   E    300$
        //   F    100$
        //
        // A continuación se debe crear una subclase llamada Lavadora, con el atributo carga, 
        // además de los atributos heredados.
        //
        // Los constructores que se implementarán serán: 
        //
        // a) Un constructor vacío.
        // b) Un constructor con la carga y el resto de atributos heredados. Recuerda que 
        // debes llamar al constructor de la clase padre. 
        //
        // Los métodos que se implementara serán: 
        // 
        // a) Método get y set del atributo carga.
        // b) Método crearLavadora(): este método llama a crearElectrodomestico() de la clase 
        // padre, lo utilizamos para llenar los atributos heredados del padre y después 
        // llenamos el atributo propio de la lavadora.
        // c) Método precioFinal():  este método será heredado y se le sumará la siguiente 
        // funcionalidad. Si tiene una carga mayor de 30 kg, aumentará el precio en $500, si 
        // la carga es menor o igual, no se incrementará el precio. Este método debe llamar 
        // al método padre y añadir el código necesario. Recuerda que las condiciones que hemos 
        // visto en la clase Electrodoméstico también deben afectar al precio.
        //
        // Se debe crear también una subclase llamada Televisor con los siguientes atributos: 
        // resolución (en pulgadas) y sintonizador TDT (booleano), además de los atributos heredados.
        //
        // Los constructores que se implementarán serán:
        // 
        // a) Un constructor vacío. 
        // b) Un constructor con la resolución, sintonizador TDT y el resto de atributos heredados. 
        // Recuerda que debes llamar al constructor de la clase padre.
        // 
        // Los métodos que se implementara serán: 
        // 
        // a) Método get y set de los atributos resolución y sintonizador TDT. 
        // b) Método crearTelevisor(): este método llama a crearElectrodomestico() de la clase padre, 
        // lo utilizamos para llenar los atributos heredados del padre y después llenamos los 
        // atributos del televisor.
        // c) Método precioFinal(): este método será heredado y se le sumará la siguiente funcionalidad. 
        // Si el televisor tiene una resolución mayor de 40 pulgadas, se incrementará el precio un 30% 
        // y si tiene un sintonizador TDT incorporado, aumentará $500. Recuerda que las condiciones 
        // que hemos visto en la clase Electrodomestico también deben afectar al precio.
        // 
        // Finalmente, en el main debemos realizar lo siguiente: 
        //
        // Vamos a crear una Lavadora y un Televisor y llamar a los métodos necesarios para mostrar 
        // el precio final de los dos electrodomésticos. 
        //
        // 3. Siguiendo el ejercicio anterior, en el main vamos a crear un ArrayList de 
        // Electrodomésticos para guardar 4 electrodomésticos, ya sean lavadoras o televisores, 
        // con valores ya asignados.
        // Luego, recorrer este array y ejecutar el método precioFinal() en cada electrodoméstico. 
        // Se deberá también mostrar el precio de cada tipo de objeto, es decir, el precio de todos 
        // los televisores y el de las lavadoras. Una vez hecho eso, también deberemos mostrar, la 
        // suma del precio de todos los Electrodomésticos. Por ejemplo, si tenemos una lavadora con 
        // un precio de 2000 y un televisor de 5000, el resultado final será de 7000 (2000+5000) 
        // para electrodomésticos, 2000 para lavadora y 5000 para televisor.
        
        double precioTotal, precioTotalDeLavoras, precioTotalDeTelevisores;
        ArrayList<Electrodomestico> listaDe4Electrodomesticos = Ejercicio2.crearListaDe4Electrodomesticos();

        Ejercicio2.mostrarPreciosDeElectrodomesticos(listaDe4Electrodomesticos);

        precioTotal = Ejercicio2.calcularPrecioTotalDe4Electrodomesticos(listaDe4Electrodomesticos);
        System.out.println("El precio total de los 4 electrodomésticos es: " + precioTotal);

        precioTotalDeLavoras = calcularPrecioDeLasLavadoras(listaDe4Electrodomesticos);
        System.out.println("Precio total de Lavadoras: " + precioTotalDeLavoras);

        precioTotalDeTelevisores = calcularPrecioDeTelevisores(listaDe4Electrodomesticos);
        System.out.println("Precio total de Televisores: " + precioTotalDeTelevisores);

    }

    public static ArrayList crearListaDe4Electrodomesticos() {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        ArrayList<Electrodomestico> listaDe4Electrodomesticos = new ArrayList();
        int opcion;

        for (int i = 0; i < 4; i++) {

            System.out.println("Ingrese el electrodoméstico que desea agregar");
            System.out.println("(Si ingresa una opción incorrecta, se eligirá la opcion 2)");
            System.out.println("1. Lavadora");
            System.out.println("2. Televisor");
            opcion = leer.nextInt();

            if (opcion < 1 || opcion > 2) {

                opcion = 2;

            }

            switch (opcion) {

                case 1:

                    LavadoraServicio servicioLavadora = new LavadoraServicio();
                    Lavadora lavadora = servicioLavadora.crearElectrodomestico();
                    listaDe4Electrodomesticos.add(lavadora);
                    break;

                case 2:

                    TelevisorServicio servicioTelevisor = new TelevisorServicio();
                    Televisor televisor = servicioTelevisor.crearElectrodomestico();
                    listaDe4Electrodomesticos.add(televisor);
                    break;
            }

            System.out.println();

        }

        return listaDe4Electrodomesticos;

    }

    public static void mostrarPreciosDeElectrodomesticos(ArrayList<Electrodomestico> listaDe4Electromesticos) {

        for (Electrodomestico electrodomestico : listaDe4Electromesticos) {

            if (electrodomestico instanceof Lavadora) {

                System.out.println("Lavadora: " + electrodomestico.getPrecio());

            } else {

                System.out.println("Televisor: " + electrodomestico.getPrecio());

            }

        }

    }

    public static double calcularPrecioTotalDe4Electrodomesticos(ArrayList<Electrodomestico> listaDe4Electromesticos) {

        double precioTotal = 0;

        for (Electrodomestico electromestico : listaDe4Electromesticos) {

            precioTotal += electromestico.getPrecio();

        }

        return precioTotal;

    }

    public static double calcularPrecioDeLasLavadoras(ArrayList<Electrodomestico> listaDe4Electromesticos) {

        double precioTotalDeLavadoras = 0;

        for (Electrodomestico electromestico : listaDe4Electromesticos) {

            if (electromestico instanceof Lavadora) {
                precioTotalDeLavadoras += electromestico.getPrecio();

            }

        }

        return precioTotalDeLavadoras;

    }

    public static double calcularPrecioDeTelevisores(ArrayList<Electrodomestico> listaDe4Electromesticos) {

        double precioTotalDeTelevisores = 0;

        for (Electrodomestico electromestico : listaDe4Electromesticos) {

            if (electromestico instanceof Televisor) {
                precioTotalDeTelevisores += electromestico.getPrecio();

            }

        }

        return precioTotalDeTelevisores;

    }

}
