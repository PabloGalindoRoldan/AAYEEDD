package pabloGalindo.tp03.ejercicio4;

import pabloGalindo.tp03.ArbolBinario;

public class RedBinariaLlenaTest {

    public static void main(String[] args) {
        // Armamos un árbol de 3 niveles (raíz, 2 hijos, 4 nietos)
        // Estructura:
        //          10 (Raíz)
        //        /    \
        //       5      7
        //      / \    / \
        //     1   3  8   2

        ArbolBinario<Integer> raiz = new ArbolBinario<>(10);

        ArbolBinario<Integer> izq = new ArbolBinario<>(5);
        izq.agregarHijoIzquierdo(new ArbolBinario<>(1));
        izq.agregarHijoDerecho(new ArbolBinario<>(3));

        ArbolBinario<Integer> der = new ArbolBinario<>(7);
        der.agregarHijoIzquierdo(new ArbolBinario<>(8));
        der.agregarHijoDerecho(new ArbolBinario<>(2));

        raiz.agregarHijoIzquierdo(izq);
        raiz.agregarHijoDerecho(der);

        RedBinariaLlena red = new RedBinariaLlena(raiz);

        System.out.println("El retardo máximo de reenvío esperado es 25 ");
        System.out.println("El retardo máximo de reenvío es: " + red.retardoReenvio());
    }
}