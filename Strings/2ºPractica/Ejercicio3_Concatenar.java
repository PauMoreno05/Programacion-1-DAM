import java.util.Scanner;

public class Ejercicio3_Concatenar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String cadena1 = "";
        String cadena2 = "";
        System.out.println("Introduce una frase");
        cadena1 = scanner.nextLine();
        System.out.println("Introduce otra frase");
        cadena2 = scanner.nextLine();

        System.out.println(concatenar(cadena1, cadena2));
    }

    public static String concatenar (String cadena1, String cadena2){
        String cadena3 = cadena1.concat(cadena2);
        return cadena3;
    }
}
