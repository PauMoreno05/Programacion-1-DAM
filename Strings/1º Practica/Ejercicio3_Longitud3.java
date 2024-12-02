import java.util.Scanner;

public class Ejercicio3_Longitud3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String frase = "";
        int longitud = 0;
        boolean largo = false;
        System.out.println("Introduce una frase");
        frase = scanner.nextLine();
        System.out.println("De cuantas letras quieres filtrar las palabras");
        longitud = scanner.nextInt();
        String[] palabras = frase.split(" "); //Esto de aqui funciona para separar en un Array las palabras dividiendolas por el espacio
        for (String i : palabras){
            if (i.length() >= longitud){
                largo = true;
            }
        }
        if (largo){
            System.out.println("Hay alguna palabra larga");
        }else {
            System.out.println("Todas las cadenas son cortas");
        }
        scanner.close();
    }
}
