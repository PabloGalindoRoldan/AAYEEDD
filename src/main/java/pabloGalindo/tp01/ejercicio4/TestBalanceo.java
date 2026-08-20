package pabloGalindo.tp01.ejercicio4;

public class TestBalanceo {

    public static void main (String[] args){

        String cadena1 = "()";
        String cadena2 = "())";
        String cadena3 = "()()[]{}{[()]}";
        String cadena4 = "(((((((((())))))))))";
        String cadena5 = "{[()}]";

        System.out.println("Cadena 1: " + cadena1 + " - Balanceada: " + new Balanceo().balancear(cadena1));
        System.out.println("Cadena 2: " + cadena2 + " - Balanceada: " + new Balanceo().balancear(cadena2));
        System.out.println("Cadena 3: " + cadena3 + " - Balanceada: " + new Balanceo().balancear(cadena3));
        System.out.println("Cadena 4: " + cadena4 + " - Balanceada: " + new Balanceo().balancear(cadena4));
        System.out.println("Cadena 5: " + cadena5 + " - Balanceada: " + new Balanceo().balancear(cadena5));
    }

}

