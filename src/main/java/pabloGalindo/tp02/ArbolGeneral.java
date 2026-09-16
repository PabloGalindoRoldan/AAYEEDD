package pabloGalindo.tp02;

import pabloGalindo.tp01.ejercicio2.ListaEnlazadaGenerica;
import pabloGalindo.tp01.ejercicio2.ListaGenerica;
import pabloGalindo.tp01.ejercicio3.ColaGenerica;

public class ArbolGeneral<T> {
    private T dato;
    private ListaGenerica<ArbolGeneral<T>> hijos = new ListaEnlazadaGenerica<ArbolGeneral<T>>();

    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    public void setHijos(ListaGenerica<ArbolGeneral<T>> hijos) {
        if (hijos == null)
            this.hijos = new ListaEnlazadaGenerica<ArbolGeneral<T>>();
        else
            this.hijos = hijos;
    }

    public ArbolGeneral(T dato) {
        this.dato = dato;
    }

    public ArbolGeneral(T dato, ListaGenerica<ArbolGeneral<T>> hijos) {
        this(dato);
        if (hijos == null)
            this.hijos = new ListaEnlazadaGenerica<ArbolGeneral<T>>();
        else
            this.hijos = hijos;
    }

    public ListaGenerica<ArbolGeneral<T>> getHijos() {
        return this.hijos;
    }

    public void agregarHijo(ArbolGeneral<T> unHijo) {

        this.getHijos().agregarFinal(unHijo);
    }

    public boolean esHoja() {

        return !this.tieneHijos();
    }

    public boolean tieneHijos() {
        return !this.hijos.esVacia();
    }

    public boolean esVacio() {

        return this.dato == null && !this.tieneHijos();
    }


    public void eliminarHijo(ArbolGeneral<T> hijo) {
        if (this.tieneHijos()) {
            ListaGenerica<ArbolGeneral<T>> hijos = this.getHijos();
            if (hijos.incluye(hijo))
                hijos.eliminar(hijo);
        }
    }

    public ListaEnlazadaGenerica<T> preOrden() {
        ListaEnlazadaGenerica<T> resultado = new ListaEnlazadaGenerica<>();
        this.preOrdenRecursivo(resultado);
        return resultado;
    }

    private void preOrdenRecursivo(ListaEnlazadaGenerica<T> lista) {
        lista.agregarFinal(this.getDato());

        if (this.tieneHijos()) {
            ListaGenerica<ArbolGeneral<T>> lHijos = this.getHijos();
            lHijos.comenzar();
            while (!lHijos.fin()) {
                ArbolGeneral<T> hijoActual = lHijos.proximo();
                hijoActual.preOrdenRecursivo(lista);
            }
        }
    }

    public ListaEnlazadaGenerica<T> postOrden() {
        ListaEnlazadaGenerica<T> resultado = new ListaEnlazadaGenerica<>();
        this.postOrdenRecursivo(resultado);
        return resultado;
    }

    private void postOrdenRecursivo(ListaEnlazadaGenerica<T> lista) {
        if (this.tieneHijos()) {
            ListaGenerica<ArbolGeneral<T>> lHijos = this.getHijos();
            lHijos.comenzar();
            while (!lHijos.fin()) {
                ArbolGeneral<T> hijoActual = lHijos.proximo();
                hijoActual.postOrdenRecursivo(lista);
            }
        }
        lista.agregarFinal(this.getDato());
    }

    public ListaEnlazadaGenerica<T> inOrden() {
        return null;
    }

    public Integer altura() {
        if (this.esVacio()) {
            return 0;
        }
        return this.alturaRecursiva(0);
    }

    private Integer alturaRecursiva(int nivel) {
        if (this.esHoja()) {
            return nivel;
        }

        int max = nivel;

        ListaGenerica<ArbolGeneral<T>> hijos = this.getHijos();
        hijos.comenzar();
        while (!hijos.fin()) {
            ArbolGeneral<T> hijoActual = hijos.proximo();
            int alturaHijo = hijoActual.alturaRecursiva(nivel + 1);
            if (alturaHijo > max) {
                max = alturaHijo;
            }
        }
        return max;
    }

    public Integer ancho() {
        if (this.esVacio()) {
            return 0;
        }

        int maxAncho = 0;

        ColaGenerica<ArbolGeneral<T>> cola = new ColaGenerica<>();
        cola.encolar(this);

        while (!cola.esVacia()) {
            int cantNodosNivel = cola.tamanio();

            if (cantNodosNivel > maxAncho) {
                maxAncho = cantNodosNivel;
            }

            for (int i = 0; i < cantNodosNivel; i++) {
                ArbolGeneral<T> actual = cola.desencolar();

                if (actual.tieneHijos()) {
                    ListaGenerica<ArbolGeneral<T>> lhijos = actual.getHijos();
                    lhijos.comenzar();
                    while (!lhijos.fin()) {
                        cola.encolar(lhijos.proximo());
                    }
                }
            }
        }

        return maxAncho;
    }

    public Integer nivel(T dato) {
        if (this.esVacio() || dato == null) {
            return -1; // Caso base o dato inválido
        }
        return this.nivelRecursivo(dato, 0);
    }

    private int nivelRecursivo(T dato, int nivelActual) {
        if (this.getDato() != null && this.getDato().equals(dato)) {
            return nivelActual;
        }

        if (this.tieneHijos()) {
            ListaGenerica<ArbolGeneral<T>> lhijos = this.getHijos();
            lhijos.comenzar();
            while (!lhijos.fin()) {
                ArbolGeneral<T> hijoActual = lhijos.proximo();

                int res = hijoActual.nivelRecursivo(dato, nivelActual + 1);

                // Si lo encontró en alguna rama del hijo, retornamos el resultado hacia arriba
                if (res != -1) {
                    return res;
                }
            }
        }


        return -1;
    }
}