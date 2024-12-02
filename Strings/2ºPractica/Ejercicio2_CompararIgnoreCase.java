import java.util.Scanner;

public class Ejercicio2_CompararIgnoreCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String cadena1 = "";
        String cadena2 = "";
        System.out.println("Introduce una frase");
        cadena1 = scanner.nextLine();
        System.out.println("Introduce otra frase");
        cadena2 = scanner.nextLine();

        if (noMayus(cadena1, cadena2) < 0) {
            System.out.println("La primera frase es mayor que la segunda");
        }else if(noMayus(cadena1, cadena2) > 0){
            System.out.println("La segunda frase es mayor que la primera");
        }else{
            System.out.println("Las dos frses son iguales");
        }
    }

    public static int noMayus (String cadena1, String cadena2){
        int comparar = cadena1.compareToIgnoreCase(cadena2);
        return comparar;
    }
}
