package Estructuras_de_Datos;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList_Ejercicio3_Regalos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> portal = new ArrayList<Integer>();
        ArrayList<Integer> orden = new ArrayList<Integer>();

        portal.add(3);
        portal.add(2);
        portal.add(5);
        portal.add(1);
        int aterrizaje = portal.get(0);

        System.out.println("Los portales de la calle a repartir son:");
        System.out.println(portal);

        System.out.println("---------------");
        System.out.println("Orden de los portales");
        orden = reparto(portal, aterrizaje);
        System.out.println(orden);
    }

    public static ArrayList<Integer> reparto (ArrayList<Integer> portal, int aterrizaje){
        ArrayList<Integer> orden = new ArrayList<Integer>();

        int actual = aterrizaje;
        portal.remove((Integer) aterrizaje);
        while (!portal.isEmpty()){
            int cont = -1;
            int min = 777;
            for (int num : portal) {
                int distancia = Math.abs(num - actual);
                if (distancia < min || distancia == min && num > cont) {
                    min = distancia;
                    cont = num;
                }
            }
        orden.add(cont);
        portal.remove((Integer)cont);
        actual = cont;
        }
        return orden;
    }
}