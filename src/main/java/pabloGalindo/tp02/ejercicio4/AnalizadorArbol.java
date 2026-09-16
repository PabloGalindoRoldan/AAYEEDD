package pabloGalindo.tp02.ejercicio4;

import pabloGalindo.tp02.ArbolGeneral;
import pabloGalindo.tp01.ejercicio2.ListaEnlazadaGenerica;
import pabloGalindo.tp01.ejercicio2.ListaGenerica;
import pabloGalindo.tp01.ejercicio3.ColaGenerica;

public class AnalizadorArbol {

    public double devolverMaximoPromedio(ArbolGeneral<AreaEmpresa> arbol) {
        //handler de casos limite
        if (arbol == null || arbol.esVacio()) {
            return 0;
        }

        //variable donde guardo el maximo
        AreaEmpresa init = arbol.getDato();
        //lo inicializo con el dato de la raiz;
        double max = init.getTardanza();

        //creo la cola para iterar por niveles
        ColaGenerica<ArbolGeneral<AreaEmpresa>> cola = new ColaGenerica<>();

        //encolo la raiz;
        cola.encolar(arbol);

        //ciclo iterativo
        while (!cola.esVacia()) {

            //genero las variables para calcular el promedio
            int cantNodosNivel = cola.tamanio(); //agregue este metodo a las colas;
            double sumaNivel = 0;

            for (int i = 0; i < cantNodosNivel; i++) {
                ArbolGeneral<AreaEmpresa> actual = cola.desencolar();
                sumaNivel += actual.getDato().getTardanza();

                if (actual.tieneHijos()) {
                    ListaGenerica<ArbolGeneral<AreaEmpresa>> lhijos = actual.getHijos();
                    lhijos.comenzar();
                    while (!lhijos.fin()) {
                        cola.encolar(lhijos.proximo());
                    }
                }
            }
            double promedio = sumaNivel / cantNodosNivel;

            if (promedio > max) {
                max = promedio;
            }

        }

        return max;
    }
}
