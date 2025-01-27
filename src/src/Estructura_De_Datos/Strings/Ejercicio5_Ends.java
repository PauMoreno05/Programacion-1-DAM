import java.util.Scanner;

public class Ejercicio5_Ends {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String cadena1 = "";
        String cadena2 = "";
        System.out.println("Introduce una frase");
        cadena1 = scanner.nextLine();
        System.out.println("Introduce otra frase");
        cadena2 = scanner.nextLine();

        if (acaba(cadena1, cadena2)){
            System.out.println("Las dos frases acaban igual");
        }else {
            System.out.println("Son frases distintas");
        }
    }

    public static boolean acaba (String cadena1, String cadena2){
        boolean respuesta = cadena1.endsWith(cadena2);
        return respuesta;
    }
}
