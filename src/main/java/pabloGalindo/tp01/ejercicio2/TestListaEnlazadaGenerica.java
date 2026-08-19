package pabloGalindo.tp01.ejercicio2;

import java.util.ArrayList;

public class TestListaEnlazadaGenerica {

    public static void main (String[] args){

        ListaEnlazadaGenerica<Estudiante> lista = new ListaEnlazadaGenerica<>();

        lista.agregarFinal(new Estudiante("Juan", "Perez", "12345"));
        lista.agregarFinal(new Estudiante("Maria", "Gomez", "67890"));
        lista.agregarFinal(new Estudiante( "Pedro", "Gonzalez", "54321"));
        lista.agregarFinal(new Estudiante("Ana", "Lopez", "98765"));

        lista.tusDatos();

        Estudiante estudiante1 = new Estudiante("Luis", "Martinez", "11111");
        Estudiante estudiante2 = new Estudiante("Laura", "Rodriguez", "22222");
        Estudiante estudiante3 = new Estudiante("Carlos", "Sanchez", "33333");
        Estudiante estudiante4 = new Estudiante("Sofia", "Ramirez", "44444");

        Estudiante [] arreglo = new Estudiante [] {estudiante1, estudiante2, estudiante3, estudiante4};

        ListaEnlazadaGenerica<Estudiante> lista2 = new ListaEnlazadaGenerica<>();

        System.out.println("\n\nElemento en posicion 3:");
        System.out.println(lista.elemento(3));

        System.out.println("\n\nProbando agregar(T[]):");
        System.out.println(lista2.agregar(arreglo));
        lista2.tusDatos();

    }
}
