import java.util.Scanner;

public class Ejercicio8_Siglas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String cadena1 = "";
        int cont1 = 0;
        String vacio = "";
        System.out.println("introduce una frase");
        cadena1 = scanner.nextLine();
        String [] palabras = cadena1.split(" ");
        for (String i : palabras){
            for (int j = 0; j < i.length(); j++){
                if (Character.isUpperCase(i.charAt(j))){
                    System.out.print(i.charAt(j));
                }
            }
        }
    }
}