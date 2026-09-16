package pabloGalindo.tp03;

public class ArbolBinarioTest {

    public static void main(String[] args) {
        // 1. Crear las hojas (nodos sin hijos)
        ArbolBinario<Integer> nodo3 = new ArbolBinario<>(3);
        ArbolBinario<Integer> nodo8 = new ArbolBinario<>(8);
        ArbolBinario<Integer> nodo20 = new ArbolBinario<>(20);

        // 2. Crear los nodos intermedios y conectar las hojas
        ArbolBinario<Integer> nodo5 = new ArbolBinario<>(5);
        nodo5.agregarHijoIzquierdo(nodo3);
        nodo5.agregarHijoDerecho(nodo8);

        ArbolBinario<Integer> nodo15 = new ArbolBinario<>(15);
        nodo15.agregarHijoDerecho(nodo20);

        // 3. Crear la raíz y armar el árbol completo
        ArbolBinario<Integer> arbol = new ArbolBinario<>(10);
        arbol.agregarHijoIzquierdo(nodo5);
        arbol.agregarHijoDerecho(nodo15);

        // 4. Ejecutar la prueba de hojas
        int totalHojas = arbol.contarHojas();

        System.out.println("--- PRUEBA CONTAR HOJAS ---");
        System.out.println("Hojas contadas: " + totalHojas);
        System.out.println("Esperado: 3");

        if (totalHojas == 3) {
            System.out.println("✅ ¡El algoritmo funciona correctamente!");
        } else {
            System.out.println("❌ Algo falló en la cuenta.");
        }

        //5. ejecutar la prueba de espejo:
        System.out.println("--- PRUEBA ESPEJO ---");
        System.out.println("ARBOL ORIGINAL:");
        arbol.print();
        System.out.println();
        System.out.println("ARBOL ESPEJO:");
        arbol.espejo().print();

        //6. Prueba entre niveles;

        System.out.println();
        System.out.println("--- PRUEBA ENTRE NIVELES 0 Y 2 ---");
        arbol.entreNiveles(0, 2);
        System.out.println();
        System.out.println("--- PRUEBA ENTRE NIVELES 0 Y 1 ---");
        arbol.entreNiveles(0, 1);

    }
}