package Estructura_De_Datos.Pilas;

import java.util.Stack;

public class Ejercicio2_ExpresionesAritmeticasPilas {
    public static void main(String[] args) {
        Stack<Integer> pila = new Stack<Integer>();
        String operacion = "3 5 4 + *";
        String [] operacionFin;
        operacionFin = operacion.split(" ");


        for (String i : operacionFin){
            if (Character.isDigit(i.charAt(0))){
                pila.push(Integer.parseInt(i));
            }else{
                int n1 = pila.pop();
                int n2 = pila.pop();
                switch (i){
                    case "+" :
                        pila.push(n1 + n2);
                        break;
                    case "-" :
                        pila.push(n1 - n2);
                        break;
                    case "*" :
                        pila.push(n1 * n2);
                        break;
                    case "/" :
                        pila.push(n1 / n2);
                        break;

                    default: break;
                }
            }
        }
        System.out.println(pila.pop());
    }
}
