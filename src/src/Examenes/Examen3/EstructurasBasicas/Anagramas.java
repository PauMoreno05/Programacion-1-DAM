package Examenes.Examen3.EstructurasBasicas;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Anagramas {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("E:\\Clase\\Programacion2\\Programacion2\\spanish-dict.txt"));
        Map<String, ArrayList<String>> lista = new HashMap<>();
        String linia;
        while ((linia = reader.readLine())!=null){
            String alpabetizadas = alphabetize(linia+ "\n");

            lista.putIfAbsent(alpabetizadas, new ArrayList<>()); // eliminas palabras repetidas
            lista.get(alpabetizadas).add(linia); // añades las palabras alpphabetizadas en el mapa
        }
        reader.close();

        System.out.println(lista);
    }
    private static String alphabetize(String s) {
        char[] a = s.toCharArray();
        Arrays.sort(a);
        return new String(a);
    }
}
