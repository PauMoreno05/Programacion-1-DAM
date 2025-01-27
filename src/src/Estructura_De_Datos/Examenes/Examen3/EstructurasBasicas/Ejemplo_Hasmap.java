package Estructura_De_Datos.Examenes.Examen3.EstructurasBasicas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Ejemplo_Hasmap {
    public static void main(String[] args) {
        Map<String, String> mapa = new HashMap<>(); // Creacion del mapa (Hasmap sirve para datos genericos) (hasmap sirve para no poner duplicados)
        mapa.put("llave1", "valor1"); // añades valores al mapa con su clave, y un valor
        mapa.put("llave2", "valor2");
        mapa.put("llave3", "valor3");
        mapa.put("llave4", "valor4");

        for (String valor : mapa.values()){ // Obtener los valores del mapa
            System.out.print(valor + "-");
        }
        System.out.println(" ");

        for (String valor : mapa.keySet()){ // Obtener las llaves del mapa
            System.out.print(valor + "-");

        }
        System.out.println(" ");

        System.out.println(mapa.get("llave1")); // muestra el valor de la llave introducida

        if (mapa.containsKey("llave4")){ // verificamos si conteine la llave...
            System.out.print("el valor es: " + mapa.get("llave4"));
        }

        mapa.remove("llave1"); //eliminar la llave

        Map<String, ArrayList> numeros = new HashMap<>();
        ArrayList<String> telefonos = new ArrayList<>(); //Introducer mas de un valor a una llave
        telefonos.add("655056835");
        telefonos.add("768345904");
        numeros.put("Javier", telefonos);
        System.out.println(mapa);

    }
}
