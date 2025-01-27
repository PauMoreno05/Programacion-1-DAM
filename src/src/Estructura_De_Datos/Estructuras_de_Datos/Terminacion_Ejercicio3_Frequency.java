package Estructura_De_Datos.Estructuras_de_Datos;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Terminacion_Ejercicio3_Frequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> mapa1 = new HashMap<>();
        ArrayList<String> palabras = new ArrayList<>();
        String respuesta = "";

        while (true){
            System.out.println("Introduce una palabra (Para finalizar presione enter sin nada escrito en la terminal)");
            respuesta = scanner.nextLine();

            if (respuesta.isBlank()) break;
            palabras.add(respuesta);
        }
        scanner.close();

        for (String palabra : palabras){
            mapa1.put(palabra.toLowerCase(), mapa1.getOrDefault(palabra,0) +1);
        }

        System.out.println(mapa1);
    }
}