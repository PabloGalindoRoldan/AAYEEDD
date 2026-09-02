package pabloGalindo.tp02.ejercicio3;

import pabloGalindo.tp02.ArbolGeneral;
import pabloGalindo.tp01.ejercicio2.ListaEnlazadaGenerica;

public class ArbolGeneralTest {

    public static void main(String[] args) {

        // ==========================================
        // TEST DEL METODO PREORDEN Y POSTORDEN DE ARBOL GENERAL
        // ==========================================

        // ==========================================
        // GENERACIÓN 1: El Origen (Raíz)
        // ==========================================
        ArbolGeneral<String> arbolGenealogico = new ArbolGeneral<>("1. [Origen] Patriarca Juan");

        // ==========================================
        // GENERACIÓN 2: Hijos (Grado 1)
        // ==========================================
        ArbolGeneral<String> carlos = new ArbolGeneral<>("2. [Grado 1] [Línea 1] Carlos");
        ArbolGeneral<String> marta = new ArbolGeneral<>("3. [Grado 1] [Línea 2] Marta");
        ArbolGeneral<String> roberto = new ArbolGeneral<>("4. [Grado 1] [Línea 3] Roberto");
        ArbolGeneral<String> elena = new ArbolGeneral<>("5. [Grado 1] [Línea 4] Elena");

        arbolGenealogico.agregarHijo(carlos);
        arbolGenealogico.agregarHijo(marta);
        arbolGenealogico.agregarHijo(roberto);
        arbolGenealogico.agregarHijo(elena);

        // ==========================================
        // GENERACIÓN 3: Nietos (Grado 2 / Sublíneas)
        // ==========================================
        // Sublíneas de Carlos (Línea 1)
        ArbolGeneral<String> pedro = new ArbolGeneral<>("6. [Grado 2] [Línea 1] [Sublínea 1] Pedro");
        ArbolGeneral<String> sofia = new ArbolGeneral<>("7. [Grado 2] [Línea 1] [Sublínea 2] Sofía");
        carlos.agregarHijo(pedro);
        carlos.agregarHijo(sofia);

        // Sublíneas de Marta (Línea 2)
        ArbolGeneral<String> lucia = new ArbolGeneral<>("8. [Grado 2] [Línea 2] [Sublínea 1] Lucía");
        ArbolGeneral<String> diego = new ArbolGeneral<>("9. [Grado 2] [Línea 2] [Sublínea 2] Diego");
        ArbolGeneral<String> ana = new ArbolGeneral<>("10. [Grado 2] [Línea 2] [Sublínea 3] Ana");
        marta.agregarHijo(lucia);
        marta.agregarHijo(diego);
        marta.agregarHijo(ana);

        // Sublíneas de Roberto (Línea 3)
        ArbolGeneral<String> gabriel = new ArbolGeneral<>("11. [Grado 2] [Línea 3] [Sublínea 1] Gabriel");
        roberto.agregarHijo(gabriel);

        // Sublíneas de Elena (Línea 4)
        ArbolGeneral<String> valentina = new ArbolGeneral<>("12. [Grado 2] [Línea 4] [Sublínea 1] Valentina");
        ArbolGeneral<String> mateo = new ArbolGeneral<>("13. [Grado 2] [Línea 4] [Sublínea 2] Mateo");
        elena.agregarHijo(valentina);
        elena.agregarHijo(mateo);

        // ==========================================
        // GENERACIÓN 4: Bisnietos (Grado 3 / Sub-sublíneas)
        // ==========================================
        // Rama Carlos -> Pedro
        ArbolGeneral<String> joaquin = new ArbolGeneral<>("14. [Grado 3] [Línea 1] [Sublínea 1.1] Joaquín");
        ArbolGeneral<String> camila = new ArbolGeneral<>("15. [Grado 3] [Línea 1] [Sublínea 1.2] Camila");
        pedro.agregarHijo(joaquin);
        pedro.agregarHijo(camila);

        // Rama Carlos -> Sofía
        ArbolGeneral<String> lucas = new ArbolGeneral<>("16. [Grado 3] [Línea 1] [Sublínea 2.1] Lucas");
        sofia.agregarHijo(lucas);

        // Rama Marta -> Lucía
        ArbolGeneral<String> martina = new ArbolGeneral<>("17. [Grado 3] [Línea 2] [Sublínea 1.1] Martina");
        ArbolGeneral<String> nicolas = new ArbolGeneral<>("18. [Grado 3] [Línea 2] [Sublínea 1.2] Nicolás");
        lucia.agregarHijo(martina);
        lucia.agregarHijo(nicolas);

        // Rama Marta -> Diego
        ArbolGeneral<String> julian = new ArbolGeneral<>("19. [Grado 3] [Línea 2] [Sublínea 2.1] Julián");
        diego.agregarHijo(julian);

        // Rama Marta -> Ana
        ArbolGeneral<String> victoria = new ArbolGeneral<>("20. [Grado 3] [Línea 2] [Sublínea 3.1] Victoria");
        ArbolGeneral<String> gonzalo = new ArbolGeneral<>("21. [Grado 3] [Línea 2] [Sublínea 3.2] Gonzalo");
        ana.agregarHijo(victoria);
        ana.agregarHijo(gonzalo);

        // Rama Roberto -> Gabriel
        ArbolGeneral<String> felipe = new ArbolGeneral<>("22. [Grado 3] [Línea 3] [Sublínea 1.1] Felipe");
        ArbolGeneral<String> lautaro = new ArbolGeneral<>("23. [Grado 3] [Línea 3] [Sublínea 1.2] Lautaro");
        ArbolGeneral<String> mia = new ArbolGeneral<>("24. [Grado 3] [Línea 3] [Sublínea 1.3] Mía");
        gabriel.agregarHijo(felipe);
        gabriel.agregarHijo(lautaro);
        gabriel.agregarHijo(mia);

        // Rama Elena -> Valentina
        ArbolGeneral<String> emma = new ArbolGeneral<>("25. [Grado 3] [Línea 4] [Sublínea 1.1] Emma");
        valentina.agregarHijo(emma);

        // ==========================================
        // GENERACIÓN 5: Tataranietos (Grado 4 / Profundidad máxima)
        // ==========================================
        // Rama Joaquín
        ArbolGeneral<String> santino = new ArbolGeneral<>("26. [Grado 4] [Línea 1] [Sublínea 1.1.1] Santino");
        ArbolGeneral<String> benjamin = new ArbolGeneral<>("27. [Grado 4] [Línea 1] [Sublínea 1.1.2] Benjamín");
        joaquin.agregarHijo(santino);
        joaquin.agregarHijo(benjamin);

        // Rama Martina
        ArbolGeneral<String> isabella = new ArbolGeneral<>("28. [Grado 4] [Línea 2] [Sublínea 1.1.1] Isabella");
        martina.agregarHijo(isabella);

        // Rama Felipe
        ArbolGeneral<String> bautista = new ArbolGeneral<>("29. [Grado 4] [Línea 3] [Sublínea 1.1.1] Bautista");
        ArbolGeneral<String> catalina = new ArbolGeneral<>("30. [Grado 4] [Línea 3] [Sublínea 1.1.2] Catalina");
        felipe.agregarHijo(bautista);
        felipe.agregarHijo(catalina);

        // Rama Emma
        ArbolGeneral<String> manuel = new ArbolGeneral<>("31. [Grado 4] [Línea 4] [Sublínea 1.1.1] Manuel");
        emma.agregarHijo(manuel);

        // ==========================================
        // TERMINA EL ARBOL
        // ==========================================
        System.out.println("--- Árbol Generado Exitosamente ---");

        // Recorrido Preorden e impresion de lista:

        System.out.println();
        System.out.println("--- Recorrido preOrden ---");
        ListaEnlazadaGenerica<String> listarPreOrden = arbolGenealogico.preOrden();
        listarPreOrden.comenzar();
        listarPreOrden.tusDatos();


        //Recorrido Postorden
        System.out.println();
        System.out.println("--- Recorrido postOrden ---");
        ListaEnlazadaGenerica<String> listarPostOrden = arbolGenealogico.postOrden();
        listarPostOrden.comenzar();
        listarPostOrden.tusDatos();


    }

}
