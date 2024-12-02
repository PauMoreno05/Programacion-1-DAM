import java.util.Scanner;

public class Ejercicio8_LastIndexOf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String cadena1 = "";
        String cadena2 = "";
        System.out.println("Introduce una frase");
        cadena1 = scanner.nextLine();
        System.out.println("que palabra quieres buscar en su posicion");
        cadena2 = scanner.nextLine();

        System.out.println(posicion(cadena1, cadena2));
    }

    public static int posicion (String cadena1, String cadena2){
        int posicion = cadena1.lastIndexOf(cadena2);
        return posicion;
    }
}
