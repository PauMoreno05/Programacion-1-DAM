package Pilas;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Ejercicio1_Parentesis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack pila = new Stack();
        ArrayList<String> palabras = new ArrayList<>();
        String frase = "";
        boolean bien = true;

        System.out.println("Introduce una frase con parentesis");
        frase = scanner.nextLine();

        for (int i = 0; i < frase.length(); i++){
            if (frase.charAt(i) == ')'|| frase.charAt(i) == ']' || frase.charAt(i) == '}'){
                if (pila.isEmpty()){
                    bien = false;
                    break;
                }
            }

            if (frase.charAt(i) == '(') pila.push('(');
            if (frase.charAt(i) == '[') pila.push('[');
            if (frase.charAt(i) == '{') pila.push('{');

            if (frase.charAt(i) == ')'){
                if (pila.peek().equals('(')) pila.pop();
            }
            if (frase.charAt(i) == ']'){
                if (pila.peek().equals('[')) pila.pop();
            }
            if (frase.charAt(i) == '}'){
                if (pila.peek().equals('{')) pila.pop();
            }
        }

        if (!pila.isEmpty()) bien = false;
        if (bien){
            System.out.println("La frase introducida esta bien parentizada");
        }else System.out.println("La frase se encuentra mal parentizada");
    }
}
