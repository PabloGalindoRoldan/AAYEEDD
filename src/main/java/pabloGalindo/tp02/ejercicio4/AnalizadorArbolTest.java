package pabloGalindo.tp02.ejercicio4;

import pabloGalindo.tp02.ArbolGeneral;

public class AnalizadorArbolTest {
    public static void main(String[] args) {
        /*
         * ESTRUCTURA DEL ÁRBOL DE PRUEBA:
         *
         *                    [Empresa] (Tardanza: 14)               --> Nivel 0: Promedio = 14.0
         *                   /        \
         *         [Finanzas]          [Sistemas]                    --> Nivel 1: (10 + 25) / 2 = 17.5
         *        (Tardanza: 10)       (Tardanza: 25)
         *         /    |    \              |
         *     [RRHH] [Mkt] [Ventas]     [Infra]                     --> Nivel 2: (7 + 12 + 5 + 20) / 4 = 11.0
         *      (7)    (12)   (5)         (20)
         *
         * RESULTADO ESPERADO: 17.5 (Nivel 1)
         */

        // Nivel 2 (Hojas)
        ArbolGeneral<AreaEmpresa> rrhh = new ArbolGeneral<>(new AreaEmpresa("RRHH", 7));
        ArbolGeneral<AreaEmpresa> mkt = new ArbolGeneral<>(new AreaEmpresa("Marketing", 12));
        ArbolGeneral<AreaEmpresa> ventas = new ArbolGeneral<>(new AreaEmpresa("Ventas", 5));
        ArbolGeneral<AreaEmpresa> infra = new ArbolGeneral<>(new AreaEmpresa("Infraestructura", 20));

        // Nivel 1 (Subárboles)
        ArbolGeneral<AreaEmpresa> finanzas = new ArbolGeneral<>(new AreaEmpresa("Finanzas", 10));
        finanzas.agregarHijo(rrhh);
        finanzas.agregarHijo(mkt);
        finanzas.agregarHijo(ventas);

        ArbolGeneral<AreaEmpresa> sistemas = new ArbolGeneral<>(new AreaEmpresa("Sistemas", 25));
        sistemas.agregarHijo(infra);

        // Nivel 0 (Raíz)
        ArbolGeneral<AreaEmpresa> raiz = new ArbolGeneral<>(new AreaEmpresa("Empresa", 14));
        raiz.agregarHijo(finanzas);
        raiz.agregarHijo(sistemas);

        // Ejecución de la prueba
        AnalizadorArbol analizador = new AnalizadorArbol();
        double maxPromedio = analizador.devolverMaximoPromedio(raiz);

        // Impresión de resultados
        System.out.println("=== TEST ANALIZADOR DE ÁRBOL ===");
        System.out.println("Promedio esperado: 17.5");
        System.out.println("Promedio obtenido: " + maxPromedio);

        if (Math.abs(maxPromedio - 17.5) < 0.0001) {
            System.out.println("Result: TEST PASSED!");
        } else {
            System.out.println("Result: TEST FAILED.");
        }
    }
}
