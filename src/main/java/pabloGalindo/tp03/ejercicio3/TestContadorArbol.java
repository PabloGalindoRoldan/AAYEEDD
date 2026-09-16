package pabloGalindo.tp03.ejercicio3;

import pabloGalindo.tp01.ejercicio2.ListaEnlazadaGenerica;
import pabloGalindo.tp03.ArbolBinario;

public class TestContadorArbol {
    public static void main(String[] args) {
        // 1. Nodos hoja
        ArbolBinario<Integer> nodo2 = new ArbolBinario<>(2);
        ArbolBinario<Integer> nodo4 = new ArbolBinario<>(4);
        ArbolBinario<Integer> nodo6 = new ArbolBinario<>(6);

        // 2. Nodos intermedios
        ArbolBinario<Integer> nodo7 = new ArbolBinario<>(7);
        nodo7.agregarHijoIzquierdo(nodo2);
        nodo7.agregarHijoDerecho(nodo4);

        ArbolBinario<Integer> nodo14 = new ArbolBinario<>(14);
        nodo14.agregarHijoIzquierdo(nodo6);

        // 3. Raíz del árbol
        ArbolBinario<Integer> arbol = new ArbolBinario<>(10);
        arbol.agregarHijoIzquierdo(nodo7);
        arbol.agregarHijoDerecho(nodo14);

        // 4. Instanciar el contador
        ContadorArbol contador = new ContadorArbol(arbol);

        // 5. Probar InOrder
        System.out.println("--- PARES IN-ORDER ---");
        System.out.println("Esperado: 2 -> 4 -> 10 -> 6 -> 14");
        System.out.print("Obtenido: ");
        imprimirLista(contador.numerosParesInOrder());

        System.out.println();

        // 6. Probar PostOrder
        System.out.println("--- PARES POST-ORDER ---");
        System.out.println("Esperado: 2 -> 4 -> 6 -> 14 -> 10");
        System.out.print("Obtenido: ");
        imprimirLista(contador.numerosParesPostOrder());
    }

    private static void imprimirLista(ListaEnlazadaGenerica<Integer> lista) {
        lista.comenzar();
        while (!lista.fin()) {
            System.out.print(lista.proximo() + " ");
        }
        System.out.println();
    }
}