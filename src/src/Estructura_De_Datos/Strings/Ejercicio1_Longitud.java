import java.util.Scanner;

public class Ejercicio1_Longitud {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String frase = "";
        int longitud = 0;
        int cont = 0;
        System.out.println("Introduce una frase");
        frase = scanner.nextLine();
        System.out.println("De cuantas letras quieres filtrar las palabras");
        longitud = scanner.nextInt();
        String[] palabras = frase.split(" ");
        for (String i : palabras){
            if (i.length() == longitud){
                cont++;
            }
        }
        System.out.println("Hay " + cont + " palabras con " + longitud + " letras.");
    }
}
