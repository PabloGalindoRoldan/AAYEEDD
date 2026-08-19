package pabloGalindo.tp01.ejercicio1;

public class ImprimirRecursivo {

    public void imprimir(ListaDeEnteros lista) {
        imprimirAux(lista, 1);
    }

    private void imprimirAux(ListaDeEnteros lista, int pos) {
        if (pos > lista.tamanio()) {
            return;
        }

        imprimirAux(lista, pos + 1);
        System.out.println(lista.elemento(pos));
    }
}
