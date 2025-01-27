import java.util.Scanner;

public class Ejercicio2_Longitud2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String frase = "";
        int longitud = 0;
        boolean igual = false;
        System.out.println("Introduce una frase");
        frase = scanner.nextLine();
        System.out.println("De cuantas letras quieres filtrar las palabras");
        longitud = scanner.nextInt();
        String[] palabras = frase.split(" ");
        for (String i : palabras){
            if (i.length() == longitud){
                igual = true;
            }
        }
        if (igual){
            System.out.println("En la frase se encuentra una o mas palabras con el numero de letras: " + longitud);
        }else {
            System.out.println("En la frase  no se encuentra una o mas palabras con el numero de letras: " + longitud);
        }
        scanner.close();
    }
}
