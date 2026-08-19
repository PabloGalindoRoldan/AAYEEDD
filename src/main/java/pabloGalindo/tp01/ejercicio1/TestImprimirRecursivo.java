package pabloGalindo.tp01.ejercicio1;

public class TestImprimirRecursivo {

    public static void main(String[] args){

        ListaDeEnterosEnlazada lista = new ListaDeEnterosEnlazada();
        lista.agregarFinal(1);
        lista.agregarFinal(2);
        lista.agregarFinal(3);
        lista.agregarFinal(4);
        lista.agregarFinal(5);

        System.out.println("Elementos de la lista:");
        new ImprimirRecursivo().imprimir(lista);
    }
}
