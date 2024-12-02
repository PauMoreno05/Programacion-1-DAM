import java.util.Scanner;

public class Ejercicio5_digitos2 {
    public static void main(String[] args) {
        String frase;
        int contador = 0;
        int cont2 = 0;
        Scanner scanner = new Scanner(System.in);


        System.out.println("Introduce una frase: ");
        frase = scanner.nextLine();

        String[] palabras = frase.split(" ");

        for (String j : palabras) {
            for (int i = 0; i < j.length(); i++) {
                if (Character.isDigit(j.charAt(i))) contador++;
                if (contador == j.length()) {
                    cont2++;
                    contador = 0;
                    break;
                }
            }
        }
        System.out.printf("En la frase se encuentran estos numeros: " + cont2);
    }
}