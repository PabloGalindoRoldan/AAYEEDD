package pabloGalindo.tp01.ejercicio3;

import pabloGalindo.tp01.ejercicio2.ListaEnlazadaGenerica;
import pabloGalindo.tp01.ejercicio2.ListaGenerica;

public class ColaGenerica<T> {

    private ListaGenerica<T> lista;

    public ColaGenerica(){
        this.lista = new ListaEnlazadaGenerica<T>();
    }

    public void encolar(T elem){
        lista.agregarFinal(elem);
    }

    public void desencolar(){
        lista.eliminarEn(1);
    }

    public void tope(){
        System.out.println(lista.elemento(1));
    }

    public boolean esVacia(){
        return lista.esVacia();
    }

    public void tusDatos(){
        lista.tusDatos();
    }

}
