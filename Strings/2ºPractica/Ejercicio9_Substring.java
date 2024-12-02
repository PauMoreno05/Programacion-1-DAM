import java.util.Scanner;

public class Ejercicio9_Substring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String cadena1 = "";
        int max, min;
        System.out.println("Introduce una frase");
        cadena1 = scanner.nextLine();
        System.out.println("Introduce una frase");
        min = scanner.nextInt();
        System.out.println("Introduce una frase");
        max = scanner.nextInt();
        System.out.println(subcadena(cadena1, max, min));

    }

    public static String subcadena (String cadena1, int max, int min){
        String cambio = cadena1.substring(min, max);
        return cambio;
    }
}
