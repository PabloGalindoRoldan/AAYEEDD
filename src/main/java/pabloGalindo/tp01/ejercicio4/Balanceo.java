package pabloGalindo.tp01.ejercicio4;

import pabloGalindo.tp01.ejercicio3.PilaGenerica;

public class Balanceo{

    public boolean balancear(String s){
        PilaGenerica<Character> pila = new PilaGenerica<>();

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c == '(' || c == '[' || c == '{'){
                pila.apilar(c);
            } else if(c == ')' || c== ']' || c== '}'){
                if(pila.esVacia()){
                    return false;
                }
                char ultimo = pila.tope();
                if(c == ')' && ultimo != '('){
                    return false;
                }
                if(c == ']' && ultimo != '['){
                    return false;
                }
                if(c == '}' && ultimo != '{'){
                    return false;
                }
                pila.desapilar();
            }
        }
        return pila.esVacia();
    }
}