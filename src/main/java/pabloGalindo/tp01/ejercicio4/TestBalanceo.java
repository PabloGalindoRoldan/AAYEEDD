package pabloGalindo.tp01.ejercicio4;

import java.util.Deque;

public class TestBalanceo {

    public static void main (String[] args){

        String cadena1 = "()";
        String cadena2 = "())";
        String cadena3 = "()()[]{}{[()]}";
        String cadena4 = "(((((((((())))))))))";
        String cadena5 = "{[()}]";

        System.out.println("Cadena 1: " + cadena1 + " - Balanceada: " + new TestBalanceo().Balanceo(cadena1));
        System.out.println("Cadena 2: " + cadena2 + " - Balanceada: " + new TestBalanceo().Balanceo(cadena2));
        System.out.println("Cadena 3: " + cadena3 + " - Balanceada: " + new TestBalanceo().Balanceo(cadena3));
        System.out.println("Cadena 4: " + cadena4 + " - Balanceada: " + new TestBalanceo().Balanceo(cadena4));
        System.out.println("Cadena 5: " + cadena5 + " - Balanceada: " + new TestBalanceo().Balanceo(cadena5));
    }

    public boolean Balanceo(String s){
        Deque<Character> pila = new java.util.ArrayDeque<>();

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c == '(' || c == '[' || c == '{'){
                pila.push(c);
            } else if(c == ')' || c== ']' || c== '}'){
                if(pila.isEmpty()){
                    return false;
                }
                char ultimo = pila.pop();
                if(c == ')' && ultimo != '('){
                    return false;
                }
                if(c == ']' && ultimo != '['){
                    return false;
                }
                if(c == '}' && ultimo != '{'){
                    return false;
                }
            }
        }
        return pila.isEmpty();
    }

}
