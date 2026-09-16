package pabloGalindo.tp03.ejercicio3;

import pabloGalindo.tp01.ejercicio2.ListaEnlazadaGenerica;
import pabloGalindo.tp03.ArbolBinario;

public class ContadorArbol {
    private ArbolBinario<Integer> arbol;

    public ContadorArbol(ArbolBinario<Integer> arbol) {
        this.arbol = arbol;
    }

    public ListaEnlazadaGenerica<Integer> numerosParesInOrder() {
        ListaEnlazadaGenerica<Integer> lista = new ListaEnlazadaGenerica<>();
        lista.comenzar();
        numerosParesInOrderRecursivo(lista, this.arbol);
        return lista;
    }

    private void numerosParesInOrderRecursivo(ListaEnlazadaGenerica<Integer> lista, ArbolBinario<Integer> arbol) {
        if (arbol == null) return;
        numerosParesInOrderRecursivo(lista, arbol.getHijoIzquierdo());
        if (arbol.getDato() % 2 == 0) {
            lista.agregarFinal(arbol.getDato());
        }
        numerosParesInOrderRecursivo(lista, arbol.getHijoDerecho());
    }

    public ListaEnlazadaGenerica<Integer> numerosParesPostOrder() {
        ListaEnlazadaGenerica<Integer> lista = new ListaEnlazadaGenerica<>();
        lista.comenzar();
        numerosParesPostOrderRecursivo(lista, this.arbol);
        return lista;
    }

    private void numerosParesPostOrderRecursivo(ListaEnlazadaGenerica<Integer> lista, ArbolBinario<Integer> arbol) {
        if (arbol == null) return;
        numerosParesPostOrderRecursivo(lista, arbol.getHijoIzquierdo());
        numerosParesPostOrderRecursivo(lista, arbol.getHijoDerecho());
        if (arbol.getDato() % 2 == 0) {
            lista.agregarFinal(arbol.getDato());
        }
    }

}
