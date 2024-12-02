import java.util.Scanner;

public class Ejercicio6_parentesis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String cadena1 = "";
        int cont1 = 0;
        int cont2 = 0;
        System.out.println("introduce una frase con parentesis");
        cadena1 = scanner.nextLine();
        boolean igual = false;
        for (int i = 0; i <= cadena1.length() - 1; i++) {
            if (cadena1.charAt(i) == '(') cont1++;
            if (cadena1.charAt(i) == ')') cont2++;
            if (cont2 > cont1) {
                System.out.println("la frase esta mal parentiada");
                igual = true;
                break;
            }
        }
        if (igual) {
            if (cont1 == cont2) System.out.println("La frase esta bien parentizada");
            } else System.out.println("La frase no esta bien parentizada");
    }
}