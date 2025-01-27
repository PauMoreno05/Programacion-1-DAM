//Diseña un algoritmo que lea un valor y muestre si es positivo o negativo (0 es positivo)

import java.util.Scanner;

public class Ejemplo10 {
    public static void main(String[] args) {
        Scanner inputValue = new Scanner(System.in);

        System.out.println("Introduce un numero");
        double numero = inputValue.nextDouble();

        if (numero >= 0) {
            System.out.println("Es un numero positivo");

        } else {
            System.out.println("es un numero negativo");

        }
    }
}