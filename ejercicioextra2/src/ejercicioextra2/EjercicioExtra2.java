package ejercicioextra2;

import ejercicioextra2.entidades.*;
import ejercicioextra2.servicios.*;
import ejercicioextra2.enumeraciones.TipoDeInstalacion;
import java.util.*;

public class EjercicioExtra2 {

    public static void main(String[] args) {

        // 2. Crear una superclase llamada Edificio con los siguientes atributos: 
        // ancho, alto y largo. La clase edificio tendrá como métodos:
        // 
        // a) Método calcularSuperficie(): calcula la superficie del edificio. 
        // b) Método calcularVolumen(): calcula el volumen del edifico. 
        //
        // Estos métodos serán abstractos y los implementarán las siguientes clases: 
        //
        // a) Clase Polideportivo con su nombre y tipo de instalación que puede ser 
        // Techado o Abierto, esta clase implementará los dos métodos abstractos y 
        // los atributos del padre.
        // b) Clase EdificioDeOficinas con sus atributos número de oficinas, cantidad 
        // de personas por oficina y numero de pisos. Esta clase implementará los dos
        // métodos abstractos y los atributos del padre.
        // De esta clase nos interesa saber cuantas personas pueden trabajar en todo 
        // el edificio, el usuario dirá cuantas personas entran en cada oficina, cuantas 
        // oficinas y el numero de piso (suponiendo que en cada piso hay una oficina).
        // Crear el método cantPersonas(), que muestre cuantas personas entrarían en un 
        // piso y cuantas en todo el edificio.
        // 
        // Por ultimo, en el main vamos a crear un ArrayList de tipo Edificio. El 
        // ArrayList debe contener dos polideportivos y dos edificios de oficinas. Luego, 
        // recorrer este array y ejecutar los métodos calcularSuperficie y calcularVolumen 
        // en cada Edificio. Se deberá mostrar la superficie y el volumen de cada edificio.
        // 
        // Además de esto, para la clase Polideportivo nos interesa saber cuantos polideportivos 
        // son techados y cuantos abiertos. Y para la clase EdificioDeOficinas deberemos llamar 
        // al método cantPersonas() y mostrar los resultados de cada edificio de oficinas.
        
        List<Edificio> listaDe4Edificios = crear2EdificiosDeOficinasY2Polideportivos();

        for (Edificio edificio : listaDe4Edificios) {
            System.out.println(edificio);
        }

        System.out.println("");

        calcularSuperficieDeLosEdificios(listaDe4Edificios);

        System.out.println("");

        calcularVolumenDeLosEdificios(listaDe4Edificios);

        System.out.println("");

        calcularCantidadDePersonasEnEdificiosDeOficinas(listaDe4Edificios);

        System.out.println("");

        cantidadDePolideportivosSegunTipoDeInstalacion(listaDe4Edificios);

    }

    public static List<Edificio> crear2EdificiosDeOficinasY2Polideportivos() {

        List<Edificio> listaDe4Edificios = new ArrayList<>();
        PolideportivoServicio servicioPolideportivo = new PolideportivoServicio();
        EdificioDeOficinasServicio servicioEdificioDeOficinas = new EdificioDeOficinasServicio();

        for (int i = 0; i < 4; i++) {

            if (i == 0 || i == 1) {

                Edificio polideportivo = servicioPolideportivo.crearPolideportivo();

                listaDe4Edificios.add(polideportivo);

            } else {

                EdificioDeOficinas edificioDeOficinas = servicioEdificioDeOficinas.crearEdificioDeOficinas();

                listaDe4Edificios.add(edificioDeOficinas);

            }

        }

        return listaDe4Edificios;

    }

    public static void calcularSuperficieDeLosEdificios(List<Edificio> listaDe4Edificios) {

        for (Edificio edificio : listaDe4Edificios) {

            if (edificio instanceof EdificioDeOficinas) {

                EdificioDeOficinas edificioDeOficina = (EdificioDeOficinas) edificio;

                System.out.println("Superficie del edificio de oficinas: " + edificioDeOficina.calcularSuperficie());

            } else if (edificio instanceof Polideportivo) {

                Polideportivo polideportivo = (Polideportivo) edificio;

                System.out.println("Superficie del polideportivo: " + polideportivo.calcularSuperficie());

            }

        }

    }

    public static void calcularVolumenDeLosEdificios(List<Edificio> listaDe4Edificios) {

        for (Edificio edificio : listaDe4Edificios) {

            if (edificio instanceof EdificioDeOficinas) {

                EdificioDeOficinas edificioDeOficina = (EdificioDeOficinas) edificio;

                System.out.println("Volumen del edificio de oficinas: " + edificioDeOficina.calcularVolumen());

            } else if (edificio instanceof Polideportivo) {

                Polideportivo polideportivo = (Polideportivo) edificio;

                System.out.println("Volumen del polideportivo: " + polideportivo.calcularVolumen());

            }

        }

    }

    public static void calcularCantidadDePersonasEnEdificiosDeOficinas(List<Edificio> listaDe4Edificios) {

        for (Edificio edificio : listaDe4Edificios) {

            if (edificio instanceof EdificioDeOficinas) {

                EdificioDeOficinasServicio servicio = new EdificioDeOficinasServicio();
                EdificioDeOficinas edificioDeOficina = (EdificioDeOficinas) edificio;

                System.out.println("Cantidad de personas, que entran en el edificio de oficinas: " + servicio.cantidadPersonas(edificioDeOficina));

            }

        }

    }

    public static void cantidadDePolideportivosSegunTipoDeInstalacion(List<Edificio> listaDeEdificios) {

        int contadorTipoAbierto = 0, contadorTipoTechado = 0;

        for (Edificio edificio : listaDeEdificios) {

            if (edificio instanceof Polideportivo) {

                Polideportivo polideportivo = (Polideportivo) edificio;

                if (polideportivo.getTipoDeInstalacion().getTipo().equals(TipoDeInstalacion.ABIERTO.getTipo())) {

                    contadorTipoAbierto++;

                } else {

                    contadorTipoTechado++;

                }

            }

        }

        System.out.println("Cantidad de polideportivos con instalación abierta: " + contadorTipoAbierto);
        System.out.println("Cantidad de polideportivos con instalación techada: " + contadorTipoTechado);

    }

}
