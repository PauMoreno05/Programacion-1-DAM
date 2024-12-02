import java.util.Scanner;

public class Ejercicio10_Pasatiempos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String frase = "";
        System.out.println("Introduce una frase");
        frase = scanner.nextLine();
        String vocales = "aeiouAEIOU";
        char[] cadena = frase.toCharArray();
        char[] arrvoc = vocales.toCharArray();
        for (int i=0; i < cadena.length ; i++){
            for (int j=0; j < arrvoc.length ; j++){
                if (cadena[i] == arrvoc[j]){
                    cadena[i] = '.';
                }
            }
        }
        for (char i : cadena) System.out.print(i);

    }
}