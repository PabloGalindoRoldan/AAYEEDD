package pabloGalindo.tp01.ejercicio3;
import pabloGalindo.tp01.ejercicio2.Estudiante;

public class TestPilaGenerica {

    public static void main (String[] args){

        Estudiante estudiante1 = new Estudiante("Juan", "Pérez",  "12345678");
        Estudiante estudiante2 = new Estudiante("María", "Gómez",  "87654321");
        Estudiante estudiante3 = new Estudiante("Pedro", "López",  "56781234");
        Estudiante estudiante4 = new Estudiante("Ana", "Martínez",  "43218765");

        PilaGenerica<Estudiante> pila = new PilaGenerica<Estudiante>();

        pila.apilar(estudiante1);
        pila.apilar(estudiante2);
        pila.apilar(estudiante3);
        pila.apilar(estudiante4);

        System.out.println("Apilamos los estudiantes e imprimimos:");
        pila.tusDatos();
        System.out.println("\n");

        //----------

        System.out.println("Desapilamos 2 de los estudiantes e imprimimos:");
        pila.desapilar();
        pila.desapilar();

        pila.tusDatos();
        System.out.println("\n");

        //----------

        System.out.println("Ahora imprimimos tope:");
        System.out.println(pila.tope());
        System.out.println("\n");

        //----------
    }
}
