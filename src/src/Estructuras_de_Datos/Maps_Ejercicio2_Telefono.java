package Estructuras_de_Datos;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Maps_Ejercicio2_Telefono {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, String> mapa1 = new HashMap<String, String>();
        String respuesta = "";

        mapa1.put("PauMo", "655056836");
        mapa1.put("Hector", "693790634");
        mapa1.put("Alex", "644280983");
        mapa1.put("Leo", "642832231");
        mapa1.put("Victor", "633844956");
        mapa1.put("Alexander", "608293195");

        System.out.println(mapa1.keySet());
        System.out.println("-----------------------------");
        System.out.println("Introduce el nombre de un contacto");
        respuesta = scanner.nextLine();
        capital(mapa1, respuesta);
    }

    public static String capital (Map<String, String> mapa1, String respuesta){
        if (mapa1.containsKey(respuesta)) System.out.println("Su telefono es: " + mapa1.get(respuesta));
        else System.out.println("Valor no valido");
        return respuesta;
    }
}