//factorial
import java.util.Scanner;

public class Ejemplo25 {
    public static void main(String[] args) {
        Scanner inputValue = new Scanner(System.in);
        int contador = 1;
        System.out.println("Introduce un numero");
        int numero = inputValue.nextInt();


        for (int i = 1; i <= numero; i++) {
            contador = contador * i;
        }

        System.out.println("Tu numero fatorial es: " + contador);

    }
}
