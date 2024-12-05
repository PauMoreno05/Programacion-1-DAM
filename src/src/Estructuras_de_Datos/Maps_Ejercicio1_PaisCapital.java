package Estructuras_de_Datos;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Maps_Ejercicio1_PaisCapital {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, String> mapa1 = new HashMap<String, String>();
        String respuesta = "";

        mapa1.put("Alemania", "Berlin");
        mapa1.put("Austria", "Viena");
        mapa1.put("Espanya", "Madrid");
        mapa1.put("Malta", "La valeta");
        mapa1.put("Rumania", "Bucarest");
        mapa1.put("Italia", "Roma");

        System.out.println(mapa1.keySet());
        System.out.println("-----------------------------");
        System.out.println("Introduce un pais de la lista");
        respuesta = scanner.nextLine();
        capital(mapa1, respuesta);
    }

    public static String capital (Map<String, String> mapa1, String respuesta){
        if (mapa1.containsKey(respuesta)) System.out.println("La capital es: " + mapa1.get(respuesta));
        else System.out.println("Valor no valido");
        return respuesta;
    }
}