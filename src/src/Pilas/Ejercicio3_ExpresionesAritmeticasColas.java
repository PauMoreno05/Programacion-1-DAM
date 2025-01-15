package Pilas;

import java.util.LinkedList;
import java.util.Queue;

public class Ejercicio3_ExpresionesAritmeticasColas {
    public static void main(String[] args) {
        Queue<Integer> cola = new LinkedList<>();
        String operacion = "3 5 4 + *";
        String [] operacionFin;
        operacionFin = operacion.split(" ");


        for (String i : operacionFin){
            if (Character.isDigit(i.charAt(0))){
                cola.offer(Integer.parseInt(i));
            }else{
                int n1 = cola.poll();
                int n2 = cola.poll();
                switch (i){
                    case "+" :
                        cola.offer(n1 + n2);
                        break;
                    case "-" :
                        cola.offer(n1 - n2);
                        break;
                    case "*" :
                        cola.offer(n1 * n2);
                        break;
                    case "/" :
                        cola.offer(n1 / n2);
                        break;

                    default: break;
                }
            }
        }
        System.out.println(cola.poll());
    }
}
