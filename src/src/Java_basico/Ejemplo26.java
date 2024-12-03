//tabla de multiplicar
import java.util.Scanner;

public class Ejemplo26 {
    public static void main(String[] args) {
        Scanner inputValue = new Scanner(System.in);
        int contador = 1;
        System.out.println("Introduce un numero");
        int numero = inputValue.nextInt();


        for (int i = 0; i <= 10; i++) {
            System.out.println(numero +  " x " + i + " = " +  numero * i );
        }


    }
}
