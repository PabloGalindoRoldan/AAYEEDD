package pabloGalindo.tp01.ejercicio3;

import pabloGalindo.tp01.ejercicio2.ListaGenerica;
import pabloGalindo.tp01.ejercicio2.ListaEnlazadaGenerica;

public class PilaGenerica<T> {
    private ListaGenerica<T> lista;

    public PilaGenerica() {
        this.lista = new ListaEnlazadaGenerica<T>();
    }

    public void apilar(T elem) {
        lista.agregarFinal(elem);
    }

    public T desapilar() {
        T nodo = lista.elemento(lista.tamanio());
        lista.eliminarEn(lista.tamanio());
        return nodo;
    }

    public T tope() {
        return lista.elemento(lista.tamanio());
    }

    public boolean esVacia() {
        return lista.esVacia();
    }

    public void tusDatos() {
        lista.tusDatos();
    }

}
