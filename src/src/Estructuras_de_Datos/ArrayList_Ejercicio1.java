package Estructuras_de_Datos;
import java.util.ArrayList;

public class ArrayList_Ejercicio1 {
    public static void main(String[] args) {
        ArrayList<String> coches = new ArrayList<String>();
        coches.add("Seat");
        coches.add("Citroen");
        coches.get(0);
        for (String coche : coches){
            System.out.println(coche);
        }
        System.out.printf("Existen %d coches%n", coches.size());
    }
}
