//Sumas Sucesivas
import java.util.Scanner;

public class Ejemplo34 {
    public static void main(String[] args) {
        Scanner inputValue = new Scanner(System.in);
        int numero1;
        int numero2;
        int fin = 0;
        System.out.println("Introduce un numero");
        numero1 = inputValue.nextInt();
        System.out.println("introduce otro numero");
        numero2 = inputValue.nextInt();
        inputValue.close();

        for (int i = 0; i < numero2; i++){
            fin += numero1;
        }

        System.out.println("El resultado de la multiplicacion es: " + fin);

    }
}


