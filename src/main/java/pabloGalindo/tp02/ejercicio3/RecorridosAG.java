package pabloGalindo.tp02.ejercicio3;

import pabloGalindo.tp01.ejercicio2.ListaEnlazadaGenerica;
import pabloGalindo.tp02.ArbolGeneral;
import pabloGalindo.tp01.ejercicio2.ListaGenerica;
import pabloGalindo.tp01.ejercicio3.ColaGenerica;

public class RecorridosAG {

    public ListaGenerica<Integer> numerosImparesMayoresQuePreOrden(ArbolGeneral<Integer> a, Integer n) {
        ListaGenerica<Integer> res = new ListaEnlazadaGenerica<>();
        preOrdenRecursivo(a, n, res);
        return res;
    }

    private void preOrdenRecursivo(ArbolGeneral<Integer> a, Integer n, ListaGenerica<Integer> lista) {
        //calc impar y mayor a n
        if (a.getDato() % 2 != 0 && a.getDato() > n) {
            lista.agregarFinal(a.getDato());
        }
        if (a.tieneHijos()) {
            ListaGenerica<ArbolGeneral<Integer>> lHijos = a.getHijos();
            lHijos.comenzar();
            while (!lHijos.fin()) {
                ArbolGeneral<Integer> hijoActual = lHijos.proximo();
                preOrdenRecursivo(hijoActual, n, lista);
            }
        }
    }


    public ListaGenerica<Integer> numerosImparesMayoresQueInOrden(ArbolGeneral<Integer> a, Integer n) {
        ListaGenerica<Integer> res = new ListaEnlazadaGenerica<>();
        inOrdenRecursivo(a, n, res);
        return res;
    }

    private void inOrdenRecursivo(ArbolGeneral<Integer> a, Integer n, ListaGenerica<Integer> lista) {
        if (a.tieneHijos()) {
            ListaGenerica<ArbolGeneral<Integer>> lHijos = a.getHijos();
            lHijos.comenzar();
            //busco el primer hijo:
            ArbolGeneral<Integer> primerHijo = lHijos.proximo();
            //itero sobre el primer hijo como si fuera la izq
            inOrdenRecursivo(primerHijo, n, lista);
            //proceso el dato
            if (a.getDato() % 2 != 0 && a.getDato() > n) {
                lista.agregarFinal(a.getDato());
            }
            //sigo con resto de hijos
            while (!lHijos.fin()) {
                ArbolGeneral<Integer> hijoActual = lHijos.proximo();
                inOrdenRecursivo(hijoActual, n, lista);
            }
        } else {
            // CASO BASE: Si es una hoja, se evalúa su dato directamente
            if (a.getDato() % 2 != 0 && a.getDato() > n) {
                lista.agregarFinal(a.getDato());
            }
        }


    }

    public ListaGenerica<Integer> numerosImparesMayoresQuePostOrden(ArbolGeneral<Integer> a, Integer n) {
        ListaGenerica<Integer> res = new ListaEnlazadaGenerica<>();
        postOrdenRecursivo(a, n, res);
        return res;
    }

    private void postOrdenRecursivo(ArbolGeneral<Integer> a, Integer n, ListaGenerica<Integer> lista) {
        if (a.tieneHijos()) {
            ListaGenerica<ArbolGeneral<Integer>> lHijos = a.getHijos();
            lHijos.comenzar();
            while (!lHijos.fin()) {
                ArbolGeneral<Integer> hijoActual = lHijos.proximo();
                postOrdenRecursivo(hijoActual, n, lista);
            }
        }
        if (a.getDato() % 2 != 0 && a.getDato() > n) {
            lista.agregarFinal(a.getDato());
        }
    }

    public ListaGenerica<Integer> numerosImparesMayoresQuePorNiveles(ArbolGeneral<Integer> a, Integer n) {
        ListaGenerica<Integer> res = new ListaEnlazadaGenerica<>();

        if (a != null && !a.esVacio()) {
            ColaGenerica<ArbolGeneral<Integer>> cola = new ColaGenerica<>();

            cola.encolar(a);

            while (!cola.esVacia()) {
                ArbolGeneral<Integer> actual = cola.desencolar();

                if (actual.getDato() % 2 != 0 && actual.getDato() > n) {
                    res.agregarFinal(actual.getDato());
                }

                if (actual.tieneHijos()) {
                    ListaGenerica<ArbolGeneral<Integer>> lHijos = actual.getHijos();
                    lHijos.comenzar();
                    while (!lHijos.fin()) {
                        cola.encolar(lHijos.proximo());
                    }
                }
            }

        }

        return res;
    }

}
