//Año bisiesto
import java.util.Scanner;

public class Ejemplo21 {
    public static void main(String[] args) {
        Scanner inputValue = new Scanner(System.in);
        System.out.println("Introduce un año (0000)");
        int año = inputValue.nextInt();
        inputValue.close();

        if (año % 4 == 0){
            if (año % 100 == 0){
                if (año % 400 == 0) {
                    System.out.println("El año es bisiesto");
                }else System.out.println("El año no es bisiesto.");
            }else System.out.println("El año es bisiesto.");
        }else System.out.println("El año no es bisiesto");
    }
}
