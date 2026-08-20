package pabloGalindo.tp01.ejercicio4;

import java.util.Deque;

public class Balanceo{

    public boolean balancear(String s){
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