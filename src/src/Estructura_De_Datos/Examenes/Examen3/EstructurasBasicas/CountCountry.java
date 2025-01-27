package Estructura_De_Datos.Examenes.Examen3.EstructurasBasicas;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class CountCountry {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("E:\\Clase\\Programacion2\\Programacion2\\Colfuturo-Seleccionados.csv"));
        Map<String, Integer> lista = new HashMap<>();
        String linia;
        while ((linia = reader.readLine())!=null){
            String[] polla = linia.split(",");
            String pais = polla[6];

            Integer freq = lista.get(pais);

            if (freq == null){
                lista.put(pais, 1);
            }else {
                lista.put(pais, freq +1);
            }
        }
        reader.close();

        System.out.println(lista);
    }

}
