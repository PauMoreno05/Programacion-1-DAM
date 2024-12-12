package Estructuras_de_Datos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Terminacion_Ejercicio5_CountCountries {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        BufferedReader reader = new BufferedReader(new FileReader("Colfuturo-Seleccionados.csv"));
        Map<String, Integer> map = new HashMap<>();
        ArrayList<String>paises = new ArrayList<>();
        String line;
        String respuesta;
        System.out.println("De quen pais quieres filtrar la busqueda");
        respuesta = scanner.nextLine();

        while ((line = reader.readLine())!=null) {
            String[] saltos = line.split(",");

            Integer freq = map.get(saltos[6]);

            if (freq == null){
                map.put(saltos[6], 1);
            }else {
                map.put(saltos[6], freq + 1);
            }
            map.put(saltos[6], freq == null ? 1: freq + 1);
        }
        System.out.println("en este pais se encuentran la siguinte cantidad de estudiantes: " + map.getOrDefault(respuesta, 0));
        reader.close();
    }
}
