package Estructuras_de_Datos;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Terminacion_Ejercicio2_Botin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String respuesta = "";
        Map<String, ArrayList> mapa1 = new HashMap<String, ArrayList>();
        ArrayList<String> numeros = new ArrayList<>();
        numeros.add("655056836");
        numeros.add("566056836");
        mapa1.put("PauMo", numeros);

        numeros = new ArrayList<>();
        numeros.add("693790634");
        mapa1.put("Foga", numeros);

        numeros = new ArrayList<>();
        numeros.add("644280983");
        mapa1.put("AlexCraft", numeros );

        numeros = new ArrayList<>();
        numeros.add("642832231");
        mapa1.put("Leonidas", numeros );

        numeros = new ArrayList<>();
        numeros.add("633844956");
        mapa1.put("Vicas", numeros );

        numeros = new ArrayList<>();
        numeros.add("608293195");
        mapa1.put("Xusmuelas", numeros );

        System.out.println(mapa1.keySet());
        System.out.println("-----------------------------");
        System.out.println("Introduce el nombre del contacto");
        respuesta = scanner.nextLine();
        capital(mapa1, respuesta);
    }

    public static String capital (Map<String, ArrayList> mapa1, String respuesta){
        if (mapa1.containsKey(respuesta)) System.out.println("Su telefono: " + mapa1.get(respuesta));
        else System.out.println("Valor no valido");
        return respuesta;
    }
}