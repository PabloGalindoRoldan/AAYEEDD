package pabloGalindo.tp03;

import pabloGalindo.tp01.ejercicio3.ColaGenerica;


public class ArbolBinario<T> {
    private T dato;
    private ArbolBinario<T> hijoIzquierdo;
    private ArbolBinario<T> hijoDerecho;


    public ArbolBinario() {
        super();
    }

    public ArbolBinario(T dato) {
        this.dato = dato;
    }

    /*
     * getters y setters
     *
     */
    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    /**
     * Preguntar antes de invocar si tieneHijoIzquierdo()
     *
     * @return
     */
    public ArbolBinario<T> getHijoIzquierdo() {
        return this.hijoIzquierdo;
    }

    public ArbolBinario<T> getHijoDerecho() {
        return this.hijoDerecho;

    }

    public void agregarHijoIzquierdo(ArbolBinario<T> hijo) {
        this.hijoIzquierdo = hijo;
    }

    public void agregarHijoDerecho(ArbolBinario<T> hijo) {
        this.hijoDerecho = hijo;
    }

    public void eliminarHijoIzquierdo() {
        this.hijoIzquierdo = null;
    }

    public void eliminarHijoDerecho() {
        this.hijoDerecho = null;
    }

    public boolean esVacio() {
        return this.getDato() == null && !this.tieneHijoIzquierdo() && !this.tieneHijoDerecho();
    }

    public boolean esHoja() {
        return (!this.tieneHijoIzquierdo() && !this.tieneHijoDerecho());

    }

    @Override
    public String toString() {
        return this.getDato().toString();
    }


    public boolean tieneHijoIzquierdo() {
        return this.hijoIzquierdo != null;
    }


    public boolean tieneHijoDerecho() {
        return this.hijoDerecho != null;
    }

    public int contarHojas() {
        //contar hojas... tengo que hacer un algoritmo que llegue a las hojas con un inOrder por ejemplo y ver si no tiene hijo izq y der, contar
        return contarHojasRecursivo(this);
    }

    private int contarHojasRecursivo(ArbolBinario<T> hijo) {
        if (hijo == null) {
            return 0;
        }

        if (hijo.getHijoIzquierdo() == null && hijo.getHijoDerecho() == null) {
            return 1;
        }

        return contarHojasRecursivo(hijo.getHijoIzquierdo()) + contarHojasRecursivo(hijo.getHijoDerecho());
    }

    public ArbolBinario<T> espejo() {
        //este ejercicio entonces retorna un arbol binario nuevo, recorre recursivamente en un preorder, y toma los valores del hijo izq e hijo derecho y lo agrega a otro arbol invertid

        if (this.esVacio()) {
            return new ArbolBinario<T>();
        }

        ArbolBinario<T> resultado = new ArbolBinario<T>(this.getDato());

        if (this.tieneHijoDerecho()) {
            resultado.agregarHijoIzquierdo(this.getHijoDerecho().espejo());
        }

        if (this.tieneHijoIzquierdo()) {
            resultado.agregarHijoDerecho(this.getHijoIzquierdo().espejo());
        }

        return resultado;

    }

    public void print() {
        printArbol(this);
    }

    private void printArbol(ArbolBinario<T> nodo) {
        if (nodo == null) {
            return;
        }
        System.out.println(nodo.getDato());
        printArbol(nodo.getHijoIzquierdo());
        printArbol(nodo.getHijoDerecho());

    }


    public void entreNiveles(int n, int m) {
        ColaGenerica<ArbolBinario<T>> cola = new ColaGenerica<>();
        cola.encolar(this);
        int nivel = 0;

        while (!cola.esVacia() && nivel <= m) {
            int tamanioNivel = cola.tamanio();

            for (int i = 0; i < tamanioNivel; i++) {
                ArbolBinario<T> actual = cola.desencolar();

                if (nivel >= n) {
                    System.out.println(actual.getDato());
                }
                if (actual.tieneHijoIzquierdo()) {
                    cola.encolar(actual.getHijoIzquierdo());
                }
                if (actual.tieneHijoDerecho()) {
                    cola.encolar(actual.getHijoDerecho());
                }
            }
            nivel++;
        }

    }

}
