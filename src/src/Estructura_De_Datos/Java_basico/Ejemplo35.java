//Restas Sucesivas
import java.util.Scanner;

public class Ejemplo35 {
    public static void main(String[] args) {
        Scanner inputValue = new Scanner(System.in);
        int numero1;
        int numero2;
        System.out.println("Introduce un numero");
        numero1 = inputValue.nextInt();
        System.out.println("introduce otro numero");
        numero2 = inputValue.nextInt();
        inputValue.close();

        for (int i = numero1; i >= numero2; i -= numero2){
             numero1 -= numero2;
        }

        System.out.println("El residuo de la division es: " + numero1);

    }
}


