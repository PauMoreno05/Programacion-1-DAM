import java.util.Scanner;

public class Ejercicio6_Remplazar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String cadena1 = "";
        System.out.println("Introduce una frase");
        cadena1 = scanner.nextLine();

        System.out.println(remplazar(cadena1));
    }

    public static String remplazar (String cadena1){
        String remplazo = cadena1.replace("a", "o");
        return remplazo;
    }
}
