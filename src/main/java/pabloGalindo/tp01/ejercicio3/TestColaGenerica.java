package pabloGalindo.tp01.ejercicio3;

import pabloGalindo.tp01.ejercicio2.Estudiante;

public class TestColaGenerica {

    public static void main (String[] args){

        Estudiante estudiante1 = new Estudiante("Juan", "Pérez",  "12345678");
        Estudiante estudiante2 = new Estudiante("María", "Gómez",  "87654321");
        Estudiante estudiante3 = new Estudiante("Pedro", "López",  "56781234");
        Estudiante estudiante4 = new Estudiante("Ana", "Martínez",  "43218765");

        ColaGenerica<Estudiante> cola = new ColaGenerica<Estudiante>();

        cola.encolar(estudiante1);
        cola.encolar(estudiante2);
        cola.encolar(estudiante3);
        cola.encolar(estudiante4);

        System.out.println("Encolamos los estudiantes e imprimimos:");
        cola.tusDatos();
        System.out.println("\n");

        //----------

        System.out.println("Desencolamos 2 de los estudiantes e imprimimos:");
        cola.desencolar();
        cola.desencolar();

        cola.tusDatos();
        System.out.println("\n");

        //----------

        System.out.println("Ahora imprimimos tope:");
        cola.tope();
        System.out.println("\n");

        //----------
    }



}
