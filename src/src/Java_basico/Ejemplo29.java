//Numeros Primos
import java.util.Scanner;

public class Ejemplo29 {
    public static void main(String[] args) {
        Scanner inputValue = new Scanner(System.in);
        int numero = 0;
        for (int i = 3; i <= 100; i ++) {
            boolean esPrimo = true;
            for (int j = i - 1; j > 1; j--) {
                if (i % j == 0) {
                    esPrimo = false;
                    break;
                }
            }
            if (esPrimo == true) {
                System.out.print(i + " ");
            }
        }
    }
}


