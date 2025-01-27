import javax.naming.PartialResultException;
import java.util.Scanner;

public class Ejercicio4_digitos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String frase = "";
        int contador = 0;
        System.out.println("Introduce una frase");
        frase = scanner.nextLine();
        String[] palabras = frase.split(" ");
        for (int i = 0; i < frase.length(); i++){
            if (Character.isDigit(frase.charAt(i))){
                contador++;
            }
        }
        System.out.println("En la frase se encuentran estos numeros: " + contador);
        scanner.close();
    }
}


