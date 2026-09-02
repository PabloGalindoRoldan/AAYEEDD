package pabloGalindo.tp02.ejercicio3;

import pabloGalindo.tp02.ArbolGeneral;
import pabloGalindo.tp01.ejercicio2.ListaGenerica;

public class RecorridosAGTest {
    public static void main(String[] args) {

        // ==========================================
        // TEST DE ALGORITMOS DEL EJ 3
        // ==========================================

        // ==========================================
        // ARBOL DE INTEGERS
        // ==========================================

        // Nivel 0 (Raiz)
        ArbolGeneral<Integer> n1 = new ArbolGeneral<>(1);

        // Nivel 1 (Hijos de 1)
        ArbolGeneral<Integer> n2 = new ArbolGeneral<>(2);
        ArbolGeneral<Integer> n3 = new ArbolGeneral<>(3);
        ArbolGeneral<Integer> n4 = new ArbolGeneral<>(4);
        n1.agregarHijo(n2);
        n1.agregarHijo(n3);
        n1.agregarHijo(n4);

        // Nivel 2 (Hijos de 2, 3 y 4)
        ArbolGeneral<Integer> n5 = new ArbolGeneral<>(5);
        ArbolGeneral<Integer> n6 = new ArbolGeneral<>(6);
        n2.agregarHijo(n5);
        n2.agregarHijo(n6);

        ArbolGeneral<Integer> n7 = new ArbolGeneral<>(7);
        ArbolGeneral<Integer> n8 = new ArbolGeneral<>(8);
        ArbolGeneral<Integer> n9 = new ArbolGeneral<>(9);
        n3.agregarHijo(n7);
        n3.agregarHijo(n8);
        n3.agregarHijo(n9);

        ArbolGeneral<Integer> n10 = new ArbolGeneral<>(10);
        n4.agregarHijo(n10);

        // Nivel 3
        ArbolGeneral<Integer> n11 = new ArbolGeneral<>(11);
        ArbolGeneral<Integer> n12 = new ArbolGeneral<>(12);
        n5.agregarHijo(n11);
        n5.agregarHijo(n12);

        ArbolGeneral<Integer> n13 = new ArbolGeneral<>(13);
        n6.agregarHijo(n13);

        ArbolGeneral<Integer> n14 = new ArbolGeneral<>(14);
        ArbolGeneral<Integer> n15 = new ArbolGeneral<>(15);
        n7.agregarHijo(n14);
        n7.agregarHijo(n15);

        ArbolGeneral<Integer> n16 = new ArbolGeneral<>(16);
        n8.agregarHijo(n16);

        ArbolGeneral<Integer> n17 = new ArbolGeneral<>(17);
        ArbolGeneral<Integer> n18 = new ArbolGeneral<>(18);
        ArbolGeneral<Integer> n19 = new ArbolGeneral<>(19);
        n9.agregarHijo(n17);
        n9.agregarHijo(n18);
        n9.agregarHijo(n19);

        ArbolGeneral<Integer> n20 = new ArbolGeneral<>(20);
        n10.agregarHijo(n20);

        // Nivel 4
        ArbolGeneral<Integer> n21 = new ArbolGeneral<>(21);
        ArbolGeneral<Integer> n22 = new ArbolGeneral<>(22);
        n11.agregarHijo(n21);
        n11.agregarHijo(n22);

        ArbolGeneral<Integer> n23 = new ArbolGeneral<>(23);
        n13.agregarHijo(n23);

        ArbolGeneral<Integer> n24 = new ArbolGeneral<>(24);
        ArbolGeneral<Integer> n25 = new ArbolGeneral<>(25);
        n15.agregarHijo(n24);
        n15.agregarHijo(n25);

        ArbolGeneral<Integer> n26 = new ArbolGeneral<>(26);
        n17.agregarHijo(n26);

        ArbolGeneral<Integer> n27 = new ArbolGeneral<>(27);
        ArbolGeneral<Integer> n28 = new ArbolGeneral<>(28);
        n19.agregarHijo(n27);
        n19.agregarHijo(n28);

        ArbolGeneral<Integer> n29 = new ArbolGeneral<>(29);
        ArbolGeneral<Integer> n30 = new ArbolGeneral<>(30);
        n20.agregarHijo(n29);
        n20.agregarHijo(n30);


        // ==========================================
        // PRUEBAS DE PREORDEN
        // ==========================================
        RecorridosAG test = new RecorridosAG();
        int n = 10;

        System.out.println("=== IMPARES MAYORES QUE " + n + " ===");

        // --- PREORDEN IMPARES MAYORES QUE N---
        System.out.print("\nPreOrden impares mayores que " + n + ": \n");
        ListaGenerica<Integer> preOrden = test.numerosImparesMayoresQuePreOrden(n1, n);
        preOrden.tusDatos();

        // --- POSTORDEN IMPARES MAYORES QUE N---
        System.out.print("\nPostOrden impares mayores que " + n + ": \n");
        ListaGenerica<Integer> postOrden = test.numerosImparesMayoresQuePostOrden(n1, n);
        postOrden.tusDatos();

        // --- POR NIVELES IMPARES MAYORES QUE N---
        System.out.print("\nPorNiveles impares mayores que " + n + ": \n");
        ListaGenerica<Integer> porNivel = test.numerosImparesMayoresQuePorNiveles(n1, n);
        porNivel.tusDatos();
    }

}