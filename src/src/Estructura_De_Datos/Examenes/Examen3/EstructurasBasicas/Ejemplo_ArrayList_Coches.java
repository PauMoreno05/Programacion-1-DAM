package Estructura_De_Datos.Examenes.Examen3.EstructurasBasicas;

import java.util.ArrayList;
import java.util.Scanner;


public class Ejemplo_ArrayList_Coches {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> coches = new ArrayList<>();
        String coche;

        while (true){
            System.out.println("Introduce una marca de coche (para acabar la lista untroduce)");
            coche = scanner.nextLine();
            if (coche.isEmpty()){
                break;
            }
            coches.add(coche);
        }
        System.out.println("esta es tu lista de coches");
        System.out.println(coches);

    }
}
