package pabloGalindo.tp01.ejercicio1;

public class TestListaDeEnterosEnlazada {

    public static void main(String[] args){

        ListaDeEnterosEnlazada lista = new ListaDeEnterosEnlazada();
        lista.agregarFinal(1);
        lista.agregarFinal(2);
        lista.agregarFinal(3);
        lista.agregarFinal(4);
        lista.agregarFinal(5);

        System.out.println("Elementos de la lista:");
        for (int i = 1; i <= lista.tamanio(); i++) {
            System.out.println(lista.elemento(i));
        }

        System.out.println("Elementos de la lista:");
        new ImprimirRecursivo().imprimir(lista);
    }
}
