package ejercicioextra4;

import ejercicioextra4.entidades.*;
import ejercicioextra4.enumeraciones.*;
import java.util.*;

public class Ejercicioextra4 {

    public static void main(String[] args) {
        
        // 4. Sistema Gestión Facultad. Se pretende realizar una aplicación para una facultad 
        // que gestione la información sobre las personas vinculadas con la misma y que se 
        // pueden clasificar en tres tipos: estudiantes, profesores y personal de servicio. 
        // A continuación, se detalla qué tipo de información debe gestionar esta aplicación:
        //
        // a) Por cada persona, se debe conocer, al menos, su nombre y apellidos, su número 
        // de identificación y su estado civil.  
        // b) Con respecto a los empleados, sean del tipo que sean, hay que saber su año de incorporación 
        // a la facultad y qué número de despacho tienen asignado.  
        // c) En cuanto a los estudiantes, se requiere almacenar el curso en el que están matriculados. 
        // d) Por lo que se refiere a los profesores, es necesario gestionar a qué departamento pertenecen 
        // (lenguajes, matemáticas, arquitectura, ...).  
        // e) Sobre el personal de servicio, hay que conocer a qué sección están asignados (biblioteca, 
        // decanato, secretaría, ...). 
        //
        // El ejercicio consiste, en primer lugar, en definir la jerarquía de clases de esta aplicación. 
        // A continuación, debe programar las clases definidas en las que, además de los constructores, 
        // hay que desarrollar los métodos correspondientes a las siguientes operaciones:
        //
        // a) Cambio del estado civil de una persona.  
        // b) Reasignación de despacho a un empleado.  
        // c) Matriculación de un estudiante en un nuevo curso.  
        // d) Cambio de departamento de un profesor.  
        // e) Traslado de sección de un empleado del personal de servicio.  
        // f) Imprimir toda la información de cada tipo de individuo. Incluya un programa de prueba que 
        // instancie objetos de los distintos tipos y pruebe los métodos desarrollados. 
        
        Estudiante estudiante = new Estudiante(Carrera.ABOGACIA, "Leandro", "Deferrari", 23567, EstadoCivil.CASADO);
        estudiante.cambiarCarrera(estudiante);
        
        System.out.println();
        
        Profesor profesor = new Profesor(Departamento.DERECHO, 2013, 7, "Roberto", "Jirafales", 1356, EstadoCivil.CASADO);
        profesor.cambiarDepartamento(profesor);
        
        System.out.println();
        
        PersonalDeServicio personal = new PersonalDeServicio(Seccion.SECRETARIA, 2017, 45, "Raul", "Ibañes", 456704, EstadoCivil.CASADO);
        personal.cambiarSeccion(personal);
        
        Set<Estudiante> listaDeEstudiantes = new HashSet<>();
        
        listaDeEstudiantes.add(estudiante);
        
        Set<Empleado> listaDeEmpleados = new HashSet<>();
        
        listaDeEmpleados.add(personal);
        listaDeEmpleados.add(profesor);
        
        Facultad facultad = new Facultad(listaDeEmpleados, listaDeEstudiantes);
        
        System.out.println(facultad);
        
    }

}
