package Estructura_De_Datos.Examenes.Examen3.EstructurasBasicas;

import java.util.ArrayList;
import java.util.Collections;


public class Ejemplo_ArrayList {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>(); // Creamos el array list
        list.add("Prueba1"); // Agrega un valor al ArrayList
        list.add("Iogurt");
        list.add("Caminas");
        list.add("Xumelo");
        list.get(1); //Se eligue la posicion dentro del array (empezando por 0)
        list.size(); // Mostraria el tamaño del array
        list.remove(0); //sirve para eliminar la posicion elegida dentro del array


        for (String i : list){ //En los array list se usa el for gucci
            System.out.println(i);
        }

        Collections.sort(list); // Ordena la lista de menor a mayor o en orden alfabetico
        System.out.println(list.contains("Xumelo"));//Compureva si un vvalor esta dentro del array debolviendo un booleano

    }
}
