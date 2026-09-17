package pabloGalindo.tp03.ejercicio4;

import pabloGalindo.tp03.ArbolBinario;

public class RedBinariaLlena {
    private ArbolBinario<Integer> arbol;

    public RedBinariaLlena(ArbolBinario<Integer> arbol) {
        this.arbol = arbol;
    }

    public int retardoReenvio() {
        if (this.arbol == null || this.arbol.getDato() == null || this.arbol.esVacio()) {
            return 0;
        }
        return retardoRecursivo(this.arbol);
    }

    public int retardoRecursivo(ArbolBinario<Integer> arbol) {
        if (arbol == null || arbol.esVacio()) {
            return 0;
        }

        int hijoIzq = 0;
        int hijoDer = 0;

        if (arbol.tieneHijoIzquierdo()) {
            hijoIzq = retardoRecursivo(arbol.getHijoIzquierdo());
        }
        if (arbol.tieneHijoDerecho()) {
            hijoDer = retardoRecursivo(arbol.getHijoDerecho());
        }
        return (hijoIzq > hijoDer ? hijoIzq : hijoDer) + arbol.getDato();
    }
}
