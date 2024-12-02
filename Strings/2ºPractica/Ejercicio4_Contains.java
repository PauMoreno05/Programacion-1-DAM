import java.util.Scanner;

public class Ejercicio4_Contains {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String cadena1 = "";
        String cadena2 = "";
        System.out.println("Introduce una frase");
        cadena1 = scanner.nextLine();
        System.out.println("Introduce otra frase");
        cadena2 = scanner.nextLine();

        if (contiene(cadena1, cadena2)){
            System.out.println("La primera frase contiene la segunda");
        }else {
            System.out.println("Son frases distintas");
        }
    }

    public static boolean contiene (String cadena1, String cadena2){
        boolean respuesta = cadena1.contains(cadena2);
        return respuesta;
    }
}
