package Estructuras_de_Datos;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Terminacion_Ejercicio2_Botin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String respuesta = "";
        int numero = 0;
        int numTripulacion;

        ArrayList<Integer>billetes = new ArrayList<>();
        Map<Integer, Integer> reparto = new HashMap<>();


        System.out.println("Introduce todos los billetes conseguidos de uno a uno en la bolsa");
        while (true){
            System.out.println("Introduce un billete (Para finalizar presiona enter en blanco)");
            respuesta = scanner.nextLine();
            if (respuesta.isBlank()) break;
            numero = Integer.parseInt(respuesta);
            billetes.add(numero);
        }

        System.out.println("-----------------------------------------------------------------");
        System.out.println("Cuantos miembros sois en la tripulacion");
        numTripulacion = scanner.nextInt();

//        for (int billete : billetes) {
//            reparto.put()
//        }

    }
}