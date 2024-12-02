import java.util.Scanner;

public class Ejercicio7_Invertida {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String cadena1 = "";
        int cont1 = 0;
        System.out.println("introduce una frase");
        cadena1 = scanner.nextLine();
        String [] palabras = cadena1.split(" ");

        for (int i = 0; i < palabras.length ; i++){
            System.out.print(palabras[palabras.length -1 -i] +  " ");
        }
    }
}