package Estructura_De_Datos.Estructuras_de_Datos;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Terminacion_Ejercicio1_LaMejorterminacion {
    public static void main(String[] args) {
        Map<Integer, Integer> mapa1 = new HashMap<>();
        ArrayList<String> numeros = new ArrayList<>();
        int terminacion = 0;

        numeros.add("58975");
        numeros.add("25894");
        numeros.add("52985");
        numeros.add("98598");

        for (String numero : numeros){
            terminacion = Character.getNumericValue(numero.charAt(numero.length()-1));
            mapa1.put(terminacion, mapa1.getOrDefault(terminacion,0) +1);
        }

        System.out.println(mapa1);
    }
}